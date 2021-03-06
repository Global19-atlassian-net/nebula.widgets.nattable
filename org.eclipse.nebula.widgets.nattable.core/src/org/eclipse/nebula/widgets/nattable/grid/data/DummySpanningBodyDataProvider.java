/*******************************************************************************
 * Copyright (c) 2012, 2020 Original authors and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Original authors and others - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.grid.data;

import org.eclipse.nebula.widgets.nattable.data.ISpanningDataProvider;
import org.eclipse.nebula.widgets.nattable.layer.cell.DataCell;

public class DummySpanningBodyDataProvider extends DummyBodyDataProvider implements ISpanningDataProvider {

    private static final int BLOCK_SIZE = 4;

    private static final int CELL_SPAN = 2;

    public DummySpanningBodyDataProvider(int columnCount, int rowCount) {
        super(columnCount, rowCount);
    }

    @Override
    public DataCell getCellByPosition(int columnPosition, int rowPosition) {
        int columnBlock = columnPosition / BLOCK_SIZE;
        int rowBlock = rowPosition / BLOCK_SIZE;

        boolean isSpanned = isEven(columnBlock + rowBlock)
                && (columnPosition % BLOCK_SIZE) < CELL_SPAN
                && (rowPosition % BLOCK_SIZE) < CELL_SPAN;
        int columnSpan = isSpanned ? CELL_SPAN : 1;
        int rowSpan = isSpanned ? CELL_SPAN : 1;

        int cellColumnPosition = columnPosition;
        int cellRowPosition = rowPosition;

        if (isSpanned) {
            cellColumnPosition -= columnPosition % BLOCK_SIZE;
            cellRowPosition -= rowPosition % BLOCK_SIZE;
        }

        return new DataCell(cellColumnPosition, cellRowPosition, columnSpan,
                rowSpan);
    }

    private boolean isEven(int i) {
        return i % 2 == 0;
    }

}

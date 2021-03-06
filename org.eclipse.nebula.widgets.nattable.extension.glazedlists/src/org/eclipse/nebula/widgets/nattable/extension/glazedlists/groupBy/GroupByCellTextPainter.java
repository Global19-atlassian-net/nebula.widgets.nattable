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
package org.eclipse.nebula.widgets.nattable.extension.glazedlists.groupBy;

import org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell;
import org.eclipse.nebula.widgets.nattable.painter.cell.TextPainter;
import org.eclipse.nebula.widgets.nattable.tree.TreeLayer;
import org.eclipse.swt.graphics.GC;

/**
 * Specialized TextPainter that is used for grouping rows. It will only render
 * text in the tree column and in columns that contain group by summary values.
 * <p>
 * Extracted to a separate class to be able to create theme configurations where
 * you are able to wrap this painter easily, instead of creating similar inner
 * classes all the time.
 * </p>
 */
public class GroupByCellTextPainter extends TextPainter {

    @Override
    protected String getTextToDisplay(ILayerCell cell, GC gc,
            int availableLength, String text) {
        if (cell.getConfigLabels().hasLabel(TreeLayer.TREE_COLUMN_CELL)
                || cell.getConfigLabels().hasLabel(
                        GroupByDataLayer.GROUP_BY_SUMMARY)) {
            return super.getTextToDisplay(cell, gc, availableLength, text);
        } else {
            return ""; //$NON-NLS-1$
        }
    }

}

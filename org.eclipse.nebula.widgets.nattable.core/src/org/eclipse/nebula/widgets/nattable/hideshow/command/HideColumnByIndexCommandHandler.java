/*******************************************************************************
 * Copyright (c) 2020 Original authors and others.
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
package org.eclipse.nebula.widgets.nattable.hideshow.command;

import org.eclipse.nebula.widgets.nattable.command.AbstractLayerCommandHandler;
import org.eclipse.nebula.widgets.nattable.command.ILayerCommandHandler;
import org.eclipse.nebula.widgets.nattable.hideshow.IColumnHideShowLayer;

/**
 * {@link ILayerCommandHandler} for the {@link HideColumnByIndexCommand}. Hides
 * columns identified by index via {@link IColumnHideShowLayer}.
 *
 * @since 2.0
 */
public class HideColumnByIndexCommandHandler extends AbstractLayerCommandHandler<HideColumnByIndexCommand> {

    private final IColumnHideShowLayer columnHideShowLayer;

    /**
     *
     * @param columnHideShowLayer
     *            The {@link IColumnHideShowLayer} on which this command handler
     *            should operate.
     */
    public HideColumnByIndexCommandHandler(IColumnHideShowLayer columnHideShowLayer) {
        this.columnHideShowLayer = columnHideShowLayer;
    }

    @Override
    public Class<HideColumnByIndexCommand> getCommandClass() {
        return HideColumnByIndexCommand.class;
    }

    @Override
    protected boolean doCommand(HideColumnByIndexCommand command) {
        this.columnHideShowLayer.hideColumnIndexes(command.getColumnIndexes());
        return true;
    }

}

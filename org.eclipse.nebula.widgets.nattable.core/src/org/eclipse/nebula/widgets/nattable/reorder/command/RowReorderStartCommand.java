/*******************************************************************************
 * Copyright (c) 2013, 2020 Dirk Fauth and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Dirk Fauth <dirk.fauth@googlemail.com> - initial API and implementation
 *******************************************************************************/
package org.eclipse.nebula.widgets.nattable.reorder.command;

import org.eclipse.nebula.widgets.nattable.command.ILayerCommand;
import org.eclipse.nebula.widgets.nattable.command.LayerCommandUtil;
import org.eclipse.nebula.widgets.nattable.coordinate.RowPositionCoordinate;
import org.eclipse.nebula.widgets.nattable.layer.ILayer;

/**
 * Command to start row reordering. Will transport the position of the row that
 * will be reordered via dragging.
 */
public class RowReorderStartCommand implements ILayerCommand {

    /**
     * The coordinate of the row that should be reordered
     */
    private RowPositionCoordinate fromRowPositionCoordinate;

    /**
     *
     * @param layer
     *            The layer the position is related to
     * @param fromRowPosition
     *            The position of the row that should be reordered
     */
    public RowReorderStartCommand(ILayer layer, int fromRowPosition) {
        this.fromRowPositionCoordinate = new RowPositionCoordinate(layer, fromRowPosition);
    }

    /**
     * Constructor used for cloning purposes
     *
     * @param command
     *            The command which is base for the new one
     */
    protected RowReorderStartCommand(RowReorderStartCommand command) {
        this.fromRowPositionCoordinate = command.fromRowPositionCoordinate;
    }

    /**
     * @return The position of the row that should be reordered
     */
    public int getFromRowPosition() {
        return this.fromRowPositionCoordinate.getRowPosition();
    }

    @Override
    public boolean convertToTargetLayer(ILayer targetLayer) {
        RowPositionCoordinate targetFromRowPositionCoordinate =
                LayerCommandUtil.convertRowPositionToTargetContext(this.fromRowPositionCoordinate, targetLayer);
        if (targetFromRowPositionCoordinate != null) {
            this.fromRowPositionCoordinate = targetFromRowPositionCoordinate;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public RowReorderStartCommand cloneCommand() {
        return new RowReorderStartCommand(this);
    }

}

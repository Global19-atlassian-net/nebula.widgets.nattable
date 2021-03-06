/*******************************************************************************
 * Copyright (c) 2014, 2020 Roman Flueckiger.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Roman Flueckiger <roman.flueckiger@mac.com> - Bug 451486
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.ui.menu;

import org.eclipse.nebula.widgets.nattable.selection.SelectionLayer;
import org.eclipse.nebula.widgets.nattable.ui.NatEventData;

/**
 * This {@link IMenuItemState} is active if
 * <ul>
 * <li>less columns are selected than are visible in total</li>
 * <li>and more than one column is visible.</li>
 * </ul>
 */
public class VisibleColumnsRemaining implements IMenuItemState {

    private final SelectionLayer selectionLayer;

    /**
     * A {@link IMenuItemState} that is active if not all columns are selected
     * and more than one column is visible.
     *
     * @param selectionLayer
     *            the selection layer used to check for total visible and
     *            selected columns.
     */
    public VisibleColumnsRemaining(SelectionLayer selectionLayer) {
        if (selectionLayer == null) {
            throw new IllegalArgumentException("selectionLayer must not be null."); //$NON-NLS-1$
        }
        this.selectionLayer = selectionLayer;
    }

    @Override
    public boolean isActive(NatEventData natEventData) {
        int[] selectedColumnPositions = this.selectionLayer.getSelectedColumnPositions();
        if (selectedColumnPositions.length >= this.selectionLayer.getColumnCount()
                || this.selectionLayer.getColumnCount() < 2) {

            return false;
        }
        return true;
    }

}

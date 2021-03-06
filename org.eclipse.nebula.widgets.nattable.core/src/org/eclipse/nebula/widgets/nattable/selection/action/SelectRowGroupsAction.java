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
package org.eclipse.nebula.widgets.nattable.selection.action;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.selection.command.SelectRowGroupsCommand;
import org.eclipse.swt.events.MouseEvent;

public class SelectRowGroupsAction extends AbstractMouseSelectionAction {

    @Override
    public void run(NatTable natTable, MouseEvent event) {
        super.run(natTable, event);
        natTable.doCommand(
                new SelectRowGroupsCommand(
                        natTable,
                        getGridColumnPosition(),
                        getGridRowPosition(),
                        isWithShiftMask(),
                        isWithControlMask()));
    }

}

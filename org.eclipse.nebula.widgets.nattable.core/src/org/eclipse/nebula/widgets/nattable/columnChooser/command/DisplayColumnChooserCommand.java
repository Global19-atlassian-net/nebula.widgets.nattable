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
package org.eclipse.nebula.widgets.nattable.columnChooser.command;

import org.eclipse.nebula.widgets.nattable.NatTable;
import org.eclipse.nebula.widgets.nattable.command.AbstractContextFreeCommand;

public class DisplayColumnChooserCommand extends AbstractContextFreeCommand {

    private final NatTable natTable;

    public DisplayColumnChooserCommand(NatTable natTable) {
        this.natTable = natTable;
    }

    public NatTable getNatTable() {
        return this.natTable;
    }

}

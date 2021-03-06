/*******************************************************************************
 * Copyright (c) 2017, 2020 Original authors and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Thanh Liem PHAN (ALL4TEC) <thanhliem.phan@all4tec.net> - Bug 509361
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.export.command;

import org.eclipse.nebula.widgets.nattable.command.AbstractContextFreeCommand;
import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.swt.widgets.Shell;

/**
 * Command to export a NatTable.
 *
 * @since 1.5
 */
public class ExportTableCommand extends AbstractContextFreeCommand {

    private IConfigRegistry configRegistry;
    private Shell shell;

    public ExportTableCommand(IConfigRegistry configRegistry, Shell shell) {
        this.configRegistry = configRegistry;
        this.shell = shell;
    }

    public IConfigRegistry getConfigRegistry() {
        return this.configRegistry;
    }

    public Shell getShell() {
        return this.shell;
    }
}

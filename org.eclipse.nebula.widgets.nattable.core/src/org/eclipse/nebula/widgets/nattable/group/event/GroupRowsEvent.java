/*******************************************************************************
 * Copyright (c) 2019, 2020 Dirk Fauth.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dirk Fauth <dirk.fauth@googlemail.com> - initial API and implementation
 ******************************************************************************/
package org.eclipse.nebula.widgets.nattable.group.event;

import org.eclipse.nebula.widgets.nattable.layer.ILayer;
import org.eclipse.nebula.widgets.nattable.layer.event.VisualRefreshEvent;

/**
 * Event to inform about a created row group.
 *
 * @since 1.6
 */
public class GroupRowsEvent extends VisualRefreshEvent {

    public GroupRowsEvent(ILayer layer) {
        super(layer);
    }

    protected GroupRowsEvent(GroupRowsEvent event) {
        super(event);
    }

    @Override
    public GroupRowsEvent cloneEvent() {
        return new GroupRowsEvent(this);
    }

}

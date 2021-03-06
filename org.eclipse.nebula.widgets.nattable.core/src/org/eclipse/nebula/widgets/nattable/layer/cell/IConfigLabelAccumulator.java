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
package org.eclipse.nebula.widgets.nattable.layer.cell;

import org.eclipse.nebula.widgets.nattable.config.IConfigRegistry;
import org.eclipse.nebula.widgets.nattable.layer.LabelStack;

/**
 * Resolves the configuration/config label(s) which are tied to a given cell.
 * Various attributes can be registered in the {@link IConfigRegistry} against
 * this label
 */
public interface IConfigLabelAccumulator {

    /**
     * Add labels applicable to this cell position
     *
     * @param configLabels
     *            the labels currently applied to the cell. The labels
     *            contributed by this provider must be <i>added</i> to this
     *            stack
     * @param columnPosition
     *            of the cell for which labels are being gathered
     * @param rowPosition
     *            of the cell for which labels are being gathered
     */
    public void accumulateConfigLabels(LabelStack configLabels,
            int columnPosition, int rowPosition);

}

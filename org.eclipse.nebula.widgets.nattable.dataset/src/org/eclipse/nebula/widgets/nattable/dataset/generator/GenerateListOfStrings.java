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
package org.eclipse.nebula.widgets.nattable.dataset.generator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface GenerateListOfStrings {

    String[] values();

    /**
     * Will add this number of nulls into the list to enable nulls to be
     * generated with the weighting given (eg adding 6 nulls to a list of 6
     * strings ought to produce nulls 50% of the time). Default is zero ie no
     * nulls.
     *
     * @return the number of nulls to generate
     */
    int nullLoadFactor() default 0;

}

/* Copyright 2010, Object Management Group, Inc.
 * Copyright 2010, PrismTech, Inc.
 * Copyright 2010, Real-Time Innovations, Inc.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.omg.dds.type.builtin;

import java.io.Serializable;

import org.omg.dds.core.DDSObject;
import org.omg.dds.core.ServiceEnvironment;

public abstract class KeyedBytes implements Cloneable, Serializable, DDSObject
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 2666227708313407807L;

    public static KeyedBytes newKeyedBytes(ServiceEnvironment env)
    {
        return env.getSPI().newKeyedBytes();
    }

	
	/**
     * @return the key
     */
    public abstract String getKey();

    /**
     * @param key the key to set
     * 
     * @return  this
     */
    public abstract KeyedBytes setKey(CharSequence key);

    /**
     * @return the value
     */
    public abstract byte[] getValue();

    /**
     * @param value the value to set
     * 
     * @return  this
     */
    public abstract KeyedBytes setValue(byte value[]);

    /**
     * @param value the value to set
     * 
     * @return  this
     */
    public abstract KeyedBytes setValue(byte value[], int offset, int length);


    // -----------------------------------------------------------------------

    /**
     * Overwrite the state of this object with that of the given object.
     */
    public abstract void copyFrom(KeyedBytes src);

    public abstract KeyedBytes clone();
}

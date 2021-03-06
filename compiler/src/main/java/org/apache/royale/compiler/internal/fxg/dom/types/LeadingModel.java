/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.royale.compiler.internal.fxg.dom.types;

/**
 * The LeadingModel class.
 * 
 * <pre>
 *   0 = auto
 *   1 = romanUp
 *   2 = ideographicTopUp
 *   3 = ascentDescentUp
 *   4 = ideographicTopDown
 *   5 = ideographicCenterDown
 *   6 = approximateTextField
 * </pre>
 */
public enum LeadingModel
{
    /**
     * The enum representing an 'auto' LeadingModel.
     */
    AUTO,

    /**
     * The enum representing an 'romanUp' LeadingModel.
     */    
    ROMANUP,
    
    /**
     * The enum representing an 'ideographicTopUp' LeadingModel.
     */
    IDEOGRAPHICTOPUP,  
    
    /**
     * The enum representing an 'ideographicCenterUp' LeadingModel.
     */
    IDEOGRAPHICCENTERUP,      
    
    /**
     * The enum representing an 'ascentDescentUp' LeadingModel.
     */
    ASCENTDESCENTUP,
    
    /**
     * The enum representing an 'ideographicTopDown' LeadingModel.
     */
    IDEOGRAPHICTOPDOWN,  
    
    /**
     * The enum representing an 'ideographicCenterDown' LeadingModel.
     */
    IDEOGRAPHICCENTERDOWN,
    
    /**
     * The enum representing an 'approximateTextField' LeadingModel.
     */
    APPROXIMATETEXTFIELD;
}

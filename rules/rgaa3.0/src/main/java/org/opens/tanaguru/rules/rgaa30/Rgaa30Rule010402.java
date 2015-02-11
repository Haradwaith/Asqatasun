/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */

package org.opens.tanaguru.rules.rgaa30;

import org.opens.tanaguru.ruleimplementation.AbstractNotTestedRuleImplementation;

/**
 * Implementation of the rule 1.4.2 of the referential Rgaa 3.0.
 * <br/>
 * For more details about the implementation, refer to <a href="https://github.com/Tanaguru/Tanaguru-rules-RGAA-3-doc/wiki/Rule-1-4-2">the rule 1.4.2 design page.</a>
 * @see <a href="https://references.modernisation.gouv.fr/sites/default/files/RGAA3/referentiel_technique.htm#test-1-4-2"> 1.4.2 rule specification</a>
 *
 */
public class Rgaa30Rule010402 extends AbstractNotTestedRuleImplementation {

    /**
     * Default constructor
     */
    public Rgaa30Rule010402 () {
        super();
    }  

//extends AbstractDetectionPageRuleImplementation {
//    
//    /**
//     * Default constructor
//     */
//    public Rgaa30Rule010402 () {
//        super(
//                new CaptchaElementSelector(
//                    new AreaElementSelector(true, false, true)),
//                // solution when at least one element is found
//                TestSolution.NEED_MORE_INFO,
//                // solution when no element is found
//                TestSolution.NOT_APPLICABLE,
//                // manual check message
//                CHECK_CAPTCHA_ALTERNATIVE_MSG,
//                null,
//                // evidence elements
//                ALT_ATTR, 
//                HREF_ATTR
//            );
//    }

}

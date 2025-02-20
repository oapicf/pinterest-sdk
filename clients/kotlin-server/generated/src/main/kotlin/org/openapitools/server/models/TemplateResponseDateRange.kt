/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.TemplateResponseDateRangeAbsoluteDateRange
import org.openapitools.server.models.TemplateResponseDateRangeDynamicDateRange
import org.openapitools.server.models.TemplateResponseDateRangeRelativeDateRange

/**
 * 
 * @param dynamicDateRange 
 * @param relativeDateRange 
 * @param absoluteDateRange 
 */
data class TemplateResponseDateRange(
    val dynamicDateRange: TemplateResponseDateRangeDynamicDateRange? = null,
    val relativeDateRange: TemplateResponseDateRangeRelativeDateRange? = null,
    val absoluteDateRange: TemplateResponseDateRangeAbsoluteDateRange? = null
) 


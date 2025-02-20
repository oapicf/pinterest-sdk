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
package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceCategory
import org.openapitools.server.api.model.AudienceDemographics
import org.openapitools.server.api.model.AudienceInsightType

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * Audience interests and demographics.
 * @param categories Category interest distribution
 * @param demographics 
 * @param type 
 * @param date Generation date
 * @param propertySize Population count.
 * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class AudienceInsightsResponse (
    /* Category interest distribution */
    val categories: kotlin.Array<AudienceCategory>? = null,
    val demographics: AudienceDemographics? = null,
    val type: AudienceInsightType? = AudienceInsightType.YOUR_TOTAL_AUDIENCE,
    /* Generation date */
    val date: kotlin.String? = null,
    /* Population count. */
    val propertySize: kotlin.Int? = null,
    /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
    val sizeIsUpperBound: kotlin.Boolean? = null
) {

}


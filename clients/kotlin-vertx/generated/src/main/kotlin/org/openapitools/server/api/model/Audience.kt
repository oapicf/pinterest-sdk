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

import org.openapitools.server.api.model.AudienceRule

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param adAccountId Ad account ID.
 * @param id Audience ID.
 * @param name Audience name.
 * @param audienceType <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR
 * @param description Audience description.
 * @param rule 
 * @param propertySize Audience size.
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it.
 * @param type Always \"audience\".
 * @param createdTimestamp Creation time. Unix timestamp in seconds.
 * @param updatedTimestamp Last update time. Unix timestamp in seconds.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class Audience (
    /* Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /* Audience ID. */
    val id: kotlin.String? = null,
    /* Audience name. */
    val name: kotlin.String? = null,
    /* <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    val audienceType: kotlin.String? = null,
    /* Audience description. */
    val description: kotlin.String? = null,
    val rule: AudienceRule? = null,
    /* Audience size. */
    val propertySize: kotlin.Int? = null,
    /* Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
    val status: kotlin.String? = null,
    /* Always \"audience\". */
    val type: kotlin.String? = null,
    /* Creation time. Unix timestamp in seconds. */
    val createdTimestamp: kotlin.Int? = null,
    /* Last update time. Unix timestamp in seconds. */
    val updatedTimestamp: kotlin.Int? = null
) {

}


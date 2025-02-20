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

import org.openapitools.server.models.MatchTypeResponse

/**
 * 
 * @param matchType 
 * @param `value` Keyword value (120 chars max).
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @param archived 
 * @param id Keyword ID .
 * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
 * @param parentType Parent entity type
 * @param type Always keyword
 */
data class Keyword(
    val matchType: MatchTypeResponse,
    /* Keyword value (120 chars max). */
    val `value`: kotlin.String,
    /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null,
    val archived: kotlin.Boolean? = null,
    /* Keyword ID . */
    val id: kotlin.String? = null,
    /* Keyword parent entity ID (advertiser, campaign, ad group). */
    val parentId: kotlin.String? = null,
    /* Parent entity type */
    val parentType: kotlin.String? = null,
    /* Always keyword */
    val type: kotlin.String? = null
) 


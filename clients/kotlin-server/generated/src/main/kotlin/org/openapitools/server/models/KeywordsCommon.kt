/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
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
 * @param bid Keyword custom bid in microcurrency - null if inherited from parent ad group.
 */
data class KeywordsCommon(
    val matchType: MatchTypeResponse,
    /* Keyword value (120 chars max). */
    val `value`: kotlin.String,
    /* Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    val bid: kotlin.Int? = null
) 

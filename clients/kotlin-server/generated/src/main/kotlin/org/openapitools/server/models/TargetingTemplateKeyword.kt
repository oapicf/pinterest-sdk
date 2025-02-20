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

import org.openapitools.server.models.MatchType

/**
 * 
 * @param matchType 
 * @param `value` The keyword targeting (120 chars max).
 */
data class TargetingTemplateKeyword(
    val matchType: MatchType? = null,
    /* The keyword targeting (120 chars max). */
    val `value`: kotlin.String? = null
) 


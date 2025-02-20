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

import org.openapitools.server.models.UserSummary

/**
 * 
 * @param items Users
 * @param bookmark 
 */
data class UserFollowingGet200Response(
    /* Users */
    val items: kotlin.collections.List<UserSummary>,
    val bookmark: kotlin.String? = null
) 


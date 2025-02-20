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

import org.openapitools.server.models.UserBusinessRoleBinding

/**
 * 
 * @param items List of business partners.
 * @param bookmark 
 */
data class GetBusinessPartners200Response(
    /* List of business partners. */
    val items: kotlin.collections.List<UserBusinessRoleBinding>,
    val bookmark: kotlin.String? = null
) 


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


/**
 * 
 * @param partnerIds 
 * @param partnerType 
 */
data class DeletePartnersRequest(
    val partnerIds: kotlin.collections.List<kotlin.String>,
    val partnerType: kotlin.String? = null
) 


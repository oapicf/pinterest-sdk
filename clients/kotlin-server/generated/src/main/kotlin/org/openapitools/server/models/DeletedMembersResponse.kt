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
 * An object with a list of members that were deleted.
 * @param deletedMembers List of members whose business membership have been terminated.
 */
data class DeletedMembersResponse(
    /* List of members whose business membership have been terminated. */
    val deletedMembers: kotlin.collections.List<kotlin.String>? = null
) 


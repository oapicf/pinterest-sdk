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
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 * @param inviteOrRequestId Unique identifier of the invite/request.
 * @param code Error code associated with the error in performing the action on the invite/request.
 * @param message Error message associated with the error in performing the action on the invite/request.
 * @param usersOrPartnerIds A list of users' usernames or emails OR a list of partner ids that caused the error.
 */
data class InviteExceptionResponse(
    /* Unique identifier of the invite/request. */
    val inviteOrRequestId: kotlin.String? = null,
    /* Error code associated with the error in performing the action on the invite/request. */
    val code: kotlin.Int? = null,
    /* Error message associated with the error in performing the action on the invite/request. */
    val message: kotlin.String? = null,
    /* A list of users' usernames or emails OR a list of partner ids that caused the error. */
    val usersOrPartnerIds: kotlin.collections.List<kotlin.String>? = null
) 


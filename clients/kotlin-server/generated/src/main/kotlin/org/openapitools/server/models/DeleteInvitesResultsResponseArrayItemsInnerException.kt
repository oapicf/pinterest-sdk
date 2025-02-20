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
 * An exception object if there is an error performing the cancellation. It will only be provided if there is an error.
 * @param inviteId Unique identifier of an invite.
 * @param message Error message associated with the error in performing the action on the invite/request.
 */
data class DeleteInvitesResultsResponseArrayItemsInnerException(
    /* Unique identifier of an invite. */
    val inviteId: kotlin.String? = null,
    /* Error message associated with the error in performing the action on the invite/request. */
    val message: kotlin.String? = null
) 


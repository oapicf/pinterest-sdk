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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 * @param inviteOrRequestId Unique identifier of the invite/request.
 * @param code Error code associated with the error in performing the action on the invite/request.
 * @param message Error message associated with the error in performing the action on the invite/request.
 * @param usersOrPartnerIds A list of users' usernames or emails OR a list of partner ids that caused the error.
 */
object InviteExceptionResponses : BaseTable<InviteExceptionResponse>("InviteExceptionResponse") {
    val inviteOrRequestId = text("invite_or_request_id") /* null */ /* Unique identifier of the invite/request. */
    val code = int("code") /* null */ /* Error code associated with the error in performing the action on the invite/request. */
    val message = text("message") /* null */ /* Error message associated with the error in performing the action on the invite/request. */

    /**
     * Create an entity of type InviteExceptionResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = InviteExceptionResponse(
        inviteOrRequestId = row[inviteOrRequestId]  /* kotlin.String? */ /* Unique identifier of the invite/request. */,
        code = row[code]  /* kotlin.Int? */ /* Error code associated with the error in performing the action on the invite/request. */,
        message = row[message]  /* kotlin.String? */ /* Error message associated with the error in performing the action on the invite/request. */,
        usersOrPartnerIds = emptyList() /* kotlin.Array<kotlin.String>? */ /* A list of users' usernames or emails OR a list of partner ids that caused the error. */
    )

    /**
    * Assign all the columns from the entity of type InviteExceptionResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = InviteExceptionResponse()
    * database.update(InviteExceptionResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: InviteExceptionResponse) {
        this.apply {
            set(InviteExceptionResponses.inviteOrRequestId, entity.inviteOrRequestId)
            set(InviteExceptionResponses.code, entity.code)
            set(InviteExceptionResponses.message, entity.message)
        }
    }

}


object InviteExceptionResponseUsersOrPartnerIds : BaseTable<Pair<kotlin.Long, kotlin.String>>("InviteExceptionResponseUsersOrPartnerIds") {
    val inviteExceptionResponse = long("inviteExceptionResponse")
    val usersOrPartnerIds = text("usersOrPartnerIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[inviteExceptionResponse] ?: 0, row[usersOrPartnerIds] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(InviteExceptionResponseUsersOrPartnerIds.inviteExceptionResponse, entity.first)
            set(InviteExceptionResponseUsersOrPartnerIds.usersOrPartnerIds, entity.second)
        }
    }

}


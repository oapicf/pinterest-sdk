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
 * 
 * @param exception 
 * @param invite 
 */
object RespondToInvitesResponseArrayItemsInners : BaseTable<RespondToInvitesResponseArrayItemsInner>("RespondToInvitesResponseArray_items_inner") {
    val exception = long("exception") /* null */
    val invite = long("invite") /* null */

    /**
     * Create an entity of type RespondToInvitesResponseArrayItemsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = RespondToInvitesResponseArrayItemsInner(
        exception = InviteExceptionResponses.createEntity(row, withReferences) /* InviteExceptionResponse? */,
        invite = BaseInviteDataResponses.createEntity(row, withReferences) /* BaseInviteDataResponse? */
    )

    /**
    * Assign all the columns from the entity of type RespondToInvitesResponseArrayItemsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = RespondToInvitesResponseArrayItemsInner()
    * database.update(RespondToInvitesResponseArrayItemsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: RespondToInvitesResponseArrayItemsInner) {
        this.apply {
            set(RespondToInvitesResponseArrayItemsInners.exception, entity.exception)
            set(RespondToInvitesResponseArrayItemsInners.invite, entity.invite)
        }
    }

}



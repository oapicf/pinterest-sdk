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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param items 
 * @param bookmark 
 */
object UserAccountFollowedInterests200Responses : BaseTable<UserAccountFollowedInterests200Response>("user_account_followed_interests_200_response") {
    val bookmark = text("bookmark") /* null */

    /**
     * Create an entity of type UserAccountFollowedInterests200Response from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UserAccountFollowedInterests200Response(
        items = emptyList() /* kotlin.Array<Interest> */,
        bookmark = row[bookmark]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type UserAccountFollowedInterests200Response to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UserAccountFollowedInterests200Response()
    * database.update(UserAccountFollowedInterests200Responses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UserAccountFollowedInterests200Response) {
        this.apply {
            set(UserAccountFollowedInterests200Responses.bookmark, entity.bookmark)
        }
    }

}


object UserAccountFollowedInterests200ResponseInterest : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UserAccountFollowedInterests200ResponseInterest") {
    val userAccountFollowedInterests200Response = long("userAccountFollowedInterests200Response")
    val interest = long("interest")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[userAccountFollowedInterests200Response] ?: 0, row[interest] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UserAccountFollowedInterests200ResponseInterest.userAccountFollowedInterests200Response, entity.first)
            set(UserAccountFollowedInterests200ResponseInterest.interest, entity.second)
        }
    }

}

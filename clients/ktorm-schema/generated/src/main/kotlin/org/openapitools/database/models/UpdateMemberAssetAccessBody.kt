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
 * An object with a list of all the new accesses.
 * @param accesses 
 */
object UpdateMemberAssetAccessBodys : BaseTable<UpdateMemberAssetAccessBody>("UpdateMemberAssetAccessBody") {

    /**
     * Create an entity of type UpdateMemberAssetAccessBody from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateMemberAssetAccessBody(
        accesses = emptyList() /* kotlin.Array<UpdateMemberAssetAccessBodyAccessesInner> */
    )

    /**
    * Assign all the columns from the entity of type UpdateMemberAssetAccessBody to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateMemberAssetAccessBody()
    * database.update(UpdateMemberAssetAccessBodys, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateMemberAssetAccessBody) {
        this.apply {
        }
    }

}


object UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner") {
    val updateMemberAssetAccessBody = long("updateMemberAssetAccessBody")
    val updateMemberAssetAccessBodyAccessesInner = long("updateMemberAssetAccessBodyAccessesInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updateMemberAssetAccessBody] ?: 0, row[updateMemberAssetAccessBodyAccessesInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner.updateMemberAssetAccessBody, entity.first)
            set(UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner.updateMemberAssetAccessBodyAccessesInner, entity.second)
        }
    }

}


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
 * @param accesses 
 */
object UpdatePartnerAssetAccessBodys : BaseTable<UpdatePartnerAssetAccessBody>("UpdatePartnerAssetAccessBody") {

    /**
     * Create an entity of type UpdatePartnerAssetAccessBody from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdatePartnerAssetAccessBody(
        accesses = emptyList() /* kotlin.Array<UpdatePartnerAssetAccessBodyAccessesInner> */
    )

    /**
    * Assign all the columns from the entity of type UpdatePartnerAssetAccessBody to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdatePartnerAssetAccessBody()
    * database.update(UpdatePartnerAssetAccessBodys, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdatePartnerAssetAccessBody) {
        this.apply {
        }
    }

}


object UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner") {
    val updatePartnerAssetAccessBody = long("updatePartnerAssetAccessBody")
    val updatePartnerAssetAccessBodyAccessesInner = long("updatePartnerAssetAccessBodyAccessesInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updatePartnerAssetAccessBody] ?: 0, row[updatePartnerAssetAccessBodyAccessesInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner.updatePartnerAssetAccessBody, entity.first)
            set(UpdatePartnerAssetAccessBodyUpdatePartnerAssetAccessBodyAccessesInner.updatePartnerAssetAccessBodyAccessesInner, entity.second)
        }
    }

}


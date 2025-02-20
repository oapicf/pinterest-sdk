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
 * @param id Keyword ID.
 * @param archived Is keyword archived?
 * @param bid </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 */
object KeywordUpdates : BaseTable<KeywordUpdate>("KeywordUpdate") {
    val id = text("id") /* Keyword ID. */
    val archived = boolean("archived") /* null */ /* Is keyword archived? */
    val bid = int("bid") /* null */ /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */

    /**
     * Create an entity of type KeywordUpdate from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = KeywordUpdate(
        id = row[id] ?: "" /* kotlin.String */ /* Keyword ID. */,
        archived = row[archived]  /* kotlin.Boolean? */ /* Is keyword archived? */,
        bid = row[bid]  /* kotlin.Int? */ /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
    )

    /**
    * Assign all the columns from the entity of type KeywordUpdate to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = KeywordUpdate()
    * database.update(KeywordUpdates, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: KeywordUpdate) {
        this.apply {
            set(KeywordUpdates.id, entity.id)
            set(KeywordUpdates.archived, entity.archived)
            set(KeywordUpdates.bid, entity.bid)
        }
    }

}



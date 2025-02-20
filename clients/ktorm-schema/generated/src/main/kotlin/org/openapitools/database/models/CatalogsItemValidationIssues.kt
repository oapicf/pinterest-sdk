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
 * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * @param itemId The merchant-created unique ID that represents the product.
 * @param errors 
 * @param warnings 
 */
object CatalogsItemValidationIssuess : BaseTable<CatalogsItemValidationIssues>("CatalogsItemValidationIssues") {
    val itemNumber = int("item_number") /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */
    val itemId = text("item_id") /* The merchant-created unique ID that represents the product. */
    val errors = long("errors")
    val warnings = long("warnings")

    /**
     * Create an entity of type CatalogsItemValidationIssues from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsItemValidationIssues(
        itemNumber = row[itemNumber] ?: 0 /* kotlin.Int */ /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */,
        itemId = row[itemId] ?: "" /* kotlin.String */ /* The merchant-created unique ID that represents the product. */,
        errors = CatalogsItemValidationErrorss.createEntity(row, withReferences) /* CatalogsItemValidationErrors */,
        warnings = CatalogsItemValidationWarningss.createEntity(row, withReferences) /* CatalogsItemValidationWarnings */
    )

    /**
    * Assign all the columns from the entity of type CatalogsItemValidationIssues to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsItemValidationIssues()
    * database.update(CatalogsItemValidationIssuess, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsItemValidationIssues) {
        this.apply {
            set(CatalogsItemValidationIssuess.itemNumber, entity.itemNumber)
            set(CatalogsItemValidationIssuess.itemId, entity.itemId)
            set(CatalogsItemValidationIssuess.errors, entity.errors)
            set(CatalogsItemValidationIssuess.warnings, entity.warnings)
        }
    }

}



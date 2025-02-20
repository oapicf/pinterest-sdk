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
 * @param GOOGLE_PRODUCT_CATEGORY_6 
 */
object GoogleProductCategory6Filters : BaseTable<GoogleProductCategory6Filter>("GoogleProductCategory6Filter") {
    val GOOGLE_PRODUCT_CATEGORY_6 = long("GOOGLE_PRODUCT_CATEGORY_6")

    /**
     * Create an entity of type GoogleProductCategory6Filter from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = GoogleProductCategory6Filter(
        GOOGLE_PRODUCT_CATEGORY_6 = CatalogsProductGroupMultipleStringListCriterias.createEntity(row, withReferences) /* CatalogsProductGroupMultipleStringListCriteria */
    )

    /**
    * Assign all the columns from the entity of type GoogleProductCategory6Filter to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = GoogleProductCategory6Filter()
    * database.update(GoogleProductCategory6Filters, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: GoogleProductCategory6Filter) {
        this.apply {
            set(GoogleProductCategory6Filters.GOOGLE_PRODUCT_CATEGORY_6, entity.GOOGLE_PRODUCT_CATEGORY_6)
        }
    }

}



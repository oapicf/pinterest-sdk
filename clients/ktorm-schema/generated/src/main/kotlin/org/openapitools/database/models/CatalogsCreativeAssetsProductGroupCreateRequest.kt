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
 * Request object for creating a creative assets product group.
 * @param catalogType 
 * @param name 
 * @param filters 
 * @param catalogId Catalog id pertaining to the creative assets product group.
 * @param description 
 */
object CatalogsCreativeAssetsProductGroupCreateRequests : BaseTable<CatalogsCreativeAssetsProductGroupCreateRequest>("CatalogsCreativeAssetsProductGroupCreateRequest") {
    val catalogType = text("catalog_type").transform({ CatalogsCreativeAssetsProductGroupCreateRequest.CatalogType.valueOf(it) }, { it.value })
    val name = text("name")
    val filters = long("filters")
    val catalogId = text("catalog_id") /* Catalog id pertaining to the creative assets product group. */
    val description = text("description") /* null */

    /**
     * Create an entity of type CatalogsCreativeAssetsProductGroupCreateRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsCreativeAssetsProductGroupCreateRequest(
        catalogType = row[catalogType] ?: CatalogsCreativeAssetsProductGroupCreateRequest.CatalogType.valueOf("") /* kotlin.String */,
        name = row[name] ?: "" /* kotlin.String */,
        filters = CatalogsCreativeAssetsProductGroupFilterss.createEntity(row, withReferences) /* CatalogsCreativeAssetsProductGroupFilters */,
        catalogId = row[catalogId] ?: "" /* kotlin.String */ /* Catalog id pertaining to the creative assets product group. */,
        description = row[description]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type CatalogsCreativeAssetsProductGroupCreateRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsCreativeAssetsProductGroupCreateRequest()
    * database.update(CatalogsCreativeAssetsProductGroupCreateRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsCreativeAssetsProductGroupCreateRequest) {
        this.apply {
            set(CatalogsCreativeAssetsProductGroupCreateRequests.catalogType, entity.catalogType)
            set(CatalogsCreativeAssetsProductGroupCreateRequests.name, entity.name)
            set(CatalogsCreativeAssetsProductGroupCreateRequests.filters, entity.filters)
            set(CatalogsCreativeAssetsProductGroupCreateRequests.catalogId, entity.catalogId)
            set(CatalogsCreativeAssetsProductGroupCreateRequests.description, entity.description)
        }
    }

}



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
 * Retail product metadata entity
 * @param itemId The user-created unique ID that represents the product.
 * @param itemGroupId The parent ID of the product.
 * @param availability 
 * @param price The price of the product.
 * @param salePrice The discounted price of the product.
 * @param currency 
 */
object CatalogsRetailProductMetadatas : BaseTable<CatalogsRetailProductMetadata>("CatalogsRetailProductMetadata") {
    val itemId = text("item_id") /* The user-created unique ID that represents the product. */
    val itemGroupId = text("item_group_id") /* The parent ID of the product. */
    val availability = long("availability")
    val price = decimal("price") /* The price of the product. */
    val salePrice = decimal("sale_price") /* The discounted price of the product. */
    val currency = long("currency")

    /**
     * Create an entity of type CatalogsRetailProductMetadata from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsRetailProductMetadata(
        itemId = row[itemId] ?: "" /* kotlin.String */ /* The user-created unique ID that represents the product. */,
        itemGroupId = row[itemGroupId] ?: "" /* kotlin.String */ /* The parent ID of the product. */,
        availability = NonNullableProductAvailabilityTypes.createEntity(row, withReferences) /* NonNullableProductAvailabilityType */,
        price = row[price] ?: 0 /* java.math.BigDecimal */ /* The price of the product. */,
        salePrice = row[salePrice] ?: 0 /* java.math.BigDecimal */ /* The discounted price of the product. */,
        currency = NonNullableCatalogsCurrencys.createEntity(row, withReferences) /* NonNullableCatalogsCurrency */
    )

    /**
    * Assign all the columns from the entity of type CatalogsRetailProductMetadata to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsRetailProductMetadata()
    * database.update(CatalogsRetailProductMetadatas, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsRetailProductMetadata) {
        this.apply {
            set(CatalogsRetailProductMetadatas.itemId, entity.itemId)
            set(CatalogsRetailProductMetadatas.itemGroupId, entity.itemGroupId)
            set(CatalogsRetailProductMetadatas.availability, entity.availability)
            set(CatalogsRetailProductMetadatas.price, entity.price)
            set(CatalogsRetailProductMetadatas.salePrice, entity.salePrice)
            set(CatalogsRetailProductMetadatas.currency, entity.currency)
        }
    }

}



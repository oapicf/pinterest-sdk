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
 * @param id ID of the product group promotion.
 * @param adGroupId ID of the ad group the product group belongs to.
 * @param bidInMicroCurrency The bid in micro currency.
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @param definition The full product group definition path
 * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair
 * @param parentId The parent Product Group ID of this Product Group
 * @param slideshowCollectionsTitle Slideshow Collections Title
 * @param slideshowCollectionsDescription Slideshow Collections Description
 * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @param status 
 * @param trackingUrl Tracking template for proudct group promotions. 4000 limit
 * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references
 * @param catalogProductGroupName Catalogs product group name
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url
 * @param gridClickType 
 * @param creativeType 
 */
object ProductGroupPromotionCreateRequestElements : BaseTable<ProductGroupPromotionCreateRequestElement>("ProductGroupPromotionCreateRequestElement") {
    val id = text("id") /* null */ /* ID of the product group promotion. */
    val adGroupId = text("ad_group_id") /* null */ /* ID of the ad group the product group belongs to. */
    val bidInMicroCurrency = int("bid_in_micro_currency") /* null */ /* The bid in micro currency. */
    val included = boolean("included") /* null */ /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    val definition = text("definition") /* null */ /* The full product group definition path */
    val relativeDefinition = text("relative_definition") /* null */ /* The definition of the product group, relative to its parent - an attribute name/value pair */
    val parentId = text("parent_id") /* null */ /* The parent Product Group ID of this Product Group */
    val slideshowCollectionsTitle = text("slideshow_collections_title") /* null */ /* Slideshow Collections Title */
    val slideshowCollectionsDescription = text("slideshow_collections_description") /* null */ /* Slideshow Collections Description */
    val isMdl = boolean("is_mdl") /* null */ /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    val status = long("status") /* null */
    val trackingUrl = text("tracking_url") /* null */ /* Tracking template for proudct group promotions. 4000 limit */
    val catalogProductGroupId = text("catalog_product_group_id") /* null */ /* ID of the catalogs product group that this product group promotion references */
    val catalogProductGroupName = text("catalog_product_group_name") /* null */ /* Catalogs product group name */
    val collectionsHeroPinId = text("collections_hero_pin_id") /* null */ /* Hero Pin ID if this PG is promoted as a Collection */
    val collectionsHeroDestinationUrl = text("collections_hero_destination_url") /* null */ /* Collections Hero Destination Url */
    val gridClickType = long("grid_click_type") /* null */
    val creativeType = long("creative_type") /* null */

    /**
     * Create an entity of type ProductGroupPromotionCreateRequestElement from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ProductGroupPromotionCreateRequestElement(
        id = row[id]  /* kotlin.String? */ /* ID of the product group promotion. */,
        adGroupId = row[adGroupId]  /* kotlin.String? */ /* ID of the ad group the product group belongs to. */,
        bidInMicroCurrency = row[bidInMicroCurrency]  /* kotlin.Int? */ /* The bid in micro currency. */,
        included = row[included]  /* kotlin.Boolean? */ /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */,
        definition = row[definition]  /* kotlin.String? */ /* The full product group definition path */,
        relativeDefinition = row[relativeDefinition]  /* kotlin.String? */ /* The definition of the product group, relative to its parent - an attribute name/value pair */,
        parentId = row[parentId]  /* kotlin.String? */ /* The parent Product Group ID of this Product Group */,
        slideshowCollectionsTitle = row[slideshowCollectionsTitle]  /* kotlin.String? */ /* Slideshow Collections Title */,
        slideshowCollectionsDescription = row[slideshowCollectionsDescription]  /* kotlin.String? */ /* Slideshow Collections Description */,
        isMdl = row[isMdl]  /* kotlin.Boolean? */ /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */,
        status = EntityStatuss.createEntity(row, withReferences) /* EntityStatus? */,
        trackingUrl = row[trackingUrl]  /* kotlin.String? */ /* Tracking template for proudct group promotions. 4000 limit */,
        catalogProductGroupId = row[catalogProductGroupId]  /* kotlin.String? */ /* ID of the catalogs product group that this product group promotion references */,
        catalogProductGroupName = row[catalogProductGroupName]  /* kotlin.String? */ /* Catalogs product group name */,
        collectionsHeroPinId = row[collectionsHeroPinId]  /* kotlin.String? */ /* Hero Pin ID if this PG is promoted as a Collection */,
        collectionsHeroDestinationUrl = row[collectionsHeroDestinationUrl]  /* kotlin.String? */ /* Collections Hero Destination Url */,
        gridClickType = GridClickTypes.createEntity(row, withReferences) /* GridClickType? */,
        creativeType = CreativeTypes.createEntity(row, withReferences) /* CreativeType? */
    )

    /**
    * Assign all the columns from the entity of type ProductGroupPromotionCreateRequestElement to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ProductGroupPromotionCreateRequestElement()
    * database.update(ProductGroupPromotionCreateRequestElements, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ProductGroupPromotionCreateRequestElement) {
        this.apply {
            set(ProductGroupPromotionCreateRequestElements.id, entity.id)
            set(ProductGroupPromotionCreateRequestElements.adGroupId, entity.adGroupId)
            set(ProductGroupPromotionCreateRequestElements.bidInMicroCurrency, entity.bidInMicroCurrency)
            set(ProductGroupPromotionCreateRequestElements.included, entity.included)
            set(ProductGroupPromotionCreateRequestElements.definition, entity.definition)
            set(ProductGroupPromotionCreateRequestElements.relativeDefinition, entity.relativeDefinition)
            set(ProductGroupPromotionCreateRequestElements.parentId, entity.parentId)
            set(ProductGroupPromotionCreateRequestElements.slideshowCollectionsTitle, entity.slideshowCollectionsTitle)
            set(ProductGroupPromotionCreateRequestElements.slideshowCollectionsDescription, entity.slideshowCollectionsDescription)
            set(ProductGroupPromotionCreateRequestElements.isMdl, entity.isMdl)
            set(ProductGroupPromotionCreateRequestElements.status, entity.status)
            set(ProductGroupPromotionCreateRequestElements.trackingUrl, entity.trackingUrl)
            set(ProductGroupPromotionCreateRequestElements.catalogProductGroupId, entity.catalogProductGroupId)
            set(ProductGroupPromotionCreateRequestElements.catalogProductGroupName, entity.catalogProductGroupName)
            set(ProductGroupPromotionCreateRequestElements.collectionsHeroPinId, entity.collectionsHeroPinId)
            set(ProductGroupPromotionCreateRequestElements.collectionsHeroDestinationUrl, entity.collectionsHeroDestinationUrl)
            set(ProductGroupPromotionCreateRequestElements.gridClickType, entity.gridClickType)
            set(ProductGroupPromotionCreateRequestElements.creativeType, entity.creativeType)
        }
    }

}



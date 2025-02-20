/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.CreativeType
import org.openapitools.client.models.EntityStatus
import org.openapitools.client.models.GridClickType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
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


data class ProductGroupPromotionCreateRequestElement (

    /* ID of the product group promotion. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* ID of the ad group the product group belongs to. */
    @Json(name = "ad_group_id")
    val adGroupId: kotlin.String? = null,

    /* The bid in micro currency. */
    @Json(name = "bid_in_micro_currency")
    val bidInMicroCurrency: kotlin.Int? = null,

    /* True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    @Json(name = "included")
    val included: kotlin.Boolean? = null,

    /* The full product group definition path */
    @Json(name = "definition")
    val definition: kotlin.String? = null,

    /* The definition of the product group, relative to its parent - an attribute name/value pair */
    @Json(name = "relative_definition")
    val relativeDefinition: kotlin.String? = null,

    /* The parent Product Group ID of this Product Group */
    @Json(name = "parent_id")
    val parentId: kotlin.String? = null,

    /* Slideshow Collections Title */
    @Json(name = "slideshow_collections_title")
    val slideshowCollectionsTitle: kotlin.String? = null,

    /* Slideshow Collections Description */
    @Json(name = "slideshow_collections_description")
    val slideshowCollectionsDescription: kotlin.String? = null,

    /* If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    @Json(name = "is_mdl")
    val isMdl: kotlin.Boolean? = null,

    @Json(name = "status")
    val status: EntityStatus? = null,

    /* Tracking template for proudct group promotions. 4000 limit */
    @Json(name = "tracking_url")
    val trackingUrl: kotlin.String? = null,

    /* ID of the catalogs product group that this product group promotion references */
    @Json(name = "catalog_product_group_id")
    val catalogProductGroupId: kotlin.String? = null,

    /* Catalogs product group name */
    @Json(name = "catalog_product_group_name")
    val catalogProductGroupName: kotlin.String? = null,

    /* Hero Pin ID if this PG is promoted as a Collection */
    @Json(name = "collections_hero_pin_id")
    val collectionsHeroPinId: kotlin.String? = null,

    /* Collections Hero Destination Url */
    @Json(name = "collections_hero_destination_url")
    val collectionsHeroDestinationUrl: kotlin.String? = null,

    @Json(name = "grid_click_type")
    val gridClickType: GridClickType? = null,

    @Json(name = "creative_type")
    val creativeType: CreativeType? = null

) {


}


package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreativeType
import org.openapitools.model.EntityStatus
import org.openapitools.model.GridClickType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

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
 * @param creativeType 
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url
 * @param gridClickType 
 */
data class ProductGroupPromotion(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "ID of the product group promotion.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "2680059592705", description = "ID of the ad group the product group belongs to.")
    @get:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @Schema(example = "14000000", description = "The bid in micro currency.")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @Schema(example = "true", description = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
    @get:JsonProperty("included") val included: kotlin.Boolean? = null,

    @Schema(example = "*/product_type_0='kitchen'/product_type_1='beverage appliances'", description = "The full product group definition path")
    @get:JsonProperty("definition") val definition: kotlin.String? = null,

    @Schema(example = "product_type_1='beverage appliances'", description = "The definition of the product group, relative to its parent - an attribute name/value pair")
    @get:JsonProperty("relative_definition") val relativeDefinition: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1231234", description = "The parent Product Group ID of this Product Group")
    @get:JsonProperty("parent_id") val parentId: kotlin.String? = null,

    @Schema(example = "slideshow title", description = "Slideshow Collections Title")
    @get:JsonProperty("slideshow_collections_title") val slideshowCollectionsTitle: kotlin.String? = null,

    @Schema(example = "slideshow description", description = "Slideshow Collections Description")
    @get:JsonProperty("slideshow_collections_description") val slideshowCollectionsDescription: kotlin.String? = null,

    @Schema(example = "true", description = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
    @get:JsonProperty("is_mdl") val isMdl: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @Schema(example = "https://www.pinterest.com", description = "Tracking template for proudct group promotions. 4000 limit")
    @get:JsonProperty("tracking_url") val trackingUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1231235", description = "ID of the catalogs product group that this product group promotion references")
    @get:JsonProperty("catalog_product_group_id") val catalogProductGroupId: kotlin.String? = null,

    @Schema(example = "catalogProductGroupName", description = "Catalogs product group name")
    @get:JsonProperty("catalog_product_group_name") val catalogProductGroupName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "123123", description = "Hero Pin ID if this PG is promoted as a Collection")
    @get:JsonProperty("collections_hero_pin_id") val collectionsHeroPinId: kotlin.String? = null,

    @Schema(example = "http://www.pinterest.com", description = "Collections Hero Destination Url")
    @get:JsonProperty("collections_hero_destination_url") val collectionsHeroDestinationUrl: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null
) {

}


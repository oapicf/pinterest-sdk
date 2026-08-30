package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CollectionsHeaderType
import org.openapitools.model.CreativeType
import org.openapitools.model.EntityStatus
import org.openapitools.model.GridClickType
import org.openapitools.model.PreferredMediaType
import org.openapitools.model.ProductGroupPromotionCustomizableCTAType
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
 * @param adGroupId ID of the ad group the product group belongs to.
 * @param bidInMicroCurrency The bid in micro currency.
 * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references (required for create operations)
 * @param catalogProductGroupName Catalogs product group name
 * @param collectionsHeaderType 
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
 * @param creativeType 
 * @param customizableCtaType 
 * @param definition The full product group definition path
 * @param gridClickType 
 * @param id ID of the product group promotion (required for update operations).
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
 * @param isImageAutoResizing Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
 * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @param parentId The parent Product Group ID of this Product Group
 * @param preferredMediaType 
 * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair
 * @param selectedImageTag The ad image tag selected for the product group promotion.
 * @param selectedVideoTag The ad video tag selected for the product group promotion.
 * @param slideshowCollectionsDescription Slideshow Collections Description
 * @param slideshowCollectionsTitle Slideshow Collections Title
 * @param status 
 * @param trackingUrl Tracking template for proudct group promotions. 4000 limit
 */
data class ProductGroupPromotion(

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "2680059592705", description = "ID of the ad group the product group belongs to.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @Schema(example = "14000000", description = "The bid in micro currency.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bid_in_micro_currency")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1231235", description = "ID of the catalogs product group that this product group promotion references (required for create operations)")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_product_group_id")
    @get:JsonProperty("catalog_product_group_id") val catalogProductGroupId: kotlin.String? = null,

    @Schema(example = "catalogProductGroupName", description = "Catalogs product group name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_product_group_name")
    @get:JsonProperty("catalog_product_group_name") val catalogProductGroupName: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("collections_header_type")
    @get:JsonProperty("collections_header_type") val collectionsHeaderType: CollectionsHeaderType? = null,

    @Schema(example = "http://www.pinterest.com", description = "Collections Hero Destination Url")
    @param:JsonProperty("collections_hero_destination_url")
    @get:JsonProperty("collections_hero_destination_url") val collectionsHeroDestinationUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "123123", description = "Hero Pin ID if this PG is promoted as a Collection")
    @param:JsonProperty("collections_hero_pin_id")
    @get:JsonProperty("collections_hero_pin_id") val collectionsHeroPinId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("creative_type")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("customizable_cta_type")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: ProductGroupPromotionCustomizableCTAType? = null,

    @Schema(example = "*/product_type_0='kitchen'/product_type_1='beverage appliances'", description = "The full product group definition path")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("definition")
    @get:JsonProperty("definition") val definition: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("grid_click_type")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "ID of the product group promotion (required for update operations).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "true", description = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("included")
    @get:JsonProperty("included") val included: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.")
    @param:JsonProperty("is_generate_background")
    @get:JsonProperty("is_generate_background") val isGenerateBackground: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.")
    @param:JsonProperty("is_image_auto_resizing")
    @get:JsonProperty("is_image_auto_resizing") val isImageAutoResizing: kotlin.Boolean? = null,

    @Schema(example = "true", description = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_mdl")
    @get:JsonProperty("is_mdl") val isMdl: kotlin.Boolean? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1231234", description = "The parent Product Group ID of this Product Group")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("parent_id")
    @get:JsonProperty("parent_id") val parentId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("preferred_media_type")
    @get:JsonProperty("preferred_media_type") val preferredMediaType: PreferredMediaType? = null,

    @Schema(example = "product_type_1='beverage appliances'", description = "The definition of the product group, relative to its parent - an attribute name/value pair")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("relative_definition")
    @get:JsonProperty("relative_definition") val relativeDefinition: kotlin.String? = null,

    @Schema(example = "holiday_sale", description = "The ad image tag selected for the product group promotion.")
    @param:JsonProperty("selected_image_tag")
    @get:JsonProperty("selected_image_tag") val selectedImageTag: kotlin.String? = null,

    @Schema(example = "holiday_sale", description = "The ad video tag selected for the product group promotion.")
    @param:JsonProperty("selected_video_tag")
    @get:JsonProperty("selected_video_tag") val selectedVideoTag: kotlin.String? = null,

    @Schema(example = "slideshow description", description = "Slideshow Collections Description")
    @param:JsonProperty("slideshow_collections_description")
    @get:JsonProperty("slideshow_collections_description") val slideshowCollectionsDescription: kotlin.String? = null,

    @Schema(example = "slideshow title", description = "Slideshow Collections Title")
    @param:JsonProperty("slideshow_collections_title")
    @get:JsonProperty("slideshow_collections_title") val slideshowCollectionsTitle: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @Schema(example = "https://www.pinterest.com", description = "Tracking template for proudct group promotions. 4000 limit")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("tracking_url")
    @get:JsonProperty("tracking_url") val trackingUrl: kotlin.String? = null
) {

}


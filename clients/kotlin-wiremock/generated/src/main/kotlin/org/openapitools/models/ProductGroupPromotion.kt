@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductGroupPromotion(
    @field:JsonProperty("ad_group_id")
    val adGroupId: kotlin.String? = null,

    @field:JsonProperty("bid_in_micro_currency")
    val bidInMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("catalog_product_group_id")
    val catalogProductGroupId: kotlin.String? = null,

    @field:JsonProperty("catalog_product_group_name")
    val catalogProductGroupName: kotlin.String? = null,

    @field:JsonProperty("collections_header_type")
    val collectionsHeaderType: CollectionsHeaderType? = null,

    @field:JsonProperty("collections_hero_destination_url")
    val collectionsHeroDestinationUrl: kotlin.String? = null,

    @field:JsonProperty("collections_hero_pin_id")
    val collectionsHeroPinId: kotlin.String? = null,

    @field:JsonProperty("creative_type")
    val creativeType: CreativeType? = null,

    @field:JsonProperty("customizable_cta_type")
    val customizableCtaType: ProductGroupPromotionCustomizableCTAType? = null,

    @field:JsonProperty("definition")
    val definition: kotlin.String? = null,

    @field:JsonProperty("grid_click_type")
    val gridClickType: GridClickType? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("included")
    val included: kotlin.Boolean? = null,

    @field:JsonProperty("is_generate_background")
    val isGenerateBackground: kotlin.Boolean? = null,

    @field:JsonProperty("is_image_auto_resizing")
    val isImageAutoResizing: kotlin.Boolean? = null,

    @field:JsonProperty("is_mdl")
    val isMdl: kotlin.Boolean? = null,

    @field:JsonProperty("parent_id")
    val parentId: kotlin.String? = null,

    @field:JsonProperty("preferred_media_type")
    val preferredMediaType: PreferredMediaType? = null,

    @field:JsonProperty("relative_definition")
    val relativeDefinition: kotlin.String? = null,

    @field:JsonProperty("selected_image_tag")
    val selectedImageTag: kotlin.String? = null,

    @field:JsonProperty("selected_video_tag")
    val selectedVideoTag: kotlin.String? = null,

    @field:JsonProperty("slideshow_collections_description")
    val slideshowCollectionsDescription: kotlin.String? = null,

    @field:JsonProperty("slideshow_collections_title")
    val slideshowCollectionsTitle: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

    @field:JsonProperty("tracking_url")
    val trackingUrl: kotlin.String? = null,

)

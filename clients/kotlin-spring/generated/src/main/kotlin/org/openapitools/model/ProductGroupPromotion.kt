package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
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
 * @param adGroupId ID of the ad group the product group belongs to.
 * @param bidInMicroCurrency The bid in micro currency.
 * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references
 * @param catalogProductGroupName Catalogs product group name
 * @param collectionsHeaderType Collections ad header type
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
 * @param creativeType 
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 * @param definition The full product group definition path
 * @param gridClickType 
 * @param id ID of the product group promotion.
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
 * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @param parentId The parent Product Group ID of this Product Group
 * @param preferredMediaType Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
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
    @get:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @Schema(example = "14000000", description = "The bid in micro currency.")
    @get:JsonProperty("bid_in_micro_currency") val bidInMicroCurrency: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1231235", description = "ID of the catalogs product group that this product group promotion references")
    @get:JsonProperty("catalog_product_group_id") val catalogProductGroupId: kotlin.String? = null,

    @Schema(example = "catalogProductGroupName", description = "Catalogs product group name")
    @get:JsonProperty("catalog_product_group_name") val catalogProductGroupName: kotlin.String? = null,

    @Schema(example = "SHOP_THIS_COLLECTION", description = "Collections ad header type")
    @get:JsonProperty("collections_header_type") val collectionsHeaderType: ProductGroupPromotion.CollectionsHeaderType? = null,

    @Schema(example = "http://www.pinterest.com", description = "Collections Hero Destination Url")
    @get:JsonProperty("collections_hero_destination_url") val collectionsHeroDestinationUrl: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "123123", description = "Hero Pin ID if this PG is promoted as a Collection")
    @get:JsonProperty("collections_hero_pin_id") val collectionsHeroPinId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @Schema(example = "SHOP_NOW", description = "Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: ProductGroupPromotion.CustomizableCtaType? = null,

    @Schema(example = "*/product_type_0='kitchen'/product_type_1='beverage appliances'", description = "The full product group definition path")
    @get:JsonProperty("definition") val definition: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "ID of the product group promotion.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "true", description = "True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.")
    @get:JsonProperty("included") val included: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.")
    @get:JsonProperty("is_generate_background") val isGenerateBackground: kotlin.Boolean? = null,

    @Schema(example = "true", description = "If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog")
    @get:JsonProperty("is_mdl") val isMdl: kotlin.Boolean? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1231234", description = "The parent Product Group ID of this Product Group")
    @get:JsonProperty("parent_id") val parentId: kotlin.String? = null,

    @Schema(example = "VIDEO", description = "Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.")
    @get:JsonProperty("preferred_media_type") val preferredMediaType: ProductGroupPromotion.PreferredMediaType? = null,

    @Schema(example = "product_type_1='beverage appliances'", description = "The definition of the product group, relative to its parent - an attribute name/value pair")
    @get:JsonProperty("relative_definition") val relativeDefinition: kotlin.String? = null,

    @Schema(example = "holiday_sale", description = "The ad image tag selected for the product group promotion.")
    @get:JsonProperty("selected_image_tag") val selectedImageTag: kotlin.String? = null,

    @Schema(example = "holiday_sale", description = "The ad video tag selected for the product group promotion.")
    @get:JsonProperty("selected_video_tag") val selectedVideoTag: kotlin.String? = null,

    @Schema(example = "slideshow description", description = "Slideshow Collections Description")
    @get:JsonProperty("slideshow_collections_description") val slideshowCollectionsDescription: kotlin.String? = null,

    @Schema(example = "slideshow title", description = "Slideshow Collections Title")
    @get:JsonProperty("slideshow_collections_title") val slideshowCollectionsTitle: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @Schema(example = "https://www.pinterest.com", description = "Tracking template for proudct group promotions. 4000 limit")
    @get:JsonProperty("tracking_url") val trackingUrl: kotlin.String? = null
) {

    /**
    * Collections ad header type
    * Values: SHOP_THIS_COLLECTION,EXPLORE_THIS_COLLECTION,NO_HEADER,ON_SALE,GET_DEAL
    */
    enum class CollectionsHeaderType(@get:JsonValue val value: kotlin.String) {

        SHOP_THIS_COLLECTION("SHOP_THIS_COLLECTION"),
        EXPLORE_THIS_COLLECTION("EXPLORE_THIS_COLLECTION"),
        NO_HEADER("NO_HEADER"),
        ON_SALE("ON_SALE"),
        GET_DEAL("GET_DEAL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CollectionsHeaderType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductGroupPromotion'")
            }
        }
    }

    /**
    * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
    * Values: SHOP_NOW,BOOK_NOW,ON_SALE,GET_DEAL,BUY_ONLINE_PICKUP_IN_STORE
    */
    enum class CustomizableCtaType(@get:JsonValue val value: kotlin.String) {

        SHOP_NOW("SHOP_NOW"),
        BOOK_NOW("BOOK_NOW"),
        ON_SALE("ON_SALE"),
        GET_DEAL("GET_DEAL"),
        BUY_ONLINE_PICKUP_IN_STORE("BUY_ONLINE_PICKUP_IN_STORE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CustomizableCtaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductGroupPromotion'")
            }
        }
    }

    /**
    * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
    * Values: VIDEO,IMAGE
    */
    enum class PreferredMediaType(@get:JsonValue val value: kotlin.String) {

        VIDEO("VIDEO"),
        IMAGE("IMAGE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PreferredMediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ProductGroupPromotion'")
            }
        }
    }

}


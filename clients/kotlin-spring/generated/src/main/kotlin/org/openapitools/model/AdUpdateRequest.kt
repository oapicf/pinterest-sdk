package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdCommonQuizPinData
import org.openapitools.model.AdCommonTrackingUrls
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
 * @param id The ID of this ad.
 * @param adGroupId ID of the ad group that contains the ad.
 * @param androidDeepLink Deep link URL for Android devices. Not currently available. Using this field will generate an error.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param creativeType 
 * @param destinationUrl Destination URL.
 * @param iosDeepLink Deep link URL for iOS devices. Not currently available. Using this field will generate an error.
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param name Name of the ad - 255 chars max.
 * @param status 
 * @param trackingUrls 
 * @param viewTrackingUrl Tracking URL for ad impressions.
 * @param leadFormId Lead form ID for lead ad generation.
 * @param gridClickType 
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 * @param quizPinData 
 * @param pinId Pin ID. This field may only be updated for draft ads.
 */
data class AdUpdateRequest(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "687195134316", required = true, description = "The ID of this ad.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "2680059592705", description = "ID of the ad group that contains the ad.")
    @get:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @Schema(example = "null", description = "Deep link URL for Android devices. Not currently available. Using this field will generate an error.")
    @get:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @Schema(example = "null", description = "Comma-separated deep links for the carousel pin on Android.")
    @get:JsonProperty("carousel_android_deep_links") val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Comma-separated destination URLs for the carousel pin to promote.")
    @get:JsonProperty("carousel_destination_urls") val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Comma-separated deep links for the carousel pin on iOS.")
    @get:JsonProperty("carousel_ios_deep_links") val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Tracking url for the ad clicks.")
    @get:JsonProperty("click_tracking_url") val clickTrackingUrl: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @Schema(example = "null", description = "Destination URL.")
    @get:JsonProperty("destination_url") val destinationUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Deep link URL for iOS devices. Not currently available. Using this field will generate an error.")
    @get:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @Schema(example = "false", description = "Is original pin deleted?")
    @get:JsonProperty("is_pin_deleted") val isPinDeleted: kotlin.Boolean? = null,

    @Schema(example = "false", description = "Is pin repinnable?")
    @get:JsonProperty("is_removable") val isRemovable: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Name of the ad - 255 chars max.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tracking_urls") val trackingUrls: AdCommonTrackingUrls? = null,

    @Schema(example = "null", description = "Tracking URL for ad impressions.")
    @get:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "null", description = "Lead form ID for lead ad generation.")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null,

    @Schema(example = "LEARN_MORE", description = "Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: AdUpdateRequest.CustomizableCtaType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("quiz_pin_data") val quizPinData: AdCommonQuizPinData? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "394205773611545468", description = "Pin ID. This field may only be updated for draft ads.")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null
) {

    /**
    * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_WEBSITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
    * Values: GET_OFFER,LEARN_MORE,ORDER_NOW,SHOP_NOW,SIGN_UP,SUBSCRIBE,BUY_NOW,CONTACT_US,GET_QUOTE,VISIT_WEBSITE,APPLY_NOW,BOOK_NOW,REQUEST_DEMO,REGISTER_NOW,FIND_A_DEALER,ADD_TO_CART,WATCH_NOW,READ_MORE,`null`
    */
    enum class CustomizableCtaType(val value: kotlin.String) {

        @JsonProperty("GET_OFFER") GET_OFFER("GET_OFFER"),
        @JsonProperty("LEARN_MORE") LEARN_MORE("LEARN_MORE"),
        @JsonProperty("ORDER_NOW") ORDER_NOW("ORDER_NOW"),
        @JsonProperty("SHOP_NOW") SHOP_NOW("SHOP_NOW"),
        @JsonProperty("SIGN_UP") SIGN_UP("SIGN_UP"),
        @JsonProperty("SUBSCRIBE") SUBSCRIBE("SUBSCRIBE"),
        @JsonProperty("BUY_NOW") BUY_NOW("BUY_NOW"),
        @JsonProperty("CONTACT_US") CONTACT_US("CONTACT_US"),
        @JsonProperty("GET_QUOTE") GET_QUOTE("GET_QUOTE"),
        @JsonProperty("VISIT_WEBSITE") VISIT_WEBSITE("VISIT_WEBSITE"),
        @JsonProperty("APPLY_NOW") APPLY_NOW("APPLY_NOW"),
        @JsonProperty("BOOK_NOW") BOOK_NOW("BOOK_NOW"),
        @JsonProperty("REQUEST_DEMO") REQUEST_DEMO("REQUEST_DEMO"),
        @JsonProperty("REGISTER_NOW") REGISTER_NOW("REGISTER_NOW"),
        @JsonProperty("FIND_A_DEALER") FIND_A_DEALER("FIND_A_DEALER"),
        @JsonProperty("ADD_TO_CART") ADD_TO_CART("ADD_TO_CART"),
        @JsonProperty("WATCH_NOW") WATCH_NOW("WATCH_NOW"),
        @JsonProperty("READ_MORE") READ_MORE("READ_MORE"),
        @JsonProperty("null") `null`("null")
    }

}


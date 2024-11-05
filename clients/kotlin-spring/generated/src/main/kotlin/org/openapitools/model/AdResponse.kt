package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreativeType
import org.openapitools.model.EntityStatus
import org.openapitools.model.GridClickType
import org.openapitools.model.PinPromotionSummaryStatus
import org.openapitools.model.QuizPinData
import org.openapitools.model.TrackingUrls
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
 * @param adGroupId ID of the ad group that contains the ad.
 * @param androidDeepLink Deep link URL for Android devices.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param creativeType 
 * @param destinationUrl Destination URL.
 * @param iosDeepLink Deep link URL for iOS devices.
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param name Name of the ad - 255 chars max.
 * @param status 
 * @param trackingUrls 
 * @param viewTrackingUrl Tracking URL for ad impressions.
 * @param leadFormId Lead form ID for lead ad generation.
 * @param gridClickType 
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param pinId Pin ID.
 * @param adAccountId The ID of the advertiser that this ad belongs to.
 * @param campaignId ID of the ad campaign that contains this ad.
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
 * @param createdTime Pin creation time. Unix timestamp in seconds.
 * @param id The ID of this ad.
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param rejectionLabels Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
 * @param reviewStatus Ad review status
 * @param type Always \"ad\".
 * @param updatedTime Last update time. Unix timestamp in seconds.
 * @param summaryStatus Ad summary status
 */
data class AdResponse(

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "2680059592705", description = "ID of the ad group that contains the ad.")
    @get:JsonProperty("ad_group_id") val adGroupId: kotlin.String? = null,

    @Schema(example = "null", description = "Deep link URL for Android devices.")
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

    @Schema(example = "null", description = "Deep link URL for iOS devices.")
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
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @Schema(example = "null", description = "Tracking URL for ad impressions.")
    @get:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "null", description = "Lead form ID for lead ad generation.")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null,

    @Schema(example = "LEARN_MORE", description = "Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: AdResponse.CustomizableCtaType? = null,

    @field:Valid
    @Schema(example = "null", description = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
    @get:JsonProperty("quiz_pin_data") val quizPinData: QuizPinData? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "394205773611545468", description = "Pin ID.")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "The ID of the advertiser that this ad belongs to.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "626735565838", description = "ID of the ad campaign that contains this ad.")
    @get:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @Schema(example = "null", description = "Destination URL template for all items within a collections drawer.")
    @get:JsonProperty("collection_items_destination_url_template") val collectionItemsDestinationUrlTemplate: kotlin.String? = null,

    @Schema(example = "1451431341", description = "Pin creation time. Unix timestamp in seconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "687195134316", description = "The ID of this ad.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
    @get:JsonProperty("rejected_reasons") val rejectedReasons: kotlin.collections.List<AdResponse.RejectedReasons>? = null,

    @Schema(example = "null", description = "Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".")
    @get:JsonProperty("rejection_labels") val rejectionLabels: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "PENDING", description = "Ad review status")
    @get:JsonProperty("review_status") val reviewStatus: AdResponse.ReviewStatus? = null,

    @Schema(example = "pinpromotion", description = "Always \"ad\".")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "1451431341", description = "Last update time. Unix timestamp in seconds.")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "Ad summary status")
    @get:JsonProperty("summary_status") val summaryStatus: PinPromotionSummaryStatus? = null
    ) {

    /**
    * Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
    * Values: GET_OFFER,LEARN_MORE,ORDER_NOW,SHOP_NOW,SIGN_UP,SUBSCRIBE,BUY_NOW,CONTACT_US,GET_QUOTE,VISIT_SITE,APPLY_NOW,BOOK_NOW,REQUEST_DEMO,REGISTER_NOW,FIND_A_DEALER,ADD_TO_CART,WATCH_NOW,READ_MORE
    */
    enum class CustomizableCtaType(@get:JsonValue val value: kotlin.String) {

        GET_OFFER("GET_OFFER"),
        LEARN_MORE("LEARN_MORE"),
        ORDER_NOW("ORDER_NOW"),
        SHOP_NOW("SHOP_NOW"),
        SIGN_UP("SIGN_UP"),
        SUBSCRIBE("SUBSCRIBE"),
        BUY_NOW("BUY_NOW"),
        CONTACT_US("CONTACT_US"),
        GET_QUOTE("GET_QUOTE"),
        VISIT_SITE("VISIT_SITE"),
        APPLY_NOW("APPLY_NOW"),
        BOOK_NOW("BOOK_NOW"),
        REQUEST_DEMO("REQUEST_DEMO"),
        REGISTER_NOW("REGISTER_NOW"),
        FIND_A_DEALER("FIND_A_DEALER"),
        ADD_TO_CART("ADD_TO_CART"),
        WATCH_NOW("WATCH_NOW"),
        READ_MORE("READ_MORE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CustomizableCtaType {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    * Values: HASHTAGS,PROMOTIONS_AND_PRICES,TARGETING,LANDING_PAGE,CAPS_AND_SYMBOLS,SHOCKING,WEIGHT_LOSS,PROHIBITED_PRODUCT,AUTHENTICITY,NUDITY,CONFUSING_DESIGN,URGENCY,RATINGS,APP,ALCOHOL,CONTESTS,POLITICAL,OTHER,IMAGE,NAR,INCONSISTENT,CLICKBAIT,NO_DESCRIPTION,LOW_QUALITY,EXAGGERATED_CLAIMS,PINTEREST_BRAND,ALCOHOL_NO_SALE,LANDING_PAGE_SPEED,LANDING_PAGE_HARDWALL,LANDING_PAGE_BROKEN,LANDING_PAGE_QUALITY,OUT_OF_STOCK,IMAGE_LOW_QUALITY,IMAGE_BUSY,IMAGE_POORLY_EDITED,IMAGE_BEFORE_AFTER,UGC,FAKE_BUTTONS,WEAPONS,SENSITIVE,UNACCEPTABLE_BUSINESS,SUSPICIOUS_CLAIMS,PHARMA,SUSPICIOUS_SUPPLEMENTS,ILLEGAL_RECREATIONAL_DRUG,LOW_QUALITY_LANDING_PAGE,RESTRICTED_HEALTHCARE,INCONSISTENT_LANG_FR
    */
    enum class RejectedReasons(@get:JsonValue val value: kotlin.String) {

        HASHTAGS("HASHTAGS"),
        PROMOTIONS_AND_PRICES("PROMOTIONS_AND_PRICES"),
        TARGETING("TARGETING"),
        LANDING_PAGE("LANDING_PAGE"),
        CAPS_AND_SYMBOLS("CAPS_AND_SYMBOLS"),
        SHOCKING("SHOCKING"),
        WEIGHT_LOSS("WEIGHT_LOSS"),
        PROHIBITED_PRODUCT("PROHIBITED_PRODUCT"),
        AUTHENTICITY("AUTHENTICITY"),
        NUDITY("NUDITY"),
        CONFUSING_DESIGN("CONFUSING_DESIGN"),
        URGENCY("URGENCY"),
        RATINGS("RATINGS"),
        APP("APP"),
        ALCOHOL("ALCOHOL"),
        CONTESTS("CONTESTS"),
        POLITICAL("POLITICAL"),
        OTHER("OTHER"),
        IMAGE("IMAGE"),
        NAR("NAR"),
        INCONSISTENT("INCONSISTENT"),
        CLICKBAIT("CLICKBAIT"),
        NO_DESCRIPTION("NO_DESCRIPTION"),
        LOW_QUALITY("LOW_QUALITY"),
        EXAGGERATED_CLAIMS("EXAGGERATED_CLAIMS"),
        PINTEREST_BRAND("PINTEREST_BRAND"),
        ALCOHOL_NO_SALE("ALCOHOL_NO_SALE"),
        LANDING_PAGE_SPEED("LANDING_PAGE_SPEED"),
        LANDING_PAGE_HARDWALL("LANDING_PAGE_HARDWALL"),
        LANDING_PAGE_BROKEN("LANDING_PAGE_BROKEN"),
        LANDING_PAGE_QUALITY("LANDING_PAGE_QUALITY"),
        OUT_OF_STOCK("OUT_OF_STOCK"),
        IMAGE_LOW_QUALITY("IMAGE_LOW_QUALITY"),
        IMAGE_BUSY("IMAGE_BUSY"),
        IMAGE_POORLY_EDITED("IMAGE_POORLY_EDITED"),
        IMAGE_BEFORE_AFTER("IMAGE_BEFORE_AFTER"),
        UGC("UGC"),
        FAKE_BUTTONS("FAKE_BUTTONS"),
        WEAPONS("WEAPONS"),
        SENSITIVE("SENSITIVE"),
        UNACCEPTABLE_BUSINESS("UNACCEPTABLE_BUSINESS"),
        SUSPICIOUS_CLAIMS("SUSPICIOUS_CLAIMS"),
        PHARMA("PHARMA"),
        SUSPICIOUS_SUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),
        ILLEGAL_RECREATIONAL_DRUG("ILLEGAL_RECREATIONAL_DRUG"),
        LOW_QUALITY_LANDING_PAGE("LOW_QUALITY_LANDING_PAGE"),
        RESTRICTED_HEALTHCARE("RESTRICTED_HEALTHCARE"),
        INCONSISTENT_LANG_FR("INCONSISTENT_LANG_FR");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): RejectedReasons {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * Ad review status
    * Values: OTHER,PENDING,REJECTED,APPROVED
    */
    enum class ReviewStatus(@get:JsonValue val value: kotlin.String) {

        OTHER("OTHER"),
        PENDING("PENDING"),
        REJECTED("REJECTED"),
        APPROVED("APPROVED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReviewStatus {
                return values().first{it -> it.value == value}
            }
        }
    }

}


package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdCommonQuizPinData
import org.openapitools.model.AdCommonTrackingUrls
import org.openapitools.model.CreativeType
import org.openapitools.model.EntityStatus
import org.openapitools.model.GridClickType
import org.openapitools.model.PinPromotionSummaryStatus
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
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: AdResponse.CustomizableCtaType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("quiz_pin_data") val quizPinData: AdCommonQuizPinData? = null,

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

    /**
    * Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\".
    * Values: HASHTAGS,PROMOTIONS_AND_PRICES,TARGETING,LANDING_PAGE,CAPS_AND_SYMBOLS,SHOCKING,WEIGHT_LOSS,PROHIBITED_PRODUCT,AUTHENTICITY,NUDITY,CONFUSING_DESIGN,URGENCY,RATINGS,APP,ALCOHOL,CONTESTS,POLITICAL,OTHER,IMAGE,NAR,INCONSISTENT,CLICKBAIT,NO_DESCRIPTION,LOW_QUALITY,EXAGGERATED_CLAIMS,PINTEREST_BRAND,ALCOHOL_NO_SALE,LANDING_PAGE_SPEED,LANDING_PAGE_HARDWALL,LANDING_PAGE_BROKEN,LANDING_PAGE_QUALITY,OUT_OF_STOCK,IMAGE_LOW_QUALITY,IMAGE_BUSY,IMAGE_POORLY_EDITED,IMAGE_BEFORE_AFTER,UGC,FAKE_BUTTONS,WEAPONS,SENSITIVE,UNACCEPTABLE_BUSINESS,SUSPICIOUS_CLAIMS,PHARMA,SUSPICIOUS_SUPPLEMENTS,ILLEGAL_RECREATIONAL_DRUG,LOW_QUALITY_LANDING_PAGE,RESTRICTED_HEALTHCARE,INCONSISTENT_LANG_FR
    */
    enum class RejectedReasons(val value: kotlin.String) {

        @JsonProperty("HASHTAGS") HASHTAGS("HASHTAGS"),
        @JsonProperty("PROMOTIONS_AND_PRICES") PROMOTIONS_AND_PRICES("PROMOTIONS_AND_PRICES"),
        @JsonProperty("TARGETING") TARGETING("TARGETING"),
        @JsonProperty("LANDING_PAGE") LANDING_PAGE("LANDING_PAGE"),
        @JsonProperty("CAPS_AND_SYMBOLS") CAPS_AND_SYMBOLS("CAPS_AND_SYMBOLS"),
        @JsonProperty("SHOCKING") SHOCKING("SHOCKING"),
        @JsonProperty("WEIGHT_LOSS") WEIGHT_LOSS("WEIGHT_LOSS"),
        @JsonProperty("PROHIBITED_PRODUCT") PROHIBITED_PRODUCT("PROHIBITED_PRODUCT"),
        @JsonProperty("AUTHENTICITY") AUTHENTICITY("AUTHENTICITY"),
        @JsonProperty("NUDITY") NUDITY("NUDITY"),
        @JsonProperty("CONFUSING_DESIGN") CONFUSING_DESIGN("CONFUSING_DESIGN"),
        @JsonProperty("URGENCY") URGENCY("URGENCY"),
        @JsonProperty("RATINGS") RATINGS("RATINGS"),
        @JsonProperty("APP") APP("APP"),
        @JsonProperty("ALCOHOL") ALCOHOL("ALCOHOL"),
        @JsonProperty("CONTESTS") CONTESTS("CONTESTS"),
        @JsonProperty("POLITICAL") POLITICAL("POLITICAL"),
        @JsonProperty("OTHER") OTHER("OTHER"),
        @JsonProperty("IMAGE") IMAGE("IMAGE"),
        @JsonProperty("NAR") NAR("NAR"),
        @JsonProperty("INCONSISTENT") INCONSISTENT("INCONSISTENT"),
        @JsonProperty("CLICKBAIT") CLICKBAIT("CLICKBAIT"),
        @JsonProperty("NO_DESCRIPTION") NO_DESCRIPTION("NO_DESCRIPTION"),
        @JsonProperty("LOW_QUALITY") LOW_QUALITY("LOW_QUALITY"),
        @JsonProperty("EXAGGERATED_CLAIMS") EXAGGERATED_CLAIMS("EXAGGERATED_CLAIMS"),
        @JsonProperty("PINTEREST_BRAND") PINTEREST_BRAND("PINTEREST_BRAND"),
        @JsonProperty("ALCOHOL_NO_SALE") ALCOHOL_NO_SALE("ALCOHOL_NO_SALE"),
        @JsonProperty("LANDING_PAGE_SPEED") LANDING_PAGE_SPEED("LANDING_PAGE_SPEED"),
        @JsonProperty("LANDING_PAGE_HARDWALL") LANDING_PAGE_HARDWALL("LANDING_PAGE_HARDWALL"),
        @JsonProperty("LANDING_PAGE_BROKEN") LANDING_PAGE_BROKEN("LANDING_PAGE_BROKEN"),
        @JsonProperty("LANDING_PAGE_QUALITY") LANDING_PAGE_QUALITY("LANDING_PAGE_QUALITY"),
        @JsonProperty("OUT_OF_STOCK") OUT_OF_STOCK("OUT_OF_STOCK"),
        @JsonProperty("IMAGE_LOW_QUALITY") IMAGE_LOW_QUALITY("IMAGE_LOW_QUALITY"),
        @JsonProperty("IMAGE_BUSY") IMAGE_BUSY("IMAGE_BUSY"),
        @JsonProperty("IMAGE_POORLY_EDITED") IMAGE_POORLY_EDITED("IMAGE_POORLY_EDITED"),
        @JsonProperty("IMAGE_BEFORE_AFTER") IMAGE_BEFORE_AFTER("IMAGE_BEFORE_AFTER"),
        @JsonProperty("UGC") UGC("UGC"),
        @JsonProperty("FAKE_BUTTONS") FAKE_BUTTONS("FAKE_BUTTONS"),
        @JsonProperty("WEAPONS") WEAPONS("WEAPONS"),
        @JsonProperty("SENSITIVE") SENSITIVE("SENSITIVE"),
        @JsonProperty("UNACCEPTABLE_BUSINESS") UNACCEPTABLE_BUSINESS("UNACCEPTABLE_BUSINESS"),
        @JsonProperty("SUSPICIOUS_CLAIMS") SUSPICIOUS_CLAIMS("SUSPICIOUS_CLAIMS"),
        @JsonProperty("PHARMA") PHARMA("PHARMA"),
        @JsonProperty("SUSPICIOUS_SUPPLEMENTS") SUSPICIOUS_SUPPLEMENTS("SUSPICIOUS_SUPPLEMENTS"),
        @JsonProperty("ILLEGAL_RECREATIONAL_DRUG") ILLEGAL_RECREATIONAL_DRUG("ILLEGAL_RECREATIONAL_DRUG"),
        @JsonProperty("LOW_QUALITY_LANDING_PAGE") LOW_QUALITY_LANDING_PAGE("LOW_QUALITY_LANDING_PAGE"),
        @JsonProperty("RESTRICTED_HEALTHCARE") RESTRICTED_HEALTHCARE("RESTRICTED_HEALTHCARE"),
        @JsonProperty("INCONSISTENT_LANG_FR") INCONSISTENT_LANG_FR("INCONSISTENT_LANG_FR")
    }

    /**
    * Ad review status
    * Values: OTHER,PENDING,REJECTED,APPROVED
    */
    enum class ReviewStatus(val value: kotlin.String) {

        @JsonProperty("OTHER") OTHER("OTHER"),
        @JsonProperty("PENDING") PENDING("PENDING"),
        @JsonProperty("REJECTED") REJECTED("REJECTED"),
        @JsonProperty("APPROVED") APPROVED("APPROVED")
    }

}


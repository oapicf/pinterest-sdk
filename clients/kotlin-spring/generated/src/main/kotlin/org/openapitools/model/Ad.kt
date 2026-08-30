package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdCollectionsHeaderType
import org.openapitools.model.AdDisapprovalReasons
import org.openapitools.model.AdReviewStatus
import org.openapitools.model.CartingProduct
import org.openapitools.model.CreativeType
import org.openapitools.model.CustomizableCTAType
import org.openapitools.model.DisclosureType
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
 * @param adAccountId The ID of the advertiser that this ad belongs to.
 * @param adGroupId ID of the ad group that contains the ad.
 * @param campaignId ID of the ad campaign that contains this ad.
 * @param creativeType 
 * @param id The ID of this ad.
 * @param pinId Pin ID. This field may only be updated for draft ads.
 * @param rejectedReasons Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
 * @param rejectionLabels Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
 * @param reviewStatus Ad review status
 * @param summaryStatus Ad summary status
 * @param type Always \"ad\".
 * @param androidDeepLink Deep link URL for Android devices.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param cartingPlatformType The vendor platform type of the carting/WTB ad.
 * @param cartingProducts Array of carting/WTB products for the ad.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
 * @param collectionsHeaderType 
 * @param createdTime Pin creation time. Unix timestamp in seconds.
 * @param customizableCtaType 
 * @param destinationUrl Destination URL.
 * @param disclosureType 
 * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @param gridClickType 
 * @param iosDeepLink Deep link URL for iOS devices.
 * @param isCarting Is the ad a carting/WTB ad?
 * @param isCollageAcceptedTerms Whether the advertiser has accepted the terms and conditions for collage ad.
 * @param isCollageSingleDestination Whether the collage ad has a single destination url override.
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param leadFormId Lead form ID for lead ad generation.
 * @param name Name of the ad - 255 chars max.
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param status 
 * @param trackingUrls 
 * @param updatedTime Last update time. Unix timestamp in seconds.
 * @param viewTrackingUrl Tracking URL for ad impressions.
 */
data class Ad(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, readOnly = true, description = "The ID of the advertiser that this ad belongs to.")
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id", required = true) val adAccountId: kotlin.String,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(required = true, description = "ID of the ad group that contains the ad.")
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, readOnly = true, description = "ID of the ad campaign that contains this ad.")
    @param:JsonProperty("campaign_id")
    @get:JsonProperty("campaign_id", required = true) val campaignId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("creative_type")
    @get:JsonProperty("creative_type", required = true) val creativeType: CreativeType,

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(required = true, description = "The ID of this ad.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Pin ID. This field may only be updated for draft ads.")
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id", required = true) val pinId: kotlin.String,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".")
    @param:JsonProperty("rejected_reasons")
    @get:JsonProperty("rejected_reasons", required = true) val rejectedReasons: kotlin.collections.List<AdDisapprovalReasons>,

    @Schema(required = true, readOnly = true, description = "Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".")
    @param:JsonProperty("rejection_labels")
    @get:JsonProperty("rejection_labels", required = true) val rejectionLabels: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Ad review status")
    @param:JsonProperty("review_status")
    @get:JsonProperty("review_status", required = true) val reviewStatus: AdReviewStatus,

    @field:Valid
    @Schema(required = true, readOnly = true, description = "Ad summary status")
    @param:JsonProperty("summary_status")
    @get:JsonProperty("summary_status", required = true) val summaryStatus: PinPromotionSummaryStatus,

    @Schema(required = true, readOnly = true, description = "Always \"ad\".")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @Schema(description = "Deep link URL for Android devices.")
    @param:JsonProperty("android_deep_link")
    @get:JsonProperty("android_deep_link") val androidDeepLink: kotlin.String? = null,

    @Schema(description = "Comma-separated deep links for the carousel pin on Android.")
    @param:JsonProperty("carousel_android_deep_links")
    @get:JsonProperty("carousel_android_deep_links") val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Comma-separated destination URLs for the carousel pin to promote.")
    @param:JsonProperty("carousel_destination_urls")
    @get:JsonProperty("carousel_destination_urls") val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,

    @Schema(description = "Comma-separated deep links for the carousel pin on iOS.")
    @param:JsonProperty("carousel_ios_deep_links")
    @get:JsonProperty("carousel_ios_deep_links") val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @get:Min(value=1)
    @get:Max(value=2)
    @Schema(readOnly = true, description = "The vendor platform type of the carting/WTB ad.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("carting_platform_type")
    @get:JsonProperty("carting_platform_type") val cartingPlatformType: kotlin.Int? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Array of carting/WTB products for the ad.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("carting_products")
    @get:JsonProperty("carting_products") val cartingProducts: kotlin.collections.List<CartingProduct>? = null,

    @Schema(description = "Tracking url for the ad clicks.")
    @param:JsonProperty("click_tracking_url")
    @get:JsonProperty("click_tracking_url") val clickTrackingUrl: kotlin.String? = null,

    @Schema(description = "Destination URL template for all items within a collections drawer.")
    @param:JsonProperty("collection_items_destination_url_template")
    @get:JsonProperty("collection_items_destination_url_template") val collectionItemsDestinationUrlTemplate: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("collections_header_type")
    @get:JsonProperty("collections_header_type") val collectionsHeaderType: AdCollectionsHeaderType? = null,

    @Schema(readOnly = true, description = "Pin creation time. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("created_time")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("customizable_cta_type")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: CustomizableCTAType? = null,

    @Schema(description = "Destination URL.")
    @param:JsonProperty("destination_url")
    @get:JsonProperty("destination_url") val destinationUrl: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("disclosure_type")
    @get:JsonProperty("disclosure_type") val disclosureType: DisclosureType? = null,

    @Schema(description = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")
    @param:JsonProperty("disclosure_url")
    @get:JsonProperty("disclosure_url") val disclosureUrl: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("grid_click_type")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null,

    @Schema(description = "Deep link URL for iOS devices.")
    @param:JsonProperty("ios_deep_link")
    @get:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @Schema(description = "Is the ad a carting/WTB ad?")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_carting")
    @get:JsonProperty("is_carting") val isCarting: kotlin.Boolean? = null,

    @Schema(description = "Whether the advertiser has accepted the terms and conditions for collage ad.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_collage_accepted_terms")
    @get:JsonProperty("is_collage_accepted_terms") val isCollageAcceptedTerms: kotlin.Boolean? = null,

    @Schema(description = "Whether the collage ad has a single destination url override.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_collage_single_destination")
    @get:JsonProperty("is_collage_single_destination") val isCollageSingleDestination: kotlin.Boolean? = null,

    @Schema(description = "Is original pin deleted?")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_pin_deleted")
    @get:JsonProperty("is_pin_deleted") val isPinDeleted: kotlin.Boolean? = null,

    @Schema(description = "Is pin repinnable?")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_removable")
    @get:JsonProperty("is_removable") val isRemovable: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(description = "Lead form ID for lead ad generation.")
    @param:JsonProperty("lead_form_id")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @Schema(description = "Name of the ad - 255 chars max.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
    @param:JsonProperty("quiz_pin_data")
    @get:JsonProperty("quiz_pin_data") val quizPinData: QuizPinData? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @Schema(readOnly = true, description = "Last update time. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("updated_time")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null,

    @Schema(description = "Tracking URL for ad impressions.")
    @param:JsonProperty("view_tracking_url")
    @get:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null
) {

}


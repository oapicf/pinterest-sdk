package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CreativeType
import org.openapitools.model.CustomizableCTAType
import org.openapitools.model.DisclosureType
import org.openapitools.model.EntityStatus
import org.openapitools.model.GridClickType
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
 * Creation fields
 * @param adGroupId ID of the ad group that contains the ad.
 * @param androidDeepLink Deep link URL for Android devices.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param creativeType 
 * @param customizableCtaType 
 * @param destinationUrl Destination URL.
 * @param disclosureType 
 * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @param gridClickType 
 * @param iosDeepLink Deep link URL for iOS devices.
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param leadFormId Lead form ID for lead ad generation.
 * @param name Name of the ad - 255 chars max.
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param status 
 * @param trackingUrls 
 * @param viewTrackingUrl Tracking URL for ad impressions.
 */
data class AdCommon(

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

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("customizable_cta_type") val customizableCtaType: CustomizableCTAType? = null,

    @Schema(example = "null", description = "Destination URL.")
    @get:JsonProperty("destination_url") val destinationUrl: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("disclosure_type") val disclosureType: DisclosureType? = null,

    @Schema(example = "null", description = "URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.")
    @get:JsonProperty("disclosure_url") val disclosureUrl: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("grid_click_type") val gridClickType: GridClickType? = null,

    @Schema(example = "null", description = "Deep link URL for iOS devices.")
    @get:JsonProperty("ios_deep_link") val iosDeepLink: kotlin.String? = null,

    @Schema(example = "false", description = "Is original pin deleted?")
    @get:JsonProperty("is_pin_deleted") val isPinDeleted: kotlin.Boolean? = null,

    @Schema(example = "false", description = "Is pin repinnable?")
    @get:JsonProperty("is_removable") val isRemovable: kotlin.Boolean? = null,

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "null", description = "Lead form ID for lead ad generation.")
    @get:JsonProperty("lead_form_id") val leadFormId: kotlin.String? = null,

    @Schema(example = "null", description = "Name of the ad - 255 chars max.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.")
    @get:JsonProperty("quiz_pin_data") val quizPinData: QuizPinData? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("tracking_urls") val trackingUrls: TrackingUrls? = null,

    @Schema(example = "null", description = "Tracking URL for ad impressions.")
    @get:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null
) {

}


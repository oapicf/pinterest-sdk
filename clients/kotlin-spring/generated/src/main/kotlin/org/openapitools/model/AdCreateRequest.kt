package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CreativeType
import org.openapitools.model.CustomizableCTAType
import org.openapitools.model.DisclosureType
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
 * @param adGroupId ID of the ad group that contains the ad.
 * @param creativeType 
 * @param pinId Pin ID.
 * @param androidDeepLink Deep link URL for Android devices.
 * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
 * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
 * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
 * @param clickTrackingUrl Tracking url for the ad clicks.
 * @param customizableCtaType 
 * @param destinationUrl Destination URL.
 * @param disclosureType 
 * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
 * @param gridClickType 
 * @param iosDeepLink Deep link URL for iOS devices.
 * @param isCarting Is the ad a carting/WTB ad?
 * @param isPinDeleted Is original pin deleted?
 * @param isRemovable Is pin repinnable?
 * @param leadFormId Lead form ID for lead ad generation.
 * @param name Name of the ad - 255 chars max.
 * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @param status 
 * @param trackingUrls 
 * @param viewTrackingUrl Tracking URL for ad impressions.
 */
data class AdCreateRequest(

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(required = true, description = "ID of the ad group that contains the ad.")
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("creative_type")
    @get:JsonProperty("creative_type", required = true) val creativeType: CreativeType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "394205773611545468", required = true, description = "Pin ID.")
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id", required = true) val pinId: kotlin.String,

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

    @Schema(description = "Tracking url for the ad clicks.")
    @param:JsonProperty("click_tracking_url")
    @get:JsonProperty("click_tracking_url") val clickTrackingUrl: kotlin.String? = null,

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

    @Schema(example = "false", description = "Is original pin deleted?")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("is_pin_deleted")
    @get:JsonProperty("is_pin_deleted") val isPinDeleted: kotlin.Boolean? = null,

    @Schema(example = "false", description = "Is pin repinnable?")
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
    @get:JsonProperty("quiz_pin_data") val quizPinData: kotlin.Any? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: EntityStatus? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("tracking_urls")
    @get:JsonProperty("tracking_urls") val trackingUrls: kotlin.Any? = null,

    @Schema(description = "Tracking URL for ad impressions.")
    @param:JsonProperty("view_tracking_url")
    @get:JsonProperty("view_tracking_url") val viewTrackingUrl: kotlin.String? = null
) {

}


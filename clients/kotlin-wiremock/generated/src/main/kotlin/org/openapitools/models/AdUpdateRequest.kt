@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdUpdateRequest(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.String? = null,

    @field:JsonProperty("ad_group_id")
    val adGroupId: kotlin.String? = null,

    @field:JsonProperty("android_deep_link")
    val androidDeepLink: kotlin.String? = null,

    @field:JsonProperty("carousel_android_deep_links")
    val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_destination_urls")
    val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_ios_deep_links")
    val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("click_tracking_url")
    val clickTrackingUrl: kotlin.String? = null,

    @field:JsonProperty("creative_type")
    val creativeType: CreativeType? = null,

    @field:JsonProperty("customizable_cta_type")
    val customizableCtaType: CustomizableCTAType? = null,

    @field:JsonProperty("destination_url")
    val destinationUrl: kotlin.String? = null,

    @field:JsonProperty("disclosure_type")
    val disclosureType: DisclosureType? = null,

    @field:JsonProperty("disclosure_url")
    val disclosureUrl: kotlin.String? = null,

    @field:JsonProperty("grid_click_type")
    val gridClickType: GridClickType? = null,

    @field:JsonProperty("ios_deep_link")
    val iosDeepLink: kotlin.String? = null,

    @field:JsonProperty("is_carting")
    val isCarting: kotlin.Boolean? = null,

    @field:JsonProperty("is_pin_deleted")
    val isPinDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("is_removable")
    val isRemovable: kotlin.Boolean? = null,

    @field:JsonProperty("lead_form_id")
    val leadFormId: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("quiz_pin_data")
    val quizPinData: kotlin.Any? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: kotlin.Any? = null,

    @field:JsonProperty("view_tracking_url")
    val viewTrackingUrl: kotlin.String? = null,

)

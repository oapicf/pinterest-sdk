@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class Ad(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String,

    @field:JsonProperty("ad_group_id")
    val adGroupId: kotlin.String,

    @field:JsonProperty("campaign_id")
    val campaignId: kotlin.String,

    @field:JsonProperty("creative_type")
    val creativeType: CreativeType,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.String,

    @field:JsonProperty("rejected_reasons")
    val rejectedReasons: kotlin.collections.List<AdDisapprovalReasons>,

    @field:JsonProperty("rejection_labels")
    val rejectionLabels: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("review_status")
    val reviewStatus: AdReviewStatus,

    @field:JsonProperty("summary_status")
    val summaryStatus: PinPromotionSummaryStatus,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("android_deep_link")
    val androidDeepLink: kotlin.String? = null,

    @field:JsonProperty("carousel_android_deep_links")
    val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_destination_urls")
    val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carousel_ios_deep_links")
    val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("carting_platform_type")
    val cartingPlatformType: kotlin.Int? = null,

    @field:JsonProperty("carting_products")
    val cartingProducts: kotlin.collections.List<CartingProduct>? = null,

    @field:JsonProperty("click_tracking_url")
    val clickTrackingUrl: kotlin.String? = null,

    @field:JsonProperty("collection_items_destination_url_template")
    val collectionItemsDestinationUrlTemplate: kotlin.String? = null,

    @field:JsonProperty("collections_header_type")
    val collectionsHeaderType: AdCollectionsHeaderType? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

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

    @field:JsonProperty("is_collage_accepted_terms")
    val isCollageAcceptedTerms: kotlin.Boolean? = null,

    @field:JsonProperty("is_collage_single_destination")
    val isCollageSingleDestination: kotlin.Boolean? = null,

    @field:JsonProperty("is_pin_deleted")
    val isPinDeleted: kotlin.Boolean? = null,

    @field:JsonProperty("is_removable")
    val isRemovable: kotlin.Boolean? = null,

    @field:JsonProperty("lead_form_id")
    val leadFormId: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("quiz_pin_data")
    val quizPinData: QuizPinData? = null,

    @field:JsonProperty("status")
    val status: EntityStatus? = null,

    @field:JsonProperty("tracking_urls")
    val trackingUrls: TrackingUrls? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int? = null,

    @field:JsonProperty("view_tracking_url")
    val viewTrackingUrl: kotlin.String? = null,

)

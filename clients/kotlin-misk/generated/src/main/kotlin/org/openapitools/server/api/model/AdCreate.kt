package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdCollectionsHeaderType
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.CustomizableCTAType
import org.openapitools.server.api.model.DisclosureType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.GridClickType
import org.openapitools.server.api.model.QuizPinData
import org.openapitools.server.api.model.TrackingUrls
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdCreate(
    /** ID of the ad group that contains the ad. */
    val adGroupId: kotlin.String,
    val creativeType: CreativeType,
    /** Pin ID. This field may only be updated for draft ads. */
    val pinId: kotlin.String,
    /** Deep link URL for Android devices. */
    val androidDeepLink: kotlin.String? = null,
    /** Comma-separated deep links for the carousel pin on Android. */
    val carouselAndroidDeepLinks: kotlin.collections.List<kotlin.String>? = null,
    /** Comma-separated destination URLs for the carousel pin to promote. */
    val carouselDestinationUrls: kotlin.collections.List<kotlin.String>? = null,
    /** Comma-separated deep links for the carousel pin on iOS. */
    val carouselIosDeepLinks: kotlin.collections.List<kotlin.String>? = null,
    /** Tracking url for the ad clicks. */
    val clickTrackingUrl: kotlin.String? = null,
    /** Destination URL template for all items within a collections drawer. */
    val collectionItemsDestinationUrlTemplate: kotlin.String? = null,
    val collectionsHeaderType: AdCollectionsHeaderType? = null,
    val customizableCtaType: CustomizableCTAType? = null,
    /** Destination URL. */
    val destinationUrl: kotlin.String? = null,
    val disclosureType: DisclosureType? = null,
    /** URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
    val disclosureUrl: kotlin.String? = null,
    val gridClickType: GridClickType? = null,
    /** Deep link URL for iOS devices. */
    val iosDeepLink: kotlin.String? = null,
    /** Is the ad a carting/WTB ad? */
    val isCarting: kotlin.Boolean? = null,
    /** Whether the advertiser has accepted the terms and conditions for collage ad. */
    val isCollageAcceptedTerms: kotlin.Boolean? = null,
    /** Whether the collage ad has a single destination url override. */
    val isCollageSingleDestination: kotlin.Boolean? = null,
    /** Is original pin deleted? */
    val isPinDeleted: kotlin.Boolean? = null,
    /** Is pin repinnable? */
    val isRemovable: kotlin.Boolean? = null,
    /** Lead form ID for lead ad generation. */
    val leadFormId: kotlin.String? = null,
    /** Name of the ad - 255 chars max. */
    val name: kotlin.String? = null,
    /** Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
    val quizPinData: QuizPinData? = null,
    val status: EntityStatus? = null,
    val trackingUrls: TrackingUrls? = null,
    /** Tracking URL for ad impressions. */
    val viewTrackingUrl: kotlin.String? = null
)

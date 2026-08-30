package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Ad.
  * @param adAccountId The ID of the advertiser that this ad belongs to.
  * @param adGroupId ID of the ad group that contains the ad.
  * @param androidDeepLink Deep link URL for Android devices.
  * @param campaignId ID of the ad campaign that contains this ad.
  * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
  * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
  * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
  * @param cartingPlatformType The vendor platform type of the carting/WTB ad.
  * @param cartingProducts Array of carting/WTB products for the ad.
  * @param clickTrackingUrl Tracking url for the ad clicks.
  * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
  * @param createdTime Pin creation time. Unix timestamp in seconds.
  * @param destinationUrl Destination URL.
  * @param disclosureUrl URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure.
  * @param id The ID of this ad.
  * @param iosDeepLink Deep link URL for iOS devices.
  * @param isCarting Is the ad a carting/WTB ad?
  * @param isCollageAcceptedTerms Whether the advertiser has accepted the terms and conditions for collage ad.
  * @param isCollageSingleDestination Whether the collage ad has a single destination url override.
  * @param isPinDeleted Is original pin deleted?
  * @param isRemovable Is pin repinnable?
  * @param leadFormId Lead form ID for lead ad generation.
  * @param name Name of the ad - 255 chars max.
  * @param pinId Pin ID. This field may only be updated for draft ads.
  * @param quizPinData Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
  * @param rejectedReasons Enum reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
  * @param rejectionLabels Text reason why the pin was rejected. Returned if `review_status` is \"REJECTED\".
  * @param reviewStatus Ad review status
  * @param summaryStatus Ad summary status
  * @param `type` Always \"ad\".
  * @param updatedTime Last update time. Unix timestamp in seconds.
  * @param viewTrackingUrl Tracking URL for ad impressions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Ad(
  adAccountId: String,
  adGroupId: String,
  androidDeepLink: Option[String],
  campaignId: String,
  carouselAndroidDeepLinks: Option[List[String]],
  carouselDestinationUrls: Option[List[String]],
  carouselIosDeepLinks: Option[List[String]],
  cartingPlatformType: Option[Int],
  cartingProducts: Option[List[CartingProduct]],
  clickTrackingUrl: Option[String],
  collectionItemsDestinationUrlTemplate: Option[String],
  collectionsHeaderType: Option[AdCollectionsHeaderType],
  createdTime: Option[Int],
  creativeType: CreativeType,
  customizableCtaType: Option[CustomizableCTAType],
  destinationUrl: Option[String],
  disclosureType: Option[DisclosureType],
  disclosureUrl: Option[String],
  gridClickType: Option[GridClickType],
  id: String,
  iosDeepLink: Option[String],
  isCarting: Option[Boolean],
  isCollageAcceptedTerms: Option[Boolean],
  isCollageSingleDestination: Option[Boolean],
  isPinDeleted: Option[Boolean],
  isRemovable: Option[Boolean],
  leadFormId: Option[String],
  name: Option[String],
  pinId: String,
  quizPinData: Option[QuizPinData],
  rejectedReasons: List[AdDisapprovalReasons],
  rejectionLabels: List[String],
  reviewStatus: AdReviewStatus,
  status: Option[EntityStatus],
  summaryStatus: PinPromotionSummaryStatus,
  trackingUrls: Option[TrackingUrls],
  `type`: String,
  updatedTime: Option[Int],
  viewTrackingUrl: Option[String]
)

object Ad {
  implicit lazy val adJsonFormat: Format[Ad] = Json.format[Ad]
}


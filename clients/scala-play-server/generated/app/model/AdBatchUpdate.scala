package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdBatchUpdate.
  * @param adGroupId ID of the ad group that contains the ad.
  * @param androidDeepLink Deep link URL for Android devices.
  * @param carouselAndroidDeepLinks Comma-separated deep links for the carousel pin on Android.
  * @param carouselDestinationUrls Comma-separated destination URLs for the carousel pin to promote.
  * @param carouselIosDeepLinks Comma-separated deep links for the carousel pin on iOS.
  * @param clickTrackingUrl Tracking url for the ad clicks.
  * @param collectionItemsDestinationUrlTemplate Destination URL template for all items within a collections drawer.
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
  * @param viewTrackingUrl Tracking URL for ad impressions.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdBatchUpdate(
  adGroupId: Option[String],
  androidDeepLink: Option[String],
  carouselAndroidDeepLinks: Option[List[String]],
  carouselDestinationUrls: Option[List[String]],
  carouselIosDeepLinks: Option[List[String]],
  clickTrackingUrl: Option[String],
  collectionItemsDestinationUrlTemplate: Option[String],
  collectionsHeaderType: Option[AdCollectionsHeaderType],
  creativeType: Option[CreativeType],
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
  pinId: Option[String],
  quizPinData: Option[QuizPinData],
  status: Option[EntityStatus],
  trackingUrls: Option[TrackingUrls],
  viewTrackingUrl: Option[String]
)

object AdBatchUpdate {
  implicit lazy val adBatchUpdateJsonFormat: Format[AdBatchUpdate] = Json.format[AdBatchUpdate]
}


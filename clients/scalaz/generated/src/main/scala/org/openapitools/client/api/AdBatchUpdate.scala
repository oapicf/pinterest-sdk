package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdBatchUpdate._

case class AdBatchUpdate (
  /* ID of the ad group that contains the ad. */
  adGroupId: Option[String],
/* Deep link URL for Android devices. */
  androidDeepLink: Option[String],
/* Comma-separated deep links for the carousel pin on Android. */
  carouselAndroidDeepLinks: Option[List[String]],
/* Comma-separated destination URLs for the carousel pin to promote. */
  carouselDestinationUrls: Option[List[String]],
/* Comma-separated deep links for the carousel pin on iOS. */
  carouselIosDeepLinks: Option[List[String]],
/* Tracking url for the ad clicks. */
  clickTrackingUrl: Option[String],
/* Destination URL template for all items within a collections drawer. */
  collectionItemsDestinationUrlTemplate: Option[String],
collectionsHeaderType: Option[AdCollectionsHeaderType],
creativeType: Option[CreativeType],
customizableCtaType: Option[CustomizableCTAType],
/* Destination URL. */
  destinationUrl: Option[String],
disclosureType: Option[DisclosureType],
/* URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
  disclosureUrl: Option[String],
gridClickType: Option[GridClickType],
/* The ID of this ad. */
  id: String,
/* Deep link URL for iOS devices. */
  iosDeepLink: Option[String],
/* Is the ad a carting/WTB ad? */
  isCarting: Option[Boolean],
/* Whether the advertiser has accepted the terms and conditions for collage ad. */
  isCollageAcceptedTerms: Option[Boolean],
/* Whether the collage ad has a single destination url override. */
  isCollageSingleDestination: Option[Boolean],
/* Is original pin deleted? */
  isPinDeleted: Option[Boolean],
/* Is pin repinnable? */
  isRemovable: Option[Boolean],
/* Lead form ID for lead ad generation. */
  leadFormId: Option[String],
/* Name of the ad - 255 chars max. */
  name: Option[String],
/* Pin ID. This field may only be updated for draft ads. */
  pinId: Option[String],
/* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
  quizPinData: Option[QuizPinData],
status: Option[EntityStatus],
trackingUrls: Option[TrackingUrls],
/* Tracking URL for ad impressions. */
  viewTrackingUrl: Option[String])

object AdBatchUpdate {
  import DateTimeCodecs._

  implicit val AdBatchUpdateCodecJson: CodecJson[AdBatchUpdate] = CodecJson.derive[AdBatchUpdate]
  implicit val AdBatchUpdateDecoder: EntityDecoder[AdBatchUpdate] = jsonOf[AdBatchUpdate]
  implicit val AdBatchUpdateEncoder: EntityEncoder[AdBatchUpdate] = jsonEncoderOf[AdBatchUpdate]
}

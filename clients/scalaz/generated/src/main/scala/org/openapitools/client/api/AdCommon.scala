package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdCommon._

case class AdCommon (
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
creativeType: Option[CreativeType],
customizableCtaType: Option[CustomizableCTAType],
/* Destination URL. */
  destinationUrl: Option[String],
disclosureType: Option[DisclosureType],
/* URL for a page that provides disclosures about a pharmaceutical product, such as potential side effects. Make sure the URL takes the user directly to the disclosure content and the referenced site is secure. */
  disclosureUrl: Option[String],
gridClickType: Option[GridClickType],
/* Deep link URL for iOS devices. */
  iosDeepLink: Option[String],
/* Is original pin deleted? */
  isPinDeleted: Option[Boolean],
/* Is pin repinnable? */
  isRemovable: Option[Boolean],
/* Lead form ID for lead ad generation. */
  leadFormId: Option[String],
/* Name of the ad - 255 chars max. */
  name: Option[String],
/* Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved. */
  quizPinData: Option[QuizPinData],
status: Option[EntityStatus],
trackingUrls: Option[TrackingUrls],
/* Tracking URL for ad impressions. */
  viewTrackingUrl: Option[String])

object AdCommon {
  import DateTimeCodecs._

  implicit val AdCommonCodecJson: CodecJson[AdCommon] = CodecJson.derive[AdCommon]
  implicit val AdCommonDecoder: EntityDecoder[AdCommon] = jsonOf[AdCommon]
  implicit val AdCommonEncoder: EntityEncoder[AdCommon] = jsonEncoderOf[AdCommon]
}

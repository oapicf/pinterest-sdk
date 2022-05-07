package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdResponseAllOf._

case class AdResponseAllOf (
  /* ID of the ad group that contains the ad. */
  adGroupId: Option[String],
/* Deep link URL for Android devices. Not currently available. Using this field will generate an error. */
  androidDeepLink: Option[String],
/* Comma-separated deep links for the carousel pin on Android. */
  carouselAndroidDeepLinks: Option[List[String]],
/* Comma-separated destination URLs for the carousel pin to promote. */
  carouselDestinationUrls: Option[List[String]],
/* Comma-separated deep links for the carousel pin on iOS. */
  carouselIosDeepLinks: Option[List[String]],
/* Tracking url for the ad clicks. */
  clickTrackingUrl: Option[String],
/* Ad creative type enum */
  creativeType: Option[CreativeType],
/* Destination URL. */
  destinationUrl: Option[String],
/* Deep link URL for iOS devices. Not currently available. Using this field will generate an error. */
  iosDeepLink: Option[String],
/* Is original pin deleted? */
  isPinDeleted: Option[Boolean],
/* Is pin repinnable? */
  isRemovable: Option[Boolean],
/* Name of the ad - 255 chars max. */
  name: Option[String],
/* Pin ID. */
  pinId: Option[String],
status: Option[EntityStatus],
trackingUrls: Option[TrackingUrls],
/* Tracking URL for ad impressions. */
  viewTrackingUrl: Option[String])

object AdResponseAllOf {
  import DateTimeCodecs._
  sealed trait CreativeType
  case object REGULAR extends CreativeType
  case object VIDEO extends CreativeType
  case object SHOPPING extends CreativeType
  case object CAROUSEL extends CreativeType
  case object MAXVIDEO extends CreativeType
  case object SHOPTHEPIN extends CreativeType
  case object STORY extends CreativeType

  object CreativeType {
    def toCreativeType(s: String): Option[CreativeType] = s match {
      case "REGULAR" => Some(REGULAR)
      case "VIDEO" => Some(VIDEO)
      case "SHOPPING" => Some(SHOPPING)
      case "CAROUSEL" => Some(CAROUSEL)
      case "MAXVIDEO" => Some(MAXVIDEO)
      case "SHOPTHEPIN" => Some(SHOPTHEPIN)
      case "STORY" => Some(STORY)
      case _ => None
    }

    def fromCreativeType(x: CreativeType): String = x match {
      case REGULAR => "REGULAR"
      case VIDEO => "VIDEO"
      case SHOPPING => "SHOPPING"
      case CAROUSEL => "CAROUSEL"
      case MAXVIDEO => "MAXVIDEO"
      case SHOPTHEPIN => "SHOPTHEPIN"
      case STORY => "STORY"
    }
  }

  implicit val CreativeTypeEnumEncoder: EncodeJson[CreativeType] =
    EncodeJson[CreativeType](is => StringEncodeJson(CreativeType.fromCreativeType(is)))

  implicit val CreativeTypeEnumDecoder: DecodeJson[CreativeType] =
    DecodeJson.optionDecoder[CreativeType](n => n.string.flatMap(jStr => CreativeType.toCreativeType(jStr)), "CreativeType failed to de-serialize")

  implicit val AdResponseAllOfCodecJson: CodecJson[AdResponseAllOf] = CodecJson.derive[AdResponseAllOf]
  implicit val AdResponseAllOfDecoder: EntityDecoder[AdResponseAllOf] = jsonOf[AdResponseAllOf]
  implicit val AdResponseAllOfEncoder: EntityEncoder[AdResponseAllOf] = jsonEncoderOf[AdResponseAllOf]
}

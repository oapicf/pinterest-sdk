package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdResponse._

case class AdResponse (
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
  viewTrackingUrl: Option[String],
/* The ID of the advertiser that this ad belongs to. */
  adAccountId: Option[String],
/* ID of the ad campaign that contains this ad. */
  campaignId: Option[String],
/* Destination URL template for all items within a collections drawer. */
  collectionItemsDestinationUrlTemplate: Option[String],
/* Pin creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* The ID of this ad. */
  id: Option[String],
/* Enum reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
  rejectedReasons: Option[List[RejectedReasons]],
/* Text reason why the pin was rejected. Returned if <code>review_status</code> is \"REJECTED\". */
  rejectionLabels: Option[List[String]],
/* Ad review status */
  reviewStatus: Option[ReviewStatus],
/* Always \"ad\". */
  `type`: Option[String],
/* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[Integer],
/* Ad summary status */
  summaryStatus: Option[PinPromotionSummaryStatus])

object AdResponse {
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
  sealed trait List[RejectedReasons]

  object List[RejectedReasons] {
    def toList[RejectedReasons](s: String): Option[List[RejectedReasons]] = s match {
      case _ => None
    }

    def fromList[RejectedReasons](x: List[RejectedReasons]): String = x match {
    }
  }

  implicit val List[RejectedReasons]EnumEncoder: EncodeJson[List[RejectedReasons]] =
    EncodeJson[List[RejectedReasons]](is => StringEncodeJson(List[RejectedReasons].fromList[RejectedReasons](is)))

  implicit val List[RejectedReasons]EnumDecoder: DecodeJson[List[RejectedReasons]] =
    DecodeJson.optionDecoder[List[RejectedReasons]](n => n.string.flatMap(jStr => List[RejectedReasons].toList[RejectedReasons](jStr)), "List[RejectedReasons] failed to de-serialize")
  sealed trait ReviewStatus
  case object OTHER extends ReviewStatus
  case object PENDING extends ReviewStatus
  case object REJECTED extends ReviewStatus
  case object APPROVED extends ReviewStatus

  object ReviewStatus {
    def toReviewStatus(s: String): Option[ReviewStatus] = s match {
      case "OTHER" => Some(OTHER)
      case "PENDING" => Some(PENDING)
      case "REJECTED" => Some(REJECTED)
      case "APPROVED" => Some(APPROVED)
      case _ => None
    }

    def fromReviewStatus(x: ReviewStatus): String = x match {
      case OTHER => "OTHER"
      case PENDING => "PENDING"
      case REJECTED => "REJECTED"
      case APPROVED => "APPROVED"
    }
  }

  implicit val ReviewStatusEnumEncoder: EncodeJson[ReviewStatus] =
    EncodeJson[ReviewStatus](is => StringEncodeJson(ReviewStatus.fromReviewStatus(is)))

  implicit val ReviewStatusEnumDecoder: DecodeJson[ReviewStatus] =
    DecodeJson.optionDecoder[ReviewStatus](n => n.string.flatMap(jStr => ReviewStatus.toReviewStatus(jStr)), "ReviewStatus failed to de-serialize")

  implicit val AdResponseCodecJson: CodecJson[AdResponse] = CodecJson.derive[AdResponse]
  implicit val AdResponseDecoder: EntityDecoder[AdResponse] = jsonOf[AdResponse]
  implicit val AdResponseEncoder: EntityEncoder[AdResponse] = jsonEncoderOf[AdResponse]
}

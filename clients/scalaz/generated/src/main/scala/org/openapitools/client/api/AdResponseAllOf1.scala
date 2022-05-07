package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdResponseAllOf1._

case class AdResponseAllOf1 (
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

object AdResponseAllOf1 {
  import DateTimeCodecs._
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

  implicit val AdResponseAllOf1CodecJson: CodecJson[AdResponseAllOf1] = CodecJson.derive[AdResponseAllOf1]
  implicit val AdResponseAllOf1Decoder: EntityDecoder[AdResponseAllOf1] = jsonOf[AdResponseAllOf1]
  implicit val AdResponseAllOf1Encoder: EntityEncoder[AdResponseAllOf1] = jsonEncoderOf[AdResponseAllOf1]
}

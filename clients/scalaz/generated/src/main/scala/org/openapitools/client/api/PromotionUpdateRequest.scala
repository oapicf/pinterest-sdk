package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionUpdateRequest._

case class PromotionUpdateRequest (
  /* Discount status based on the current time and start and end time of discount */
  discountStatus: Option[DiscountStatus],
/* Promotion end time. Unix timestamp in seconds. Independent of campaign end time. */
  endTime: Option[Integer],
/* Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. */
  externalId: Option[String],
/* The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. */
  platformType: Option[String],
/* Code that can be used to redeem a promotion. */
  promotionCode: Option[String],
/* An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. */
  promotionCustomId: Option[String],
/* Internal name for the promotion. */
  promotionTitle: Option[String],
promotionType: Option[PromotionType],
/* Promotion start time. Unix timestamp in seconds. Independent of campaign start time. */
  startTime: Option[Integer],
/* List of values to be inserted in the promotion type-specific template. */
  templateValues: Option[List[PromotionTemplateValue]],
/* Promotion ID */
  id: String,
status: Option[EntityStatus])

object PromotionUpdateRequest {
  import DateTimeCodecs._
  sealed trait DiscountStatus
  case object OTHER extends DiscountStatus
  case object ACTIVE extends DiscountStatus
  case object PAUSED extends DiscountStatus
  case object SCHEDULED extends DiscountStatus
  case object EXPIRED extends DiscountStatus

  object DiscountStatus {
    def toDiscountStatus(s: String): Option[DiscountStatus] = s match {
      case "OTHER" => Some(OTHER)
      case "ACTIVE" => Some(ACTIVE)
      case "PAUSED" => Some(PAUSED)
      case "SCHEDULED" => Some(SCHEDULED)
      case "EXPIRED" => Some(EXPIRED)
      case _ => None
    }

    def fromDiscountStatus(x: DiscountStatus): String = x match {
      case OTHER => "OTHER"
      case ACTIVE => "ACTIVE"
      case PAUSED => "PAUSED"
      case SCHEDULED => "SCHEDULED"
      case EXPIRED => "EXPIRED"
    }
  }

  implicit val DiscountStatusEnumEncoder: EncodeJson[DiscountStatus] =
    EncodeJson[DiscountStatus](is => StringEncodeJson(DiscountStatus.fromDiscountStatus(is)))

  implicit val DiscountStatusEnumDecoder: DecodeJson[DiscountStatus] =
    DecodeJson.optionDecoder[DiscountStatus](n => n.string.flatMap(jStr => DiscountStatus.toDiscountStatus(jStr)), "DiscountStatus failed to de-serialize")

  implicit val PromotionUpdateRequestCodecJson: CodecJson[PromotionUpdateRequest] = CodecJson.derive[PromotionUpdateRequest]
  implicit val PromotionUpdateRequestDecoder: EntityDecoder[PromotionUpdateRequest] = jsonOf[PromotionUpdateRequest]
  implicit val PromotionUpdateRequestEncoder: EntityEncoder[PromotionUpdateRequest] = jsonEncoderOf[PromotionUpdateRequest]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionCreate._

case class PromotionCreate (
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
  promotionTitle: String,
promotionType: PromotionType,
/* Promotion start time. Unix timestamp in seconds. Independent of campaign start time. */
  startTime: Option[Integer],
/* List of values to be inserted in the promotion type-specific template. */
  templateValues: Option[List[PromotionTemplateValue]])

object PromotionCreate {
  import DateTimeCodecs._

  implicit val PromotionCreateCodecJson: CodecJson[PromotionCreate] = CodecJson.derive[PromotionCreate]
  implicit val PromotionCreateDecoder: EntityDecoder[PromotionCreate] = jsonOf[PromotionCreate]
  implicit val PromotionCreateEncoder: EntityEncoder[PromotionCreate] = jsonEncoderOf[PromotionCreate]
}

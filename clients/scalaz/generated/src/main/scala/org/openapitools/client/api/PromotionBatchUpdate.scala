package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PromotionBatchUpdate._

case class PromotionBatchUpdate (
  discountStatus: Option[DiscountStatus],
/* Promotion end time. Unix timestamp in seconds. Independent of campaign end time. */
  endTime: Option[Integer],
/* Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. */
  externalId: Option[String],
/* Promotion ID */
  id: String,
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
  templateValues: Option[List[PromotionTemplateValue]])

object PromotionBatchUpdate {
  import DateTimeCodecs._

  implicit val PromotionBatchUpdateCodecJson: CodecJson[PromotionBatchUpdate] = CodecJson.derive[PromotionBatchUpdate]
  implicit val PromotionBatchUpdateDecoder: EntityDecoder[PromotionBatchUpdate] = jsonOf[PromotionBatchUpdate]
  implicit val PromotionBatchUpdateEncoder: EntityEncoder[PromotionBatchUpdate] = jsonEncoderOf[PromotionBatchUpdate]
}

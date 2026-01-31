package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QualityComponents._

case class QualityComponents (
  advertiserExternalId: Option[Map[String, QualityComponentDetails]],
clickIdEpik: Option[Map[String, QualityComponentDetails]],
/* Dedup components. */
  externalEventId: Option[Map[String, QualityComponentDetails]],
/* User matching identifiers. */
  hashedEmail: Option[Map[String, QualityComponentDetails]],
hashedMaid: Option[Map[String, QualityComponentDetails]],
ipAddress: Option[Map[String, QualityComponentDetails]],
orderId: Option[Map[String, QualityComponentDetails]],
orderValue: Option[Map[String, QualityComponentDetails]],
/* Product/event metadata. */
  productId: Option[Map[String, QualityComponentDetails]],
sourceUrl: Option[Map[String, QualityComponentDetails]],
userAgent: Option[Map[String, QualityComponentDetails]])

object QualityComponents {
  import DateTimeCodecs._

  implicit val QualityComponentsCodecJson: CodecJson[QualityComponents] = CodecJson.derive[QualityComponents]
  implicit val QualityComponentsDecoder: EntityDecoder[QualityComponents] = jsonOf[QualityComponents]
  implicit val QualityComponentsEncoder: EntityEncoder[QualityComponents] = jsonEncoderOf[QualityComponents]
}

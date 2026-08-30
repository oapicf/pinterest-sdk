package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import AdAccountAnalyticsItems._

case class AdAccountAnalyticsItems (
  AD_ACCOUNT_ID: String,
DATE: Option[LocalDate])

object AdAccountAnalyticsItems {
  import DateTimeCodecs._

  implicit val AdAccountAnalyticsItemsCodecJson: CodecJson[AdAccountAnalyticsItems] = CodecJson.derive[AdAccountAnalyticsItems]
  implicit val AdAccountAnalyticsItemsDecoder: EntityDecoder[AdAccountAnalyticsItems] = jsonOf[AdAccountAnalyticsItems]
  implicit val AdAccountAnalyticsItemsEncoder: EntityEncoder[AdAccountAnalyticsItems] = jsonEncoderOf[AdAccountAnalyticsItems]
}

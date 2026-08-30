package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import ProductGroupAnalyticsItems._

case class ProductGroupAnalyticsItems (
  /* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate],
/* The ID of the product group that this metrics belongs to. */
  PRODUCT_GROUP_ID: String)

object ProductGroupAnalyticsItems {
  import DateTimeCodecs._

  implicit val ProductGroupAnalyticsItemsCodecJson: CodecJson[ProductGroupAnalyticsItems] = CodecJson.derive[ProductGroupAnalyticsItems]
  implicit val ProductGroupAnalyticsItemsDecoder: EntityDecoder[ProductGroupAnalyticsItems] = jsonOf[ProductGroupAnalyticsItems]
  implicit val ProductGroupAnalyticsItemsEncoder: EntityEncoder[ProductGroupAnalyticsItems] = jsonEncoderOf[ProductGroupAnalyticsItems]
}

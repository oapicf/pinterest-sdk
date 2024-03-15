package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate
import java.util.HashMap

import ProductGroupAnalyticsResponseInner._

case class ProductGroupAnalyticsResponseInner (
  /* The ID of the product group that this metrics belongs to. */
  PRODUCT_GROUP_ID: String,
/* Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) */
  DATE: Option[LocalDate])

object ProductGroupAnalyticsResponseInner {
  import DateTimeCodecs._

  implicit val ProductGroupAnalyticsResponseInnerCodecJson: CodecJson[ProductGroupAnalyticsResponseInner] = CodecJson.derive[ProductGroupAnalyticsResponseInner]
  implicit val ProductGroupAnalyticsResponseInnerDecoder: EntityDecoder[ProductGroupAnalyticsResponseInner] = jsonOf[ProductGroupAnalyticsResponseInner]
  implicit val ProductGroupAnalyticsResponseInnerEncoder: EntityEncoder[ProductGroupAnalyticsResponseInner] = jsonEncoderOf[ProductGroupAnalyticsResponseInner]
}

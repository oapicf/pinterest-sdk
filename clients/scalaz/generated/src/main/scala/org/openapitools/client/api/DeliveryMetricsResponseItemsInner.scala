package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeliveryMetricsResponseItemsInner._

case class DeliveryMetricsResponseItemsInner (
  /* Metric's name. */
  name: Option[String],
/* Category name */
  category: Option[Category],
/* How the metric is defined. */
  definition: Option[String],
/* Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. */
  displayName: Option[String])

object DeliveryMetricsResponseItemsInner {
  import DateTimeCodecs._
  sealed trait Category
  case object ADS extends Category
  case object ORGANIC extends Category

  object Category {
    def toCategory(s: String): Option[Category] = s match {
      case "ADS" => Some(ADS)
      case "ORGANIC" => Some(ORGANIC)
      case _ => None
    }

    def fromCategory(x: Category): String = x match {
      case ADS => "ADS"
      case ORGANIC => "ORGANIC"
    }
  }

  implicit val CategoryEnumEncoder: EncodeJson[Category] =
    EncodeJson[Category](is => StringEncodeJson(Category.fromCategory(is)))

  implicit val CategoryEnumDecoder: DecodeJson[Category] =
    DecodeJson.optionDecoder[Category](n => n.string.flatMap(jStr => Category.toCategory(jStr)), "Category failed to de-serialize")

  implicit val DeliveryMetricsResponseItemsInnerCodecJson: CodecJson[DeliveryMetricsResponseItemsInner] = CodecJson.derive[DeliveryMetricsResponseItemsInner]
  implicit val DeliveryMetricsResponseItemsInnerDecoder: EntityDecoder[DeliveryMetricsResponseItemsInner] = jsonOf[DeliveryMetricsResponseItemsInner]
  implicit val DeliveryMetricsResponseItemsInnerEncoder: EntityEncoder[DeliveryMetricsResponseItemsInner] = jsonEncoderOf[DeliveryMetricsResponseItemsInner]
}

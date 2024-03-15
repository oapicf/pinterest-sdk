package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventsDataInnerCustomDataContentsInner._

case class ConversionEventsDataInnerCustomDataContentsInner (
  /* The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
  id: Option[String],
/* The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
  itemPrice: Option[String],
/* The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
  quantity: Option[Long],
/* The name of a product. */
  itemName: Option[String],
/* The category of a product. */
  itemCategory: Option[String],
/* The brand of a product. */
  itemBrand: Option[String])

object ConversionEventsDataInnerCustomDataContentsInner {
  import DateTimeCodecs._

  implicit val ConversionEventsDataInnerCustomDataContentsInnerCodecJson: CodecJson[ConversionEventsDataInnerCustomDataContentsInner] = CodecJson.derive[ConversionEventsDataInnerCustomDataContentsInner]
  implicit val ConversionEventsDataInnerCustomDataContentsInnerDecoder: EntityDecoder[ConversionEventsDataInnerCustomDataContentsInner] = jsonOf[ConversionEventsDataInnerCustomDataContentsInner]
  implicit val ConversionEventsDataInnerCustomDataContentsInnerEncoder: EntityEncoder[ConversionEventsDataInnerCustomDataContentsInner] = jsonEncoderOf[ConversionEventsDataInnerCustomDataContentsInner]
}

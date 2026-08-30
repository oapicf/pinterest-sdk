package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionEventsDataItemsCustomDataContentsItems._

case class ConversionEventsDataItemsCustomDataContentsItems (
  /* The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
  id: Option[String],
/* The brand of a product. */
  itemBrand: Option[String],
/* The brand ID of a product. */
  itemBrandId: Option[String],
/* The category of a product. */
  itemCategory: Option[String],
/* The name of a product. */
  itemName: Option[String],
/* The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
  itemPrice: Option[String],
/* The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
  quantity: Option[Long])

object ConversionEventsDataItemsCustomDataContentsItems {
  import DateTimeCodecs._

  implicit val ConversionEventsDataItemsCustomDataContentsItemsCodecJson: CodecJson[ConversionEventsDataItemsCustomDataContentsItems] = CodecJson.derive[ConversionEventsDataItemsCustomDataContentsItems]
  implicit val ConversionEventsDataItemsCustomDataContentsItemsDecoder: EntityDecoder[ConversionEventsDataItemsCustomDataContentsItems] = jsonOf[ConversionEventsDataItemsCustomDataContentsItems]
  implicit val ConversionEventsDataItemsCustomDataContentsItemsEncoder: EntityEncoder[ConversionEventsDataItemsCustomDataContentsItems] = jsonEncoderOf[ConversionEventsDataItemsCustomDataContentsItems]
}

package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param id The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param itemUnderscoreprice The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param quantity The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param itemUnderscorename The name of a product.
 * @param itemUnderscorecategory The category of a product.
 * @param itemUnderscorebrand The brand of a product.
 */
case class ConversionEventsDataInnerCustomDataContentsInner(id: Option[String],
                itemUnderscoreprice: Option[String],
                quantity: Option[Long],
                itemUnderscorename: Option[String],
                itemUnderscorecategory: Option[String],
                itemUnderscorebrand: Option[String]
                )

object ConversionEventsDataInnerCustomDataContentsInner {
    /**
     * Creates the codec for converting ConversionEventsDataInnerCustomDataContentsInner from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsDataInnerCustomDataContentsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsDataInnerCustomDataContentsInner] = deriveEncoder
}

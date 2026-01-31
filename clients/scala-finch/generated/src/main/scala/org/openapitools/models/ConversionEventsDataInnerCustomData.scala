package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionEventsDataInnerCustomDataContentsInner
import scala.collection.immutable.Seq

/**
 * Object containing other custom data.
 * @param contentUnderscorebrand The brand of the content associated with the event.
 * @param contentUnderscorecategory The category of the content associated with the event.
 * @param contentUnderscoreids List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param contentUnderscorename The name of the page or product associated with the event.
 * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
 * @param externalUnderscoremeasurementUnderscoreid Only use when instructed.
 * @param externalUnderscoremeasurementUnderscorevendorUnderscoreid Only use when instructed.
 * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
 * @param numUnderscoreitems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param optUnderscoreoutUnderscoretype Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
 * @param orderUnderscoreid The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
 * @param predictedUnderscoreltv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
 * @param searchUnderscorestring The search string related to the user conversion event.
 * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
 */
case class ConversionEventsDataInnerCustomData(contentUnderscorebrand: Option[String],
                contentUnderscorecategory: Option[String],
                contentUnderscoreids: Option[Seq[String]],
                contentUnderscorename: Option[String],
                contents: Option[Seq[ConversionEventsDataInnerCustomDataContentsInner]],
                currency: Option[String],
                externalUnderscoremeasurementUnderscoreid: Option[String],
                externalUnderscoremeasurementUnderscorevendorUnderscoreid: Option[Int],
                np: Option[String],
                numUnderscoreitems: Option[Long],
                optUnderscoreoutUnderscoretype: Option[String],
                orderUnderscoreid: Option[String],
                predictedUnderscoreltv: Option[String],
                searchUnderscorestring: Option[String],
                value: Option[String]
                )

object ConversionEventsDataInnerCustomData {
    /**
     * Creates the codec for converting ConversionEventsDataInnerCustomData from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsDataInnerCustomData] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsDataInnerCustomData] = deriveEncoder
}

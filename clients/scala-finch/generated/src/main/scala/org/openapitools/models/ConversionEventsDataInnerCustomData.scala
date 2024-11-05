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
 * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
 * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
 * @param contentUnderscoreids List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param contentUnderscorename The name of the page or product associated with the event.
 * @param contentUnderscorecategory The category of the content associated with the event.
 * @param contentUnderscorebrand The brand of the content associated with the event.
 * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param numUnderscoreitems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param orderUnderscoreid The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
 * @param searchUnderscorestring The search string related to the user conversion event.
 * @param optUnderscoreoutUnderscoretype Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
 * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
 */
case class ConversionEventsDataInnerCustomData(currency: Option[String],
                value: Option[String],
                contentUnderscoreids: Option[Seq[String]],
                contentUnderscorename: Option[String],
                contentUnderscorecategory: Option[String],
                contentUnderscorebrand: Option[String],
                contents: Option[Seq[ConversionEventsDataInnerCustomDataContentsInner]],
                numUnderscoreitems: Option[Long],
                orderUnderscoreid: Option[String],
                searchUnderscorestring: Option[String],
                optUnderscoreoutUnderscoretype: Option[String],
                np: Option[String]
                )

object ConversionEventsDataInnerCustomData {
    /**
     * Creates the codec for converting ConversionEventsDataInnerCustomData from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsDataInnerCustomData] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsDataInnerCustomData] = deriveEncoder
}

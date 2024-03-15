package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param productUnderscorebrand Product brand. For example, \"Parker\".
 * @param productUnderscorecategory Product category. For example, \"Shoes\".
 * @param productUnderscoreid Product ID. For example, 1414.
 * @param productUnderscorename Product name. For example, \"Parker Boots\".
 * @param productUnderscoreprice Product price. For example, \"99.99\".
 * @param productUnderscorequantity Product quantity. For example, 2.
 * @param productUnderscorevariant Product variant. For example, \"Red\".
 * @param productUnderscorevariantUnderscoreid Product variant ID. For example, \"1414-34832\".
 */
case class LineItem(productUnderscorebrand: Option[String],
                productUnderscorecategory: Option[String],
                productUnderscoreid: Option[Int],
                productUnderscorename: Option[String],
                productUnderscoreprice: Option[String],
                productUnderscorequantity: Option[Int],
                productUnderscorevariant: Option[String],
                productUnderscorevariantUnderscoreid: Option[String]
                )

object LineItem {
    /**
     * Creates the codec for converting LineItem from and to JSON.
     */
    implicit val decoder: Decoder[LineItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[LineItem] = deriveEncoder
}

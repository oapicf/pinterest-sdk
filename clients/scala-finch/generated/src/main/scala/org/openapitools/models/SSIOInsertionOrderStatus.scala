package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param pinUnderscoreorderUnderscoreid Salesforce order id
 * @param status Salesforce insertion order status
 * @param creationUnderscoretime Salesforce insertion order creation time
 */
case class SSIOInsertionOrderStatus(pinUnderscoreorderUnderscoreid: Option[String],
                status: Option[String],
                creationUnderscoretime: Option[String]
                )

object SSIOInsertionOrderStatus {
    /**
     * Creates the codec for converting SSIOInsertionOrderStatus from and to JSON.
     */
    implicit val decoder: Decoder[SSIOInsertionOrderStatus] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOInsertionOrderStatus] = deriveEncoder
}

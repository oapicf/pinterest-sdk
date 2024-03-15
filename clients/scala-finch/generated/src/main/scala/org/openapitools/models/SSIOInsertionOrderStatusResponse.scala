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
case class SSIOInsertionOrderStatusResponse(pinUnderscoreorderUnderscoreid: Option[String],
                status: Option[String],
                creationUnderscoretime: Option[String]
                )

object SSIOInsertionOrderStatusResponse {
    /**
     * Creates the codec for converting SSIOInsertionOrderStatusResponse from and to JSON.
     */
    implicit val decoder: Decoder[SSIOInsertionOrderStatusResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[SSIOInsertionOrderStatusResponse] = deriveEncoder
}

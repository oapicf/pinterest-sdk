package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param downloadUnderscoreurl The download url for the billing invoice
 * @param id The billing invoice id
 */
case class BillingInvoiceDownloadResponse(downloadUnderscoreurl: Option[String],
                id: Option[String]
                )

object BillingInvoiceDownloadResponse {
    /**
     * Creates the codec for converting BillingInvoiceDownloadResponse from and to JSON.
     */
    implicit val decoder: Decoder[BillingInvoiceDownloadResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BillingInvoiceDownloadResponse] = deriveEncoder
}

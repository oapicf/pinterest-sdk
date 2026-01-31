package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.LocalDateTime
import org.openapitools.models.Currency

/**
 * 
 * @param adUnderscoreaccountUnderscoreid The ID of the ad account this invoice belongs to
 * @param adUnderscoreaccountUnderscorename The name of the ad account this invoice belongs to
 * @param amountUnderscorebilledUnderscoremicroUnderscorecurrency The amount billed in this invoice. Denoted in micro currency
 * @param amountUnderscorediscountUnderscoremicroUnderscorecurrency The discount in this invoice. Denoted in micro currency
 * @param amountUnderscorenetUnderscoremicroUnderscorecurrency The net amount in this invoice. Denoted in micro currency
 * @param amountUnderscoretaxUnderscoremicroUnderscorecurrency The tax in this invoice. Denoted in micro currency
 * @param billUnderscoretoUnderscorecountry The country of the bill to address
 * @param billingUnderscoreperiodUnderscoreendUnderscoredate The end date of the billing period. Format: YYYY-MM-DD
 * @param billingUnderscoreperiodUnderscorestartUnderscoredate The start date of the billing period. Format: YYYY-MM-DD
 * @param currency 
 * @param documentUnderscoretype The type of the document
 * @param id Unique identifier for the billing invoice
 * @param invoiceUnderscoredueUnderscoredate The date the invoice is due. Format: YYYY-MM-DD
 * @param paymentUnderscoreterms The payment terms of the invoice
 * @param status The status of the invoice
 */
case class BillingInvoiceResponse(adUnderscoreaccountUnderscoreid: Option[String],
                adUnderscoreaccountUnderscorename: Option[String],
                amountUnderscorebilledUnderscoremicroUnderscorecurrency: Option[Int],
                amountUnderscorediscountUnderscoremicroUnderscorecurrency: Option[Int],
                amountUnderscorenetUnderscoremicroUnderscorecurrency: Option[Int],
                amountUnderscoretaxUnderscoremicroUnderscorecurrency: Option[Int],
                billUnderscoretoUnderscorecountry: Option[String],
                billingUnderscoreperiodUnderscoreendUnderscoredate: Option[LocalDateTime],
                billingUnderscoreperiodUnderscorestartUnderscoredate: Option[LocalDateTime],
                currency: Option[Currency],
                documentUnderscoretype: Option[String],
                id: Option[String],
                invoiceUnderscoredueUnderscoredate: Option[LocalDateTime],
                paymentUnderscoreterms: Option[String],
                status: Option[String]
                )

object BillingInvoiceResponse {
    /**
     * Creates the codec for converting BillingInvoiceResponse from and to JSON.
     */
    implicit val decoder: Decoder[BillingInvoiceResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BillingInvoiceResponse] = deriveEncoder
}

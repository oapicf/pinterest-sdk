package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BillingInvoiceResponse
import scala.collection.immutable.Seq

/**
 * 
 * @param bookmark 
 * @param items 
 */
case class BillingInvoicesGet200Response(bookmark: Option[String],
                items: Seq[BillingInvoiceResponse]
                )

object BillingInvoicesGet200Response {
    /**
     * Creates the codec for converting BillingInvoicesGet200Response from and to JSON.
     */
    implicit val decoder: Decoder[BillingInvoicesGet200Response] = deriveDecoder
    implicit val encoder: ObjectEncoder[BillingInvoicesGet200Response] = deriveEncoder
}

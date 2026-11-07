package model

import play.api.libs.json._

/**
  * The status of a billing invoice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingInvoiceStatus(
)

object BillingInvoiceStatus {
  implicit lazy val billingInvoiceStatusJsonFormat: Format[BillingInvoiceStatus] = Json.format[BillingInvoiceStatus]
}


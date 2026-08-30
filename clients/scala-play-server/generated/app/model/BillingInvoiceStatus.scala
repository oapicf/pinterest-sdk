package model

import play.api.libs.json._

/**
  * The status of a billing invoice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BillingInvoiceStatus(
)

object BillingInvoiceStatus {
  implicit lazy val billingInvoiceStatusJsonFormat: Format[BillingInvoiceStatus] = Json.format[BillingInvoiceStatus]
}


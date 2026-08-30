package model

import play.api.libs.json._

/**
  * Field by which to sort billing invoices.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BillingInvoiceSortField(
)

object BillingInvoiceSortField {
  implicit lazy val billingInvoiceSortFieldJsonFormat: Format[BillingInvoiceSortField] = Json.format[BillingInvoiceSortField]
}


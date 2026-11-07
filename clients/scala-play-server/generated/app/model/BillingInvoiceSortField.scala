package model

import play.api.libs.json._

/**
  * Field by which to sort billing invoices.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingInvoiceSortField(
)

object BillingInvoiceSortField {
  implicit lazy val billingInvoiceSortFieldJsonFormat: Format[BillingInvoiceSortField] = Json.format[BillingInvoiceSortField]
}


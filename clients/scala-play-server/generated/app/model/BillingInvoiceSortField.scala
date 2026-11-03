package model

import play.api.libs.json._

/**
  * Field by which to sort billing invoices.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingInvoiceSortField(
)

object BillingInvoiceSortField {
  implicit lazy val billingInvoiceSortFieldJsonFormat: Format[BillingInvoiceSortField] = Json.format[BillingInvoiceSortField]
}


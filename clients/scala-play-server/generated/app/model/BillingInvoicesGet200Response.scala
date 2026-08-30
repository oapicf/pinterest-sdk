package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for billing_invoices_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BillingInvoicesGet200Response(
  bookmark: Option[String],
  items: List[BillingInvoice]
)

object BillingInvoicesGet200Response {
  implicit lazy val billingInvoicesGet200ResponseJsonFormat: Format[BillingInvoicesGet200Response] = Json.format[BillingInvoicesGet200Response]
}


package model

import play.api.libs.json._

/**
  * Brand of the payment method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BillingProfilePaymentMethodBrand(
)

object BillingProfilePaymentMethodBrand {
  implicit lazy val billingProfilePaymentMethodBrandJsonFormat: Format[BillingProfilePaymentMethodBrand] = Json.format[BillingProfilePaymentMethodBrand]
}


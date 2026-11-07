package model

import play.api.libs.json._

/**
  * Brand of the payment method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingProfilePaymentMethodBrand(
)

object BillingProfilePaymentMethodBrand {
  implicit lazy val billingProfilePaymentMethodBrandJsonFormat: Format[BillingProfilePaymentMethodBrand] = Json.format[BillingProfilePaymentMethodBrand]
}


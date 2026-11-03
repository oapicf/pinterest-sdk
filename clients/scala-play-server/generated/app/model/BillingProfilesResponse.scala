package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillingProfilesResponse.
  * @param advertiserId Advertiser ID of the billing.
  * @param billingType Billing type of the advertiser
  * @param cardType Type of the card.
  * @param id Billing ID.
  * @param paymentMethodBrand Brand of the payment method.
  * @param status Status of the billing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingProfilesResponse(
  advertiserId: Option[String],
  billingType: Option[BillingType],
  cardType: Option[BillingProfileCardType],
  id: Option[String],
  paymentMethodBrand: Option[BillingProfilePaymentMethodBrand],
  status: Option[BillingProfileStatus]
)

object BillingProfilesResponse {
  implicit lazy val billingProfilesResponseJsonFormat: Format[BillingProfilesResponse] = Json.format[BillingProfilesResponse]
}


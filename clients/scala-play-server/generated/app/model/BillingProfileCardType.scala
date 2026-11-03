package model

import play.api.libs.json._

/**
  * Type of the credit card.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingProfileCardType(
)

object BillingProfileCardType {
  implicit lazy val billingProfileCardTypeJsonFormat: Format[BillingProfileCardType] = Json.format[BillingProfileCardType]
}


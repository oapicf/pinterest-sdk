package model

import play.api.libs.json._

/**
  * Type of the credit card.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BillingProfileCardType(
)

object BillingProfileCardType {
  implicit lazy val billingProfileCardTypeJsonFormat: Format[BillingProfileCardType] = Json.format[BillingProfileCardType]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BillingProfilesResponse.
  * @param id Billing ID.
  * @param cardType Type of the card.
  * @param status Status of the billing.
  * @param advertiserId Advertiser ID of the billing.
  * @param paymentMethodBrand Brand of the payment method.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BillingProfilesResponse(
  id: Option[String],
  cardType: Option[BillingProfilesResponse.CardType.Value],
  status: Option[BillingProfilesResponse.Status.Value],
  advertiserId: Option[String],
  paymentMethodBrand: Option[BillingProfilesResponse.PaymentMethodBrand.Value]
)

object BillingProfilesResponse {
  implicit lazy val billingProfilesResponseJsonFormat: Format[BillingProfilesResponse] = Json.format[BillingProfilesResponse]

  // noinspection TypeAnnotation
  object CardType extends Enumeration {
    val UNKNOWN = Value("UNKNOWN")
    val VISA = Value("VISA")
    val MASTERCARD = Value("MASTERCARD")
    val AMERICANEXPRESS = Value("AMERICAN_EXPRESS")
    val DISCOVER = Value("DISCOVER")
    val ELO = Value("ELO")

    type CardType = Value
    implicit lazy val CardTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val UNSPECIFIED = Value("UNSPECIFIED")
    val VALID = Value("VALID")
    val INVALID = Value("INVALID")
    val PENDING = Value("PENDING")
    val DELETED = Value("DELETED")
    val SECONDARY = Value("SECONDARY")
    val PENDINGSECONDARY = Value("PENDING_SECONDARY")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object PaymentMethodBrand extends Enumeration {
    val UNKNOWN = Value("UNKNOWN")
    val VISA = Value("VISA")
    val MASTERCARD = Value("MASTERCARD")
    val AMERICANEXPRESS = Value("AMERICAN_EXPRESS")
    val DISCOVER = Value("DISCOVER")
    val SOFORT = Value("SOFORT")
    val DINERSCLUB = Value("DINERS_CLUB")
    val ELO = Value("ELO")
    val CARTEBANCAIRE = Value("CARTE_BANCAIRE")

    type PaymentMethodBrand = Value
    implicit lazy val PaymentMethodBrandJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


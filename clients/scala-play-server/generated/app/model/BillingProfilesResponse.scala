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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BillingProfilesResponse(
  advertiserId: Option[String],
  billingType: Option[BillingProfilesResponse.BillingType.Value],
  cardType: Option[BillingProfilesResponse.CardType.Value],
  id: Option[String],
  paymentMethodBrand: Option[BillingProfilesResponse.PaymentMethodBrand.Value],
  status: Option[BillingProfilesResponse.Status.Value]
)

object BillingProfilesResponse {
  implicit lazy val billingProfilesResponseJsonFormat: Format[BillingProfilesResponse] = Json.format[BillingProfilesResponse]

  // noinspection TypeAnnotation
  object BillingType extends Enumeration {
    val CREDITCARD = Value("CREDIT_CARD")
    val INVOICE = Value("INVOICE")
    val INTERNAL = Value("INTERNAL")
    val RECURRING = Value("RECURRING")
    val PREPAID = Value("PREPAID")

    type BillingType = Value
    implicit lazy val BillingTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

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
}


package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BillingProfilesResponse._

case class BillingProfilesResponse (
  /* Billing ID. */
  id: Option[String],
/* Type of the card. */
  cardType: Option[CardType],
/* Status of the billing. */
  status: Option[Status],
/* Advertiser ID of the billing. */
  advertiserId: Option[String],
/* Brand of the payment method. */
  paymentMethodBrand: Option[PaymentMethodBrand])

object BillingProfilesResponse {
  import DateTimeCodecs._
  sealed trait CardType
  case object UNKNOWN extends CardType
  case object VISA extends CardType
  case object MASTERCARD extends CardType
  case object AMERICANEXPRESS extends CardType
  case object DISCOVER extends CardType
  case object ELO extends CardType

  object CardType {
    def toCardType(s: String): Option[CardType] = s match {
      case "UNKNOWN" => Some(UNKNOWN)
      case "VISA" => Some(VISA)
      case "MASTERCARD" => Some(MASTERCARD)
      case "AMERICANEXPRESS" => Some(AMERICANEXPRESS)
      case "DISCOVER" => Some(DISCOVER)
      case "ELO" => Some(ELO)
      case _ => None
    }

    def fromCardType(x: CardType): String = x match {
      case UNKNOWN => "UNKNOWN"
      case VISA => "VISA"
      case MASTERCARD => "MASTERCARD"
      case AMERICANEXPRESS => "AMERICANEXPRESS"
      case DISCOVER => "DISCOVER"
      case ELO => "ELO"
    }
  }

  implicit val CardTypeEnumEncoder: EncodeJson[CardType] =
    EncodeJson[CardType](is => StringEncodeJson(CardType.fromCardType(is)))

  implicit val CardTypeEnumDecoder: DecodeJson[CardType] =
    DecodeJson.optionDecoder[CardType](n => n.string.flatMap(jStr => CardType.toCardType(jStr)), "CardType failed to de-serialize")
  sealed trait Status
  case object UNSPECIFIED extends Status
  case object VALID extends Status
  case object INVALID extends Status
  case object PENDING extends Status
  case object DELETED extends Status
  case object SECONDARY extends Status
  case object PENDINGSECONDARY extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "UNSPECIFIED" => Some(UNSPECIFIED)
      case "VALID" => Some(VALID)
      case "INVALID" => Some(INVALID)
      case "PENDING" => Some(PENDING)
      case "DELETED" => Some(DELETED)
      case "SECONDARY" => Some(SECONDARY)
      case "PENDINGSECONDARY" => Some(PENDINGSECONDARY)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case UNSPECIFIED => "UNSPECIFIED"
      case VALID => "VALID"
      case INVALID => "INVALID"
      case PENDING => "PENDING"
      case DELETED => "DELETED"
      case SECONDARY => "SECONDARY"
      case PENDINGSECONDARY => "PENDINGSECONDARY"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")
  sealed trait PaymentMethodBrand
  case object UNKNOWN extends PaymentMethodBrand
  case object VISA extends PaymentMethodBrand
  case object MASTERCARD extends PaymentMethodBrand
  case object AMERICANEXPRESS extends PaymentMethodBrand
  case object DISCOVER extends PaymentMethodBrand
  case object SOFORT extends PaymentMethodBrand
  case object DINERSCLUB extends PaymentMethodBrand
  case object ELO extends PaymentMethodBrand
  case object CARTEBANCAIRE extends PaymentMethodBrand

  object PaymentMethodBrand {
    def toPaymentMethodBrand(s: String): Option[PaymentMethodBrand] = s match {
      case "UNKNOWN" => Some(UNKNOWN)
      case "VISA" => Some(VISA)
      case "MASTERCARD" => Some(MASTERCARD)
      case "AMERICANEXPRESS" => Some(AMERICANEXPRESS)
      case "DISCOVER" => Some(DISCOVER)
      case "SOFORT" => Some(SOFORT)
      case "DINERSCLUB" => Some(DINERSCLUB)
      case "ELO" => Some(ELO)
      case "CARTEBANCAIRE" => Some(CARTEBANCAIRE)
      case _ => None
    }

    def fromPaymentMethodBrand(x: PaymentMethodBrand): String = x match {
      case UNKNOWN => "UNKNOWN"
      case VISA => "VISA"
      case MASTERCARD => "MASTERCARD"
      case AMERICANEXPRESS => "AMERICANEXPRESS"
      case DISCOVER => "DISCOVER"
      case SOFORT => "SOFORT"
      case DINERSCLUB => "DINERSCLUB"
      case ELO => "ELO"
      case CARTEBANCAIRE => "CARTEBANCAIRE"
    }
  }

  implicit val PaymentMethodBrandEnumEncoder: EncodeJson[PaymentMethodBrand] =
    EncodeJson[PaymentMethodBrand](is => StringEncodeJson(PaymentMethodBrand.fromPaymentMethodBrand(is)))

  implicit val PaymentMethodBrandEnumDecoder: DecodeJson[PaymentMethodBrand] =
    DecodeJson.optionDecoder[PaymentMethodBrand](n => n.string.flatMap(jStr => PaymentMethodBrand.toPaymentMethodBrand(jStr)), "PaymentMethodBrand failed to de-serialize")

  implicit val BillingProfilesResponseCodecJson: CodecJson[BillingProfilesResponse] = CodecJson.derive[BillingProfilesResponse]
  implicit val BillingProfilesResponseDecoder: EntityDecoder[BillingProfilesResponse] = jsonOf[BillingProfilesResponse]
  implicit val BillingProfilesResponseEncoder: EntityEncoder[BillingProfilesResponse] = jsonEncoderOf[BillingProfilesResponse]
}

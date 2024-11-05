package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditDiscountsResponse._

case class AdsCreditDiscountsResponse (
  /* True if the offer code is currently active. */
  active: Option[Boolean],
/* Advertiser ID the offer was applied to. */
  advertiserId: Option[String],
/* The type of discount of this credit */
  discountType: Option[DiscountType],
/* The discount applied in the offer’s currency value. */
  discountInMicroCurrency: Option[BigDecimal],
/* Currency value for the discount. */
  discountCurrency: Option[String],
/* Human readable title of the offer code. */
  title: Option[String],
/* The credits left to spend. */
  remainingDiscountInMicroCurrency: Option[BigDecimal])

object AdsCreditDiscountsResponse {
  import DateTimeCodecs._
  sealed trait DiscountType
  case object COUPON extends DiscountType
  case object CREDIT extends DiscountType
  case object COUPONAPPLIED extends DiscountType
  case object CREDITAPPLIED extends DiscountType
  case object MARKETINGOFFERCREDIT extends DiscountType
  case object MARKETINGOFFERCREDITAPPLIED extends DiscountType
  case object GOODWILLCREDIT extends DiscountType
  case object GOODWILLCREDITAPPLIED extends DiscountType
  case object INTERNALCREDIT extends DiscountType
  case object INTERNALCREDITAPPLIED extends DiscountType
  case object PREPAIDCREDIT extends DiscountType
  case object PREPAIDCREDITAPPLIED extends DiscountType
  case object SALESINCENTIVECREDIT extends DiscountType
  case object SALESINCENTIVECREDITAPPLIED extends DiscountType
  case object CREDITEXPIRED extends DiscountType
  case object FUTURECREDIT extends DiscountType
  case object REFERRALCREDIT extends DiscountType
  case object INVOICESALESINCENTIVECREDIT extends DiscountType
  case object INVOICESALESINCENTIVECREDITAPPLIED extends DiscountType
  case object PREPAIDCREDITREFUND extends DiscountType

  object DiscountType {
    def toDiscountType(s: String): Option[DiscountType] = s match {
      case "COUPON" => Some(COUPON)
      case "CREDIT" => Some(CREDIT)
      case "COUPONAPPLIED" => Some(COUPONAPPLIED)
      case "CREDITAPPLIED" => Some(CREDITAPPLIED)
      case "MARKETINGOFFERCREDIT" => Some(MARKETINGOFFERCREDIT)
      case "MARKETINGOFFERCREDITAPPLIED" => Some(MARKETINGOFFERCREDITAPPLIED)
      case "GOODWILLCREDIT" => Some(GOODWILLCREDIT)
      case "GOODWILLCREDITAPPLIED" => Some(GOODWILLCREDITAPPLIED)
      case "INTERNALCREDIT" => Some(INTERNALCREDIT)
      case "INTERNALCREDITAPPLIED" => Some(INTERNALCREDITAPPLIED)
      case "PREPAIDCREDIT" => Some(PREPAIDCREDIT)
      case "PREPAIDCREDITAPPLIED" => Some(PREPAIDCREDITAPPLIED)
      case "SALESINCENTIVECREDIT" => Some(SALESINCENTIVECREDIT)
      case "SALESINCENTIVECREDITAPPLIED" => Some(SALESINCENTIVECREDITAPPLIED)
      case "CREDITEXPIRED" => Some(CREDITEXPIRED)
      case "FUTURECREDIT" => Some(FUTURECREDIT)
      case "REFERRALCREDIT" => Some(REFERRALCREDIT)
      case "INVOICESALESINCENTIVECREDIT" => Some(INVOICESALESINCENTIVECREDIT)
      case "INVOICESALESINCENTIVECREDITAPPLIED" => Some(INVOICESALESINCENTIVECREDITAPPLIED)
      case "PREPAIDCREDITREFUND" => Some(PREPAIDCREDITREFUND)
      case _ => None
    }

    def fromDiscountType(x: DiscountType): String = x match {
      case COUPON => "COUPON"
      case CREDIT => "CREDIT"
      case COUPONAPPLIED => "COUPONAPPLIED"
      case CREDITAPPLIED => "CREDITAPPLIED"
      case MARKETINGOFFERCREDIT => "MARKETINGOFFERCREDIT"
      case MARKETINGOFFERCREDITAPPLIED => "MARKETINGOFFERCREDITAPPLIED"
      case GOODWILLCREDIT => "GOODWILLCREDIT"
      case GOODWILLCREDITAPPLIED => "GOODWILLCREDITAPPLIED"
      case INTERNALCREDIT => "INTERNALCREDIT"
      case INTERNALCREDITAPPLIED => "INTERNALCREDITAPPLIED"
      case PREPAIDCREDIT => "PREPAIDCREDIT"
      case PREPAIDCREDITAPPLIED => "PREPAIDCREDITAPPLIED"
      case SALESINCENTIVECREDIT => "SALESINCENTIVECREDIT"
      case SALESINCENTIVECREDITAPPLIED => "SALESINCENTIVECREDITAPPLIED"
      case CREDITEXPIRED => "CREDITEXPIRED"
      case FUTURECREDIT => "FUTURECREDIT"
      case REFERRALCREDIT => "REFERRALCREDIT"
      case INVOICESALESINCENTIVECREDIT => "INVOICESALESINCENTIVECREDIT"
      case INVOICESALESINCENTIVECREDITAPPLIED => "INVOICESALESINCENTIVECREDITAPPLIED"
      case PREPAIDCREDITREFUND => "PREPAIDCREDITREFUND"
    }
  }

  implicit val DiscountTypeEnumEncoder: EncodeJson[DiscountType] =
    EncodeJson[DiscountType](is => StringEncodeJson(DiscountType.fromDiscountType(is)))

  implicit val DiscountTypeEnumDecoder: DecodeJson[DiscountType] =
    DecodeJson.optionDecoder[DiscountType](n => n.string.flatMap(jStr => DiscountType.toDiscountType(jStr)), "DiscountType failed to de-serialize")

  implicit val AdsCreditDiscountsResponseCodecJson: CodecJson[AdsCreditDiscountsResponse] = CodecJson.derive[AdsCreditDiscountsResponse]
  implicit val AdsCreditDiscountsResponseDecoder: EntityDecoder[AdsCreditDiscountsResponse] = jsonOf[AdsCreditDiscountsResponse]
  implicit val AdsCreditDiscountsResponseEncoder: EntityEncoder[AdsCreditDiscountsResponse] = jsonEncoderOf[AdsCreditDiscountsResponse]
}

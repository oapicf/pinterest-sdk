package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsCreditDiscountsResponse.
  * @param active True if the offer code is currently active.
  * @param advertiserId Advertiser ID the offer was applied to.
  * @param discountType The type of discount of this credit
  * @param discountInMicroCurrency The discount applied in the offer’s currency value.
  * @param discountCurrency Currency value for the discount.
  * @param title Human readable title of the offer code.
  * @param remainingDiscountInMicroCurrency The credits left to spend.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdsCreditDiscountsResponse(
  active: Option[Boolean],
  advertiserId: Option[String],
  discountType: Option[AdsCreditDiscountsResponse.DiscountType.Value],
  discountInMicroCurrency: Option[BigDecimal],
  discountCurrency: Option[String],
  title: Option[String],
  remainingDiscountInMicroCurrency: Option[BigDecimal]
)

object AdsCreditDiscountsResponse {
  implicit lazy val adsCreditDiscountsResponseJsonFormat: Format[AdsCreditDiscountsResponse] = Json.format[AdsCreditDiscountsResponse]

  // noinspection TypeAnnotation
  object DiscountType extends Enumeration {
    val COUPON = Value("COUPON")
    val CREDIT = Value("CREDIT")
    val COUPONAPPLIED = Value("COUPON_APPLIED")
    val CREDITAPPLIED = Value("CREDIT_APPLIED")
    val MARKETINGOFFERCREDIT = Value("MARKETING_OFFER_CREDIT")
    val MARKETINGOFFERCREDITAPPLIED = Value("MARKETING_OFFER_CREDIT_APPLIED")
    val GOODWILLCREDIT = Value("GOODWILL_CREDIT")
    val GOODWILLCREDITAPPLIED = Value("GOODWILL_CREDIT_APPLIED")
    val INTERNALCREDIT = Value("INTERNAL_CREDIT")
    val INTERNALCREDITAPPLIED = Value("INTERNAL_CREDIT_APPLIED")
    val PREPAIDCREDIT = Value("PREPAID_CREDIT")
    val PREPAIDCREDITAPPLIED = Value("PREPAID_CREDIT_APPLIED")
    val SALESINCENTIVECREDIT = Value("SALES_INCENTIVE_CREDIT")
    val SALESINCENTIVECREDITAPPLIED = Value("SALES_INCENTIVE_CREDIT_APPLIED")
    val CREDITEXPIRED = Value("CREDIT_EXPIRED")
    val FUTURECREDIT = Value("FUTURE_CREDIT")
    val REFERRALCREDIT = Value("REFERRAL_CREDIT")
    val INVOICESALESINCENTIVECREDIT = Value("INVOICE_SALES_INCENTIVE_CREDIT")
    val INVOICESALESINCENTIVECREDITAPPLIED = Value("INVOICE_SALES_INCENTIVE_CREDIT_APPLIED")
    val PREPAIDCREDITREFUND = Value("PREPAID_CREDIT_REFUND")

    type DiscountType = Value
    implicit lazy val DiscountTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOCreateInsertionOrderRequest._

case class SSIOCreateInsertionOrderRequest (
  /* URL link for agency */
  agencyLink: Option[String],
/* The billing contact email */
  billingContactEmail: String,
/* The billing contact first name */
  billingContactFirstname: String,
/* The billing contact last name */
  billingContactLastname: String,
/* If Budget order line, the budget amount. */
  budgetAmount: Option[BigDecimal],
/* End date of time period. Format: YYYY-MM-DD */
  endDate: Option[String],
/* The media contact email */
  mediaContactEmail: String,
/* The media contact first name */
  mediaContactFirstname: String,
/* The media contact last name */
  mediaContactLastname: String,
/* The po number */
  poNumber: String,
/* Starting date of time period. Format: YYYY-MM-DD */
  startDate: String,
/* The email of user submitting the insertion order */
  userEmail: Option[String],
/* The SFDC id for the terms */
  acceptedTermsId: String,
/* The UTC timestamp (to the nearest sec) of when terms were accepted */
  acceptedTermsTime: Option[Integer],
/* The bill-to billing address id */
  billtoBillingAddressId: String,
/* The bill-to business address id */
  billtoBusinessAddressId: String,
/* The bill-to company id */
  billtoCompanyId: String,
currencyInfo: Currency,
/* If Ongoing (perpetual) order line, the estimated monthly spend */
  estimatedMonthlySpend: Option[BigDecimal],
/* Type can be Budget or Perpetual */
  orderLineType: OrderLineType,
/* The order name */
  orderName: String,
/* The pmp id */
  pmpId: String)

object SSIOCreateInsertionOrderRequest {
  import DateTimeCodecs._
  sealed trait OrderLineType
  case object BUDGET extends OrderLineType
  case object PERPETUALS extends OrderLineType

  object OrderLineType {
    def toOrderLineType(s: String): Option[OrderLineType] = s match {
      case "BUDGET" => Some(BUDGET)
      case "PERPETUALS" => Some(PERPETUALS)
      case _ => None
    }

    def fromOrderLineType(x: OrderLineType): String = x match {
      case BUDGET => "BUDGET"
      case PERPETUALS => "PERPETUALS"
    }
  }

  implicit val OrderLineTypeEnumEncoder: EncodeJson[OrderLineType] =
    EncodeJson[OrderLineType](is => StringEncodeJson(OrderLineType.fromOrderLineType(is)))

  implicit val OrderLineTypeEnumDecoder: DecodeJson[OrderLineType] =
    DecodeJson.optionDecoder[OrderLineType](n => n.string.flatMap(jStr => OrderLineType.toOrderLineType(jStr)), "OrderLineType failed to de-serialize")

  implicit val SSIOCreateInsertionOrderRequestCodecJson: CodecJson[SSIOCreateInsertionOrderRequest] = CodecJson.derive[SSIOCreateInsertionOrderRequest]
  implicit val SSIOCreateInsertionOrderRequestDecoder: EntityDecoder[SSIOCreateInsertionOrderRequest] = jsonOf[SSIOCreateInsertionOrderRequest]
  implicit val SSIOCreateInsertionOrderRequestEncoder: EntityEncoder[SSIOCreateInsertionOrderRequest] = jsonEncoderOf[SSIOCreateInsertionOrderRequest]
}

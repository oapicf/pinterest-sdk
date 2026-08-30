package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import SSIOOrderLine._

case class SSIOOrderLine (
  /* The SFDC id for the terms */
  acceptedTermsId: Option[String],
/* The UTC timestamp (to the nearest second) when terms were accepted. */
  acceptedTermsTime: Option[String],
/* Ads manager order line id */
  adsManagerOrderLineId: Option[String],
/* Agency link */
  agencyLink: Option[String],
/* Bill-to company name */
  billToCompanyName: Option[String],
/* Billing contact email */
  billingContactEmail: Option[String],
/* Billing contact first name */
  billingContactFirstname: Option[String],
/* Billing contact last name */
  billingContactLastname: Option[String],
/* If budget order line, the budget amount. */
  budgetAmount: Option[BigDecimal],
currencyInfo: Option[Currency],
/* End date of the order line. */
  endDate: Option[LocalDate],
/* If ongoing (perpetual) order line, the estimated monthly spend. */
  estimatedMonthlySpend: Option[BigDecimal],
/* Last modified date. */
  lastModifiedDateTime: Option[String],
/* Billing media email */
  mediaContactEmail: Option[String],
/* Billing media contact first name */
  mediaContactFirstname: Option[String],
/* Billing media contact last name */
  mediaContactLastname: Option[String],
/* The order name */
  orderName: Option[String],
/* The pin order id associated with the order line in SFDC */
  pinOrderId: Option[String],
/* The Pinterest marketing partner name */
  pmpName: Option[String],
/* The PO number */
  poNumber: Option[String],
/* Order line id in SFDC */
  salesforceOrderLineId: Option[String],
/* Start date of the order line. */
  startDate: Option[LocalDate])

object SSIOOrderLine {
  import DateTimeCodecs._

  implicit val SSIOOrderLineCodecJson: CodecJson[SSIOOrderLine] = CodecJson.derive[SSIOOrderLine]
  implicit val SSIOOrderLineDecoder: EntityDecoder[SSIOOrderLine] = jsonOf[SSIOOrderLine]
  implicit val SSIOOrderLineEncoder: EntityEncoder[SSIOOrderLine] = jsonEncoderOf[SSIOOrderLine]
}

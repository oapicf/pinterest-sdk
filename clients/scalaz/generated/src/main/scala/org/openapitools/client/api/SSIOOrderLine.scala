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
  /* OrderLineId in SFDC */
  salesforceOrderLineId: Option[String],
/* Ads manager OrderLineId */
  adsManagerOrderLineId: Option[String],
/* The pin order id associated with the order line in SFDC */
  pinOrderId: Option[String],
/* Last modified date. */
  lastModifiedDateTime: Option[String],
/* Start date of the order line. */
  startDate: Option[LocalDate],
/* End date of the order line. */
  endDate: Option[LocalDate],
/* Bill To Company name */
  billToCompanyName: Option[String],
/* Billing contact first name */
  billingContactFirstname: Option[String],
/* Billing contact last name */
  billingContactLastname: Option[String],
/* Billing contact email */
  billingContactEmail: Option[String],
/* Billing media email */
  mediaContactEmail: Option[String],
/* Billing contact first name */
  mediaContactFirstname: Option[String],
/* Billing contact first name */
  mediaContactLastname: Option[String],
currencyInfo: Option[Currency],
/* Agency link */
  agencyLink: Option[String],
/* The po number */
  poNumber: Option[String],
/* The order name */
  orderName: Option[String],
/* The Pinterest marketing partner name */
  pmpName: Option[String],
/* The SFDC id for the terms */
  acceptedTermsId: Option[String],
/* The UTC timestamp (to the nearest sec) of when terms were accepted */
  acceptedTermsTime: Option[String],
/* If Budget order line, the budget amount. */
  budgetAmount: Option[BigDecimal],
/* If Ongoing (perpetual) order line, the estimated monthly spend */
  estimatedMonthlySpend: Option[BigDecimal])

object SSIOOrderLine {
  import DateTimeCodecs._

  implicit val SSIOOrderLineCodecJson: CodecJson[SSIOOrderLine] = CodecJson.derive[SSIOOrderLine]
  implicit val SSIOOrderLineDecoder: EntityDecoder[SSIOOrderLine] = jsonOf[SSIOOrderLine]
  implicit val SSIOOrderLineEncoder: EntityEncoder[SSIOOrderLine] = jsonEncoderOf[SSIOOrderLine]
}

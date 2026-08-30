package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOInsertionOrderCreate._

case class SSIOInsertionOrderCreate (
  /* The SFDC id for the terms */
  acceptedTermsId: String,
/* The UTC timestamp (to the nearest sec) of when terms were accepted */
  acceptedTermsTime: Option[Integer],
/* URL link for agency */
  agencyLink: Option[String],
/* The billing contact email */
  billingContactEmail: String,
/* The billing contact first name */
  billingContactFirstname: String,
/* The billing contact last name */
  billingContactLastname: String,
/* The bill-to billing address id */
  billtoBillingAddressId: String,
/* The bill-to business address id */
  billtoBusinessAddressId: String,
/* The bill-to company id */
  billtoCompanyId: String,
/* If Budget order line, the budget amount. */
  budgetAmount: Option[Double],
currencyInfo: Currency,
/* End date of time period. Format: YYYY-MM-DD */
  endDate: Option[String],
/* If Ongoing (perpetual) order line, the estimated monthly spend */
  estimatedMonthlySpend: Option[Double],
/* The media contact email */
  mediaContactEmail: String,
/* The media contact first name */
  mediaContactFirstname: String,
/* The media contact last name */
  mediaContactLastname: String,
/* Type can be Budget or Perpetual */
  orderLineType: SSIOOrderLineType,
/* The order name */
  orderName: String,
/* The pmp id */
  pmpId: String,
/* The po number */
  poNumber: String,
/* Starting date of time period. Format: YYYY-MM-DD */
  startDate: String,
/* The email of user submitting the insertion order */
  userEmail: Option[String])

object SSIOInsertionOrderCreate {
  import DateTimeCodecs._

  implicit val SSIOInsertionOrderCreateCodecJson: CodecJson[SSIOInsertionOrderCreate] = CodecJson.derive[SSIOInsertionOrderCreate]
  implicit val SSIOInsertionOrderCreateDecoder: EntityDecoder[SSIOInsertionOrderCreate] = jsonOf[SSIOInsertionOrderCreate]
  implicit val SSIOInsertionOrderCreateEncoder: EntityEncoder[SSIOInsertionOrderCreate] = jsonEncoderOf[SSIOInsertionOrderCreate]
}

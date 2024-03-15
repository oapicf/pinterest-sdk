package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOEditInsertionOrderRequest._

case class SSIOEditInsertionOrderRequest (
  /* Starting date of time period. Format: YYYY-MM-DD */
  startDate: Option[String],
/* End date of time period. Format: YYYY-MM-DD */
  endDate: Option[String],
/* The po number */
  poNumber: Option[String],
/* If Budget order line, the budget amount. */
  budgetAmount: Option[BigDecimal],
/* The billing contact first name */
  billingContactFirstname: Option[String],
/* The billing contact last name */
  billingContactLastname: Option[String],
/* The billing contact email */
  billingContactEmail: Option[String],
/* The media contact first name */
  mediaContactFirstname: Option[String],
/* The media contact last name */
  mediaContactLastname: Option[String],
/* The media contact email */
  mediaContactEmail: Option[String],
/* URL link for agency */
  agencyLink: Option[String],
/* The email of user submitting the insertion order */
  userEmail: Option[String],
/* LineId in the Oracle DB */
  oracleLineId: Option[String],
/* OrderId in SFDC */
  salesforceOrderId: Option[String],
/* OrderLineId in SFDC */
  salesforceOrderLineId: Option[String],
/* Ads manager OrderLineId */
  adsManagerOrderLineId: Option[String])

object SSIOEditInsertionOrderRequest {
  import DateTimeCodecs._

  implicit val SSIOEditInsertionOrderRequestCodecJson: CodecJson[SSIOEditInsertionOrderRequest] = CodecJson.derive[SSIOEditInsertionOrderRequest]
  implicit val SSIOEditInsertionOrderRequestDecoder: EntityDecoder[SSIOEditInsertionOrderRequest] = jsonOf[SSIOEditInsertionOrderRequest]
  implicit val SSIOEditInsertionOrderRequestEncoder: EntityEncoder[SSIOEditInsertionOrderRequest] = jsonEncoderOf[SSIOEditInsertionOrderRequest]
}

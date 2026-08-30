package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOInsertionOrderUpdate._

case class SSIOInsertionOrderUpdate (
  /* Ads manager OrderLineId */
  adsManagerOrderLineId: Option[String],
/* URL link for agency */
  agencyLink: Option[String],
/* The billing contact email */
  billingContactEmail: Option[String],
/* The billing contact first name */
  billingContactFirstname: Option[String],
/* The billing contact last name */
  billingContactLastname: Option[String],
/* If Budget order line, the budget amount. */
  budgetAmount: Option[Double],
/* End date of time period. Format: YYYY-MM-DD */
  endDate: Option[String],
/* The media contact email */
  mediaContactEmail: Option[String],
/* The media contact first name */
  mediaContactFirstname: Option[String],
/* The media contact last name */
  mediaContactLastname: Option[String],
/* LineId in the Oracle DB */
  oracleLineId: Option[String],
/* The po number */
  poNumber: Option[String],
/* OrderId in SFDC */
  salesforceOrderId: Option[String],
/* OrderLineId in SFDC */
  salesforceOrderLineId: Option[String],
/* Starting date of time period. Format: YYYY-MM-DD */
  startDate: Option[String],
/* The email of user submitting the insertion order */
  userEmail: Option[String])

object SSIOInsertionOrderUpdate {
  import DateTimeCodecs._

  implicit val SSIOInsertionOrderUpdateCodecJson: CodecJson[SSIOInsertionOrderUpdate] = CodecJson.derive[SSIOInsertionOrderUpdate]
  implicit val SSIOInsertionOrderUpdateDecoder: EntityDecoder[SSIOInsertionOrderUpdate] = jsonOf[SSIOInsertionOrderUpdate]
  implicit val SSIOInsertionOrderUpdateEncoder: EntityEncoder[SSIOInsertionOrderUpdate] = jsonEncoderOf[SSIOInsertionOrderUpdate]
}

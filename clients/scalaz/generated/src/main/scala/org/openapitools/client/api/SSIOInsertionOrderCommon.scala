package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SSIOInsertionOrderCommon._

case class SSIOInsertionOrderCommon (
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
  userEmail: Option[String])

object SSIOInsertionOrderCommon {
  import DateTimeCodecs._

  implicit val SSIOInsertionOrderCommonCodecJson: CodecJson[SSIOInsertionOrderCommon] = CodecJson.derive[SSIOInsertionOrderCommon]
  implicit val SSIOInsertionOrderCommonDecoder: EntityDecoder[SSIOInsertionOrderCommon] = jsonOf[SSIOInsertionOrderCommon]
  implicit val SSIOInsertionOrderCommonEncoder: EntityEncoder[SSIOInsertionOrderCommon] = jsonEncoderOf[SSIOInsertionOrderCommon]
}

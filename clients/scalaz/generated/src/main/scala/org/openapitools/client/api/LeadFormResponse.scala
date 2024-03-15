package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormResponse._

case class LeadFormResponse (
  /* Internal name of the lead form. */
  name: Option[String],
/* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
  privacyPolicyLink: Option[String],
/* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. */
  hasAcceptedTerms: Option[Boolean],
/* A message for people who complete the form to let them know what happens next. */
  completionMessage: Option[String],
status: Option[LeadFormStatus],
/* Additional disclosure language to be included in the lead form. */
  disclosureLanguage: Option[String],
/* List of questions to be displayed on the lead form. */
  questions: Option[List[LeadFormQuestion]],
/* The ID of this lead form */
  id: Option[String],
/* The Ad Account ID that this lead form belongs to. */
  adAccountId: Option[String],
/* Lead form creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[Integer])

object LeadFormResponse {
  import DateTimeCodecs._

  implicit val LeadFormResponseCodecJson: CodecJson[LeadFormResponse] = CodecJson.derive[LeadFormResponse]
  implicit val LeadFormResponseDecoder: EntityDecoder[LeadFormResponse] = jsonOf[LeadFormResponse]
  implicit val LeadFormResponseEncoder: EntityEncoder[LeadFormResponse] = jsonEncoderOf[LeadFormResponse]
}

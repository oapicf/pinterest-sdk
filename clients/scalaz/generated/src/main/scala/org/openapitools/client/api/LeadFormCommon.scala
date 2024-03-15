package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormCommon._

case class LeadFormCommon (
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
  questions: Option[List[LeadFormQuestion]])

object LeadFormCommon {
  import DateTimeCodecs._

  implicit val LeadFormCommonCodecJson: CodecJson[LeadFormCommon] = CodecJson.derive[LeadFormCommon]
  implicit val LeadFormCommonDecoder: EntityDecoder[LeadFormCommon] = jsonOf[LeadFormCommon]
  implicit val LeadFormCommonEncoder: EntityEncoder[LeadFormCommon] = jsonEncoderOf[LeadFormCommon]
}

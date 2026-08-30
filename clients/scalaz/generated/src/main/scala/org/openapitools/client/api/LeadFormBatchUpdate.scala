package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormBatchUpdate._

case class LeadFormBatchUpdate (
  /* A message for people who complete the form to let them know what happens next. */
  completionMessage: Option[String],
/* Additional disclosure language to be included in the lead form. */
  disclosureLanguage: Option[String],
/* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO */
  hasAcceptedTerms: Option[Boolean],
/* The ID of this lead form */
  id: String,
/* Internal name of the lead form. */
  name: Option[String],
/* List of additional policy links to be displayed on the lead form. */
  policyLinks: Option[List[LeadFormPolicyLink]],
/* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
  privacyPolicyLink: Option[String],
/* List of questions to be displayed on the lead form. */
  questions: Option[List[LeadFormQuestion]],
status: Option[LeadFormStatus])

object LeadFormBatchUpdate {
  import DateTimeCodecs._

  implicit val LeadFormBatchUpdateCodecJson: CodecJson[LeadFormBatchUpdate] = CodecJson.derive[LeadFormBatchUpdate]
  implicit val LeadFormBatchUpdateDecoder: EntityDecoder[LeadFormBatchUpdate] = jsonOf[LeadFormBatchUpdate]
  implicit val LeadFormBatchUpdateEncoder: EntityEncoder[LeadFormBatchUpdate] = jsonEncoderOf[LeadFormBatchUpdate]
}

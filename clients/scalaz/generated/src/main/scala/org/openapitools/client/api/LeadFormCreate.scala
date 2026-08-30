package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormCreate._

case class LeadFormCreate (
  /* A message for people who complete the form to let them know what happens next. */
  completionMessage: String,
/* Additional disclosure language to be included in the lead form. */
  disclosureLanguage: Option[String],
/* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO */
  hasAcceptedTerms: Boolean,
/* Internal name of the lead form. */
  name: String,
/* List of additional policy links to be displayed on the lead form. */
  policyLinks: Option[List[LeadFormPolicyLink]],
/* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
  privacyPolicyLink: String,
/* List of questions to be displayed on the lead form. */
  questions: List[LeadFormQuestion],
status: Option[LeadFormStatus])

object LeadFormCreate {
  import DateTimeCodecs._

  implicit val LeadFormCreateCodecJson: CodecJson[LeadFormCreate] = CodecJson.derive[LeadFormCreate]
  implicit val LeadFormCreateDecoder: EntityDecoder[LeadFormCreate] = jsonOf[LeadFormCreate]
  implicit val LeadFormCreateEncoder: EntityEncoder[LeadFormCreate] = jsonEncoderOf[LeadFormCreate]
}

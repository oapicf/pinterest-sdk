package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormCreateRequest._

case class LeadFormCreateRequest (
  /* Internal name of the lead form. */
  name: String,
/* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
  privacyPolicyLink: String,
/* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO */
  hasAcceptedTerms: Boolean,
/* A message for people who complete the form to let them know what happens next. */
  completionMessage: String,
status: Option[LeadFormStatus],
/* Additional disclosure language to be included in the lead form. */
  disclosureLanguage: Option[String],
/* List of questions to be displayed on the lead form. */
  questions: List[LeadFormQuestion],
/* List of additional policy links to be displayed on the lead form. */
  policyLinks: Option[List[LeadFormCommonPolicyLinksInner]])

object LeadFormCreateRequest {
  import DateTimeCodecs._

  implicit val LeadFormCreateRequestCodecJson: CodecJson[LeadFormCreateRequest] = CodecJson.derive[LeadFormCreateRequest]
  implicit val LeadFormCreateRequestDecoder: EntityDecoder[LeadFormCreateRequest] = jsonOf[LeadFormCreateRequest]
  implicit val LeadFormCreateRequestEncoder: EntityEncoder[LeadFormCreateRequest] = jsonEncoderOf[LeadFormCreateRequest]
}

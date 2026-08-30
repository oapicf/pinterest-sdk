package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param completionMessage A message for people who complete the form to let them know what happens next.
  * @param disclosureLanguage Additional disclosure language to be included in the lead form.
  * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
  * @param name Internal name of the lead form.
  * @param policyLinks List of additional policy links to be displayed on the lead form.
  * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  * @param questions List of questions to be displayed on the lead form.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormCreate(
  completionMessage: String,
  disclosureLanguage: Option[String],
  hasAcceptedTerms: Boolean,
  name: String,
  policyLinks: Option[List[LeadFormPolicyLink]],
  privacyPolicyLink: String,
  questions: List[LeadFormQuestion],
  status: Option[LeadFormStatus]
)

object LeadFormCreate {
  implicit lazy val leadFormCreateJsonFormat: Format[LeadFormCreate] = Json.format[LeadFormCreate]
}


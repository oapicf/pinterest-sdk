package model

import play.api.libs.json._

/**
  * Creation fields
  * @param name Internal name of the lead form.
  * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
  * @param completionMessage A message for people who complete the form to let them know what happens next.
  * @param disclosureLanguage Additional disclosure language to be included in the lead form.
  * @param questions List of questions to be displayed on the lead form.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class LeadFormCommon(
  name: Option[String],
  privacyPolicyLink: Option[String],
  hasAcceptedTerms: Option[Boolean],
  completionMessage: Option[String],
  status: Option[LeadFormStatus],
  disclosureLanguage: Option[String],
  questions: Option[List[LeadFormQuestion]]
)

object LeadFormCommon {
  implicit lazy val leadFormCommonJsonFormat: Format[LeadFormCommon] = Json.format[LeadFormCommon]
}


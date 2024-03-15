package org.openapitools.server.model


/**
 * Creation fields
 *
 * @param name Internal name of the lead form. for example: ''Lead Form 3/14/2023''
 * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. for example: ''https://www.advertisername.com/privacy-policy''
 * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. for example: ''false''
 * @param completionMessage A message for people who complete the form to let them know what happens next. for example: ''Thank you for submitting. We will contact you soon.''
 * @param status  for example: ''null''
 * @param disclosureLanguage Additional disclosure language to be included in the lead form. for example: ''By entering your personal information, you agree that your data will be collected and used.''
 * @param questions List of questions to be displayed on the lead form. for example: ''[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}]''
*/
final case class LeadFormCommon (
  name: Option[String] = None,
  privacyPolicyLink: Option[String] = None,
  hasAcceptedTerms: Option[Boolean] = None,
  completionMessage: Option[String] = None,
  status: Option[LeadFormStatus] = None,
  disclosureLanguage: Option[String] = None,
  questions: Option[Seq[LeadFormQuestion]] = None
)


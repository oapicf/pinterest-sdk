package org.openapitools.server.model


/**
 * @param adAccountId The Ad Account ID that this lead form belongs to. for example: ''null''
 * @param completionMessage A message for people who complete the form to let them know what happens next. for example: ''Thank you for submitting. We will contact you soon.''
 * @param createdTime Lead form creation time. Unix timestamp in seconds. for example: ''null''
 * @param disclosureLanguage Additional disclosure language to be included in the lead form. for example: ''By entering your personal information, you agree that your data will be collected and used.''
 * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO for example: ''false''
 * @param id The ID of this lead form for example: ''null''
 * @param name Internal name of the lead form. for example: ''Lead Form 3/14/2023''
 * @param policyLinks List of additional policy links to be displayed on the lead form. for example: ''[{"label":"Copyright","link":"https://policy.pinterest.com/en/copyright"}]''
 * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. for example: ''https://www.advertisername.com/privacy-policy''
 * @param questions List of questions to be displayed on the lead form. for example: ''[{"question_type":"CUSTOM","custom_question_field_type":"CHECKBOX","custom_question_label":"What is your favorite animal?","custom_question_options":["Dog","Cat","Bird","Turtle"]}]''
 * @param status  for example: ''null''
 * @param updatedTime Last update time. Unix timestamp in seconds. for example: ''null''
*/
final case class LeadForm (
  adAccountId: Option[String] = None,
  completionMessage: String,
  createdTime: Option[Int] = None,
  disclosureLanguage: Option[String] = None,
  hasAcceptedTerms: Boolean,
  id: String,
  name: String,
  policyLinks: Option[Seq[LeadFormPolicyLink]] = None,
  privacyPolicyLink: String,
  questions: Seq[LeadFormQuestion],
  status: Option[LeadFormStatus] = None,
  updatedTime: Option[Int] = None
)


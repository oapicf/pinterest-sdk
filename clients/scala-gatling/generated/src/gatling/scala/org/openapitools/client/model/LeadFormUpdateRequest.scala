
package org.openapitools.client.model


case class LeadFormUpdateRequest (
    /* A message for people who complete the form to let them know what happens next. */
    _completionMessage: Option[String],
    /* Additional disclosure language to be included in the lead form. */
    _disclosureLanguage: Option[String],
    /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO */
    _hasAcceptedTerms: Option[Boolean],
    /* Internal name of the lead form. */
    _name: Option[String],
    /* List of additional policy links to be displayed on the lead form. */
    _policyLinks: Option[List[LeadFormCommonPolicyLinksInner]],
    /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    _privacyPolicyLink: Option[String],
    /* List of questions to be displayed on the lead form. */
    _questions: Option[List[LeadFormQuestion]],
    _status: Option[LeadFormStatus],
    /* The ID of this lead form to be updated */
    _id: String
)
object LeadFormUpdateRequest {
    def toStringBody(var_completionMessage: Object, var_disclosureLanguage: Object, var_hasAcceptedTerms: Object, var_name: Object, var_policyLinks: Object, var_privacyPolicyLink: Object, var_questions: Object, var_status: Object, var_id: Object) =
        s"""
        | {
        | "completionMessage":$var_completionMessage,"disclosureLanguage":$var_disclosureLanguage,"hasAcceptedTerms":$var_hasAcceptedTerms,"name":$var_name,"policyLinks":$var_policyLinks,"privacyPolicyLink":$var_privacyPolicyLink,"questions":$var_questions,"status":$var_status,"id":$var_id
        | }
        """.stripMargin
}

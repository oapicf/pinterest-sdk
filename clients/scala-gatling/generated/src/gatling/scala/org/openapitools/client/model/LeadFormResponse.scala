
package org.openapitools.client.model


case class LeadFormResponse (
    /* Internal name of the lead form. */
    _name: Option[String],
    /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    _privacyPolicyLink: Option[String],
    /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO */
    _hasAcceptedTerms: Option[Boolean],
    /* A message for people who complete the form to let them know what happens next. */
    _completionMessage: Option[String],
    _status: Option[LeadFormStatus],
    /* Additional disclosure language to be included in the lead form. */
    _disclosureLanguage: Option[String],
    /* List of questions to be displayed on the lead form. */
    _questions: Option[List[LeadFormQuestion]],
    /* List of additional policy links to be displayed on the lead form. */
    _policyLinks: Option[List[LeadFormCommonPolicyLinksInner]],
    /* The ID of this lead form */
    _id: Option[String],
    /* The Ad Account ID that this lead form belongs to. */
    _adAccountId: Option[String],
    /* Lead form creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object LeadFormResponse {
    def toStringBody(var_name: Object, var_privacyPolicyLink: Object, var_hasAcceptedTerms: Object, var_completionMessage: Object, var_status: Object, var_disclosureLanguage: Object, var_questions: Object, var_policyLinks: Object, var_id: Object, var_adAccountId: Object, var_createdTime: Object, var_updatedTime: Object) =
        s"""
        | {
        | "name":$var_name,"privacyPolicyLink":$var_privacyPolicyLink,"hasAcceptedTerms":$var_hasAcceptedTerms,"completionMessage":$var_completionMessage,"status":$var_status,"disclosureLanguage":$var_disclosureLanguage,"questions":$var_questions,"policyLinks":$var_policyLinks,"id":$var_id,"adAccountId":$var_adAccountId,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}

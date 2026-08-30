
package org.openapitools.client.model


case class LeadForm (
    /* The Ad Account ID that this lead form belongs to. */
    _adAccountId: Option[String],
    /* A message for people who complete the form to let them know what happens next. */
    _completionMessage: String,
    /* Lead form creation time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Additional disclosure language to be included in the lead form. */
    _disclosureLanguage: Option[String],
    /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO */
    _hasAcceptedTerms: Boolean,
    /* The ID of this lead form */
    _id: String,
    /* Internal name of the lead form. */
    _name: String,
    /* List of additional policy links to be displayed on the lead form. */
    _policyLinks: Option[List[LeadFormPolicyLink]],
    /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    _privacyPolicyLink: String,
    /* List of questions to be displayed on the lead form. */
    _questions: List[LeadFormQuestion],
    _status: Option[LeadFormStatus],
    /* Last update time. Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object LeadForm {
    def toStringBody(var_adAccountId: Object, var_completionMessage: Object, var_createdTime: Object, var_disclosureLanguage: Object, var_hasAcceptedTerms: Object, var_id: Object, var_name: Object, var_policyLinks: Object, var_privacyPolicyLink: Object, var_questions: Object, var_status: Object, var_updatedTime: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"completionMessage":$var_completionMessage,"createdTime":$var_createdTime,"disclosureLanguage":$var_disclosureLanguage,"hasAcceptedTerms":$var_hasAcceptedTerms,"id":$var_id,"name":$var_name,"policyLinks":$var_policyLinks,"privacyPolicyLink":$var_privacyPolicyLink,"questions":$var_questions,"status":$var_status,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}

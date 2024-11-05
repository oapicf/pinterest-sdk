package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormCommonPolicyLinksInner;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;

@Canonical
class LeadFormCreateRequest {
    /* Internal name of the lead form. */
    String name
    /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    String privacyPolicyLink
    /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO */
    Boolean hasAcceptedTerms
    /* A message for people who complete the form to let them know what happens next. */
    String completionMessage
    
    LeadFormStatus status
    /* Additional disclosure language to be included in the lead form. */
    String disclosureLanguage
    /* List of questions to be displayed on the lead form. */
    List<LeadFormQuestion> questions = new ArrayList<>()
    /* List of additional policy links to be displayed on the lead form. */
    List<LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>()
}

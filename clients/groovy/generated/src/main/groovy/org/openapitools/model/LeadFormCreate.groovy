package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormPolicyLink;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;

@Canonical
class LeadFormCreate {
    /* A message for people who complete the form to let them know what happens next. */
    String completionMessage
    /* Additional disclosure language to be included in the lead form. */
    String disclosureLanguage
    /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO */
    Boolean hasAcceptedTerms
    /* Internal name of the lead form. */
    String name
    /* List of additional policy links to be displayed on the lead form. */
    List<LeadFormPolicyLink> policyLinks = new ArrayList<>()
    /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    String privacyPolicyLink
    /* List of questions to be displayed on the lead form. */
    List<LeadFormQuestion> questions = new ArrayList<>()
    
    LeadFormStatus status
}

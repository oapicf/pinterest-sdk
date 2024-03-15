package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;

@Canonical
class LeadFormCommon {
    /* Internal name of the lead form. */
    String name
    /* A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language. */
    String privacyPolicyLink
    /* Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad. */
    Boolean hasAcceptedTerms
    /* A message for people who complete the form to let them know what happens next. */
    String completionMessage
    
    LeadFormStatus status
    /* Additional disclosure language to be included in the lead form. */
    String disclosureLanguage
    /* List of questions to be displayed on the lead form. */
    List<LeadFormQuestion> questions
}

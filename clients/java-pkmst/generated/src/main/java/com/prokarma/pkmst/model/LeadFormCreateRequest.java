package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.LeadFormCommonPolicyLinksInner;
import com.prokarma.pkmst.model.LeadFormQuestion;
import com.prokarma.pkmst.model.LeadFormStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * LeadFormCreateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class LeadFormCreateRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  @JsonProperty("has_accepted_terms")
  private Boolean hasAcceptedTerms;

  @JsonProperty("completion_message")
  private String completionMessage;

  @JsonProperty("status")
  private LeadFormStatus status;

  @JsonProperty("disclosure_language")
  private String disclosureLanguage;

  @JsonProperty("questions")
  
  private List<LeadFormQuestion> questions = new ArrayList<>();

  @JsonProperty("policy_links")
  
  private List<LeadFormCommonPolicyLinksInner> policyLinks = null;

  public LeadFormCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Internal name of the lead form.
   * @return name
   */
  @ApiModelProperty(example = "Lead Form 3/14/2023", required = true, value = "Internal name of the lead form.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadFormCreateRequest privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   * @return privacyPolicyLink
   */
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", required = true, value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormCreateRequest hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
   */
  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCreateRequest completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
   */
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", required = true, value = "A message for people who complete the form to let them know what happens next.")
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormCreateRequest status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public LeadFormStatus getStatus() {
    return status;
  }

  public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

  public LeadFormCreateRequest disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   * @return disclosureLanguage
   */
  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  public LeadFormCreateRequest questions(List<LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormCreateRequest addQuestionsItem(LeadFormQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

  /**
   * List of questions to be displayed on the lead form.
   * @return questions
   */
  @ApiModelProperty(example = "[{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}]", required = true, value = "List of questions to be displayed on the lead form.")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormCreateRequest policyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormCreateRequest addPolicyLinksItem(LeadFormCommonPolicyLinksInner policyLinksItem) {
    if (this.policyLinks == null) {
      this.policyLinks = new ArrayList<>();
    }
    this.policyLinks.add(policyLinksItem);
    return this;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
   */
  @ApiModelProperty(example = "[{label=Copyright, link=https://policy.pinterest.com/en/copyright}]", value = "List of additional policy links to be displayed on the lead form.")
  public List<LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCreateRequest leadFormCreateRequest = (LeadFormCreateRequest) o;
    return Objects.equals(this.name, leadFormCreateRequest.name) &&
        Objects.equals(this.privacyPolicyLink, leadFormCreateRequest.privacyPolicyLink) &&
        Objects.equals(this.hasAcceptedTerms, leadFormCreateRequest.hasAcceptedTerms) &&
        Objects.equals(this.completionMessage, leadFormCreateRequest.completionMessage) &&
        Objects.equals(this.status, leadFormCreateRequest.status) &&
        Objects.equals(this.disclosureLanguage, leadFormCreateRequest.disclosureLanguage) &&
        Objects.equals(this.questions, leadFormCreateRequest.questions) &&
        Objects.equals(this.policyLinks, leadFormCreateRequest.policyLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyLink, hasAcceptedTerms, completionMessage, status, disclosureLanguage, questions, policyLinks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


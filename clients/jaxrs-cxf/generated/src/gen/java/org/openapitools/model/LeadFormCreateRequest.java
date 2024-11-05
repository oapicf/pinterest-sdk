package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormCommonPolicyLinksInner;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormCreateRequest  {
  
  @ApiModelProperty(example = "Lead Form 3/14/2023", required = true, value = "Internal name of the lead form.")
 /**
   * Internal name of the lead form.
  **/
  private String name;

  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", required = true, value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
 /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  **/
  private String privacyPolicyLink;

  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO")
 /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
  **/
  private Boolean hasAcceptedTerms;

  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", required = true, value = "A message for people who complete the form to let them know what happens next.")
 /**
   * A message for people who complete the form to let them know what happens next.
  **/
  private String completionMessage;

  @ApiModelProperty(value = "")
  @Valid
  private LeadFormStatus status;

  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
 /**
   * Additional disclosure language to be included in the lead form.
  **/
  private String disclosureLanguage;

  @ApiModelProperty(example = "[{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}]", required = true, value = "List of questions to be displayed on the lead form.")
  @Valid
 /**
   * List of questions to be displayed on the lead form.
  **/
  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

  @ApiModelProperty(example = "[{label=Copyright, link=https://policy.pinterest.com/en/copyright}]", value = "List of additional policy links to be displayed on the lead form.")
  @Valid
 /**
   * List of additional policy links to be displayed on the lead form.
  **/
  private List<@Valid LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>();
 /**
   * Internal name of the lead form.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadFormCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
   * @return privacyPolicyLink
  **/
  @JsonProperty("privacy_policy_link")
  @NotNull
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormCreateRequest privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

 /**
   * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
  **/
  @JsonProperty("has_accepted_terms")
  @NotNull
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCreateRequest hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

 /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
  **/
  @JsonProperty("completion_message")
  @NotNull
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormCreateRequest completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public LeadFormStatus getStatus() {
    return status;
  }

  public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

  public LeadFormCreateRequest status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

 /**
   * Additional disclosure language to be included in the lead form.
   * @return disclosureLanguage
  **/
  @JsonProperty("disclosure_language")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  public LeadFormCreateRequest disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

 /**
   * List of questions to be displayed on the lead form.
   * @return questions
  **/
  @JsonProperty("questions")
  @NotNull
 @Size(min=0,max=10)  public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormCreateRequest questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormCreateRequest addQuestionsItem(LeadFormQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
  **/
  @JsonProperty("policy_links")
 @Size(min=0,max=3)  public List<@Valid LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<@Valid LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadFormCreateRequest policyLinks(List<@Valid LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormCreateRequest addPolicyLinksItem(LeadFormCommonPolicyLinksInner policyLinksItem) {
    this.policyLinks.add(policyLinksItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


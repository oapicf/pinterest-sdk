package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.LeadFormPolicyLink;
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
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormCreate   {
  @JsonProperty("completion_message")
  private String completionMessage;

  @JsonProperty("disclosure_language")
  private String disclosureLanguage;

  @JsonProperty("has_accepted_terms")
  private Boolean hasAcceptedTerms;

  @JsonProperty("name")
  private String name;

  @JsonProperty("policy_links")
  
  private List<LeadFormPolicyLink> policyLinks = null;

  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  @JsonProperty("questions")
  
  private List<LeadFormQuestion> questions = new ArrayList<>();

  @JsonProperty("status")
  private LeadFormStatus status;

  public LeadFormCreate completionMessage(String completionMessage) {
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

  public LeadFormCreate disclosureLanguage(String disclosureLanguage) {
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

  public LeadFormCreate hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
   */
  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCreate name(String name) {
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

  public LeadFormCreate policyLinks(List<LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormCreate addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
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
  @ApiModelProperty(example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", value = "List of additional policy links to be displayed on the lead form.")
  public List<LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadFormCreate privacyPolicyLink(String privacyPolicyLink) {
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

  public LeadFormCreate questions(List<LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormCreate addQuestionsItem(LeadFormQuestion questionsItem) {
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
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", required = true, value = "List of questions to be displayed on the lead form.")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormCreate status(LeadFormStatus status) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCreate leadFormCreate = (LeadFormCreate) o;
    return Objects.equals(this.completionMessage, leadFormCreate.completionMessage) &&
        Objects.equals(this.disclosureLanguage, leadFormCreate.disclosureLanguage) &&
        Objects.equals(this.hasAcceptedTerms, leadFormCreate.hasAcceptedTerms) &&
        Objects.equals(this.name, leadFormCreate.name) &&
        Objects.equals(this.policyLinks, leadFormCreate.policyLinks) &&
        Objects.equals(this.privacyPolicyLink, leadFormCreate.privacyPolicyLink) &&
        Objects.equals(this.questions, leadFormCreate.questions) &&
        Objects.equals(this.status, leadFormCreate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, disclosureLanguage, hasAcceptedTerms, name, policyLinks, privacyPolicyLink, questions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCreate {\n");
    
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


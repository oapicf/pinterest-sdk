package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormPolicyLink;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Resource create operation model.
 **/
@ApiModel(description = "Resource create operation model.")
@JsonTypeName("LeadFormCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormCreate   {
  private String completionMessage;
  private String disclosureLanguage;
  private Boolean hasAcceptedTerms;
  private String name;
  private @Valid List<@Valid LeadFormPolicyLink> policyLinks = new ArrayList<>();
  private String privacyPolicyLink;
  private @Valid List<@Valid LeadFormQuestion> questions = new ArrayList<>();
  private LeadFormStatus status;

  public LeadFormCreate() {
  }

  @JsonCreator
  public LeadFormCreate(
    @JsonProperty(required = true, value = "completion_message") String completionMessage,
    @JsonProperty(required = true, value = "has_accepted_terms") Boolean hasAcceptedTerms,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "privacy_policy_link") String privacyPolicyLink,
    @JsonProperty(required = true, value = "questions") List<@Valid LeadFormQuestion> questions
  ) {
    this.completionMessage = completionMessage;
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.name = name;
    this.privacyPolicyLink = privacyPolicyLink;
    this.questions = questions;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   **/
  public LeadFormCreate completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

  
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", required = true, value = "A message for people who complete the form to let them know what happens next.")
  @JsonProperty(required = true, value = "completion_message")
  @NotNull public String getCompletionMessage() {
    return completionMessage;
  }

  @JsonProperty(required = true, value = "completion_message")
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   **/
  public LeadFormCreate disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

  
  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
  @JsonProperty("disclosure_language")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  @JsonProperty("disclosure_language")
  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  /**
   * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   **/
  public LeadFormCreate hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  
  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
  @JsonProperty(required = true, value = "has_accepted_terms")
  @NotNull public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  @JsonProperty(required = true, value = "has_accepted_terms")
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * Internal name of the lead form.
   **/
  public LeadFormCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Lead Form 3/14/2023", required = true, value = "Internal name of the lead form.")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   **/
  public LeadFormCreate policyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", value = "List of additional policy links to be displayed on the lead form.")
  @JsonProperty("policy_links")
  @Valid  @Size(min=0,max=3)public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  @JsonProperty("policy_links")
  public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadFormCreate addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (this.policyLinks == null) {
      this.policyLinks = new ArrayList<>();
    }

    this.policyLinks.add(policyLinksItem);
    return this;
  }

  public LeadFormCreate removePolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (policyLinksItem != null && this.policyLinks != null) {
      this.policyLinks.remove(policyLinksItem);
    }

    return this;
  }
  /**
   * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
   **/
  public LeadFormCreate privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", required = true, value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  @JsonProperty(required = true, value = "privacy_policy_link")
  @NotNull public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  @JsonProperty(required = true, value = "privacy_policy_link")
  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  /**
   * List of questions to be displayed on the lead form.
   **/
  public LeadFormCreate questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", required = true, value = "List of questions to be displayed on the lead form.")
  @JsonProperty(required = true, value = "questions")
  @NotNull @Valid  @Size(min=0,max=10)public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  @JsonProperty(required = true, value = "questions")
  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormCreate addQuestionsItem(LeadFormQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }

    this.questions.add(questionsItem);
    return this;
  }

  public LeadFormCreate removeQuestionsItem(LeadFormQuestion questionsItem) {
    if (questionsItem != null && this.questions != null) {
      this.questions.remove(questionsItem);
    }

    return this;
  }
  /**
   **/
  public LeadFormCreate status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public LeadFormStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
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

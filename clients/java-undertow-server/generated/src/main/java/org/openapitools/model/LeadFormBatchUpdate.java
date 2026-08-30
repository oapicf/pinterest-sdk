/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormPolicyLink;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormBatchUpdate   {
  
  private String completionMessage;
  private String disclosureLanguage;
  private Boolean hasAcceptedTerms;
  private String id;
  private String name;
  private List<LeadFormPolicyLink> policyLinks = new ArrayList<>();
  private String privacyPolicyLink;
  private List<LeadFormQuestion> questions = new ArrayList<>();
  private LeadFormStatus status;

  /**
   * A message for people who complete the form to let them know what happens next.
   */
  public LeadFormBatchUpdate completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

  
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", value = "A message for people who complete the form to let them know what happens next.")
  @JsonProperty("completion_message")
  public String getCompletionMessage() {
    return completionMessage;
  }
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   */
  public LeadFormBatchUpdate disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

  
  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
  @JsonProperty("disclosure_language")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }
  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   */
  public LeadFormBatchUpdate hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * The ID of this lead form
   */
  public LeadFormBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of this lead form")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Internal name of the lead form.
   */
  public LeadFormBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Lead Form 3/14/2023", value = "Internal name of the lead form.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   */
  public LeadFormBatchUpdate policyLinks(List<LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", value = "List of additional policy links to be displayed on the lead form.")
  @JsonProperty("policy_links")
  public List<LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }
  public void setPolicyLinks(List<LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   */
  public LeadFormBatchUpdate privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  @JsonProperty("privacy_policy_link")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }
  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  /**
   * List of questions to be displayed on the lead form.
   */
  public LeadFormBatchUpdate questions(List<LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", value = "List of questions to be displayed on the lead form.")
  @JsonProperty("questions")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  /**
   */
  public LeadFormBatchUpdate status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
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
    LeadFormBatchUpdate leadFormBatchUpdate = (LeadFormBatchUpdate) o;
    return Objects.equals(completionMessage, leadFormBatchUpdate.completionMessage) &&
        Objects.equals(disclosureLanguage, leadFormBatchUpdate.disclosureLanguage) &&
        Objects.equals(hasAcceptedTerms, leadFormBatchUpdate.hasAcceptedTerms) &&
        Objects.equals(id, leadFormBatchUpdate.id) &&
        Objects.equals(name, leadFormBatchUpdate.name) &&
        Objects.equals(policyLinks, leadFormBatchUpdate.policyLinks) &&
        Objects.equals(privacyPolicyLink, leadFormBatchUpdate.privacyPolicyLink) &&
        Objects.equals(questions, leadFormBatchUpdate.questions) &&
        Objects.equals(status, leadFormBatchUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, disclosureLanguage, hasAcceptedTerms, id, name, policyLinks, privacyPolicyLink, questions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormBatchUpdate {\n");
    
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


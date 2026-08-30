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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadForm   {
  @JsonProperty("ad_account_id")
  private String adAccountId;

  @JsonProperty("completion_message")
  private String completionMessage;

  @JsonProperty("created_time")
  private Integer createdTime;

  @JsonProperty("disclosure_language")
  private String disclosureLanguage;

  @JsonProperty("has_accepted_terms")
  private Boolean hasAcceptedTerms;

  @JsonProperty("id")
  private String id;

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

  @JsonProperty("updated_time")
  private Integer updatedTime;

  /**
   * The Ad Account ID that this lead form belongs to.
   **/
  public LeadForm adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   **/
  public LeadForm completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

  
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", required = true, value = "A message for people who complete the form to let them know what happens next.")
  @JsonProperty("completion_message")
  public String getCompletionMessage() {
    return completionMessage;
  }
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  /**
   * Lead form creation time. Unix timestamp in seconds.
   **/
  public LeadForm createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  
  @ApiModelProperty(value = "Lead form creation time. Unix timestamp in seconds.")
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   **/
  public LeadForm disclosureLanguage(String disclosureLanguage) {
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
   **/
  public LeadForm hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  
  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * The ID of this lead form
   **/
  public LeadForm id(String id) {
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
   **/
  public LeadForm name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Lead Form 3/14/2023", required = true, value = "Internal name of the lead form.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   **/
  public LeadForm policyLinks(List<LeadFormPolicyLink> policyLinks) {
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
   **/
  public LeadForm privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", required = true, value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  @JsonProperty("privacy_policy_link")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }
  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  /**
   * List of questions to be displayed on the lead form.
   **/
  public LeadForm questions(List<LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", required = true, value = "List of questions to be displayed on the lead form.")
  @JsonProperty("questions")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  /**
   **/
  public LeadForm status(LeadFormStatus status) {
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

  /**
   * Last update time. Unix timestamp in seconds.
   **/
  public LeadForm updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadForm leadForm = (LeadForm) o;
    return Objects.equals(adAccountId, leadForm.adAccountId) &&
        Objects.equals(completionMessage, leadForm.completionMessage) &&
        Objects.equals(createdTime, leadForm.createdTime) &&
        Objects.equals(disclosureLanguage, leadForm.disclosureLanguage) &&
        Objects.equals(hasAcceptedTerms, leadForm.hasAcceptedTerms) &&
        Objects.equals(id, leadForm.id) &&
        Objects.equals(name, leadForm.name) &&
        Objects.equals(policyLinks, leadForm.policyLinks) &&
        Objects.equals(privacyPolicyLink, leadForm.privacyPolicyLink) &&
        Objects.equals(questions, leadForm.questions) &&
        Objects.equals(status, leadForm.status) &&
        Objects.equals(updatedTime, leadForm.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, completionMessage, createdTime, disclosureLanguage, hasAcceptedTerms, id, name, policyLinks, privacyPolicyLink, questions, status, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadForm {\n");
    
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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


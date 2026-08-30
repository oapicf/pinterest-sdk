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

/**
 * LeadForm
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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
  private List<@Valid LeadFormPolicyLink> policyLinks = null;

  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  @JsonProperty("questions")
  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

  @JsonProperty("status")
  private LeadFormStatus status;

  @JsonProperty("updated_time")
  private Integer updatedTime;

   /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
  **/
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  public String getAdAccountId() {
    return adAccountId;
  }

  public LeadForm completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

   /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
  **/
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", required = true, value = "A message for people who complete the form to let them know what happens next.")
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

   /**
   * Lead form creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @ApiModelProperty(value = "Lead form creation time. Unix timestamp in seconds.")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public LeadForm disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

   /**
   * Additional disclosure language to be included in the lead form.
   * @return disclosureLanguage
  **/
  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  public LeadForm hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

   /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
  **/
  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadForm id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this lead form
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of this lead form")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LeadForm name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Internal name of the lead form.
   * @return name
  **/
  @ApiModelProperty(example = "Lead Form 3/14/2023", required = true, value = "Internal name of the lead form.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadForm policyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadForm addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (this.policyLinks == null) {
      this.policyLinks = new ArrayList<>();
    }
    this.policyLinks.add(policyLinksItem);
    return this;
  }

   /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
  **/
  @ApiModelProperty(example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", value = "List of additional policy links to be displayed on the lead form.")
  public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadForm privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

   /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   * @return privacyPolicyLink
  **/
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", required = true, value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadForm questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadForm addQuestionsItem(LeadFormQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * List of questions to be displayed on the lead form.
   * @return questions
  **/
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", required = true, value = "List of questions to be displayed on the lead form.")
  public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadForm status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public LeadFormStatus getStatus() {
    return status;
  }

  public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

   /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")
  public Integer getUpdatedTime() {
    return updatedTime;
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
    return Objects.equals(this.adAccountId, leadForm.adAccountId) &&
        Objects.equals(this.completionMessage, leadForm.completionMessage) &&
        Objects.equals(this.createdTime, leadForm.createdTime) &&
        Objects.equals(this.disclosureLanguage, leadForm.disclosureLanguage) &&
        Objects.equals(this.hasAcceptedTerms, leadForm.hasAcceptedTerms) &&
        Objects.equals(this.id, leadForm.id) &&
        Objects.equals(this.name, leadForm.name) &&
        Objects.equals(this.policyLinks, leadForm.policyLinks) &&
        Objects.equals(this.privacyPolicyLink, leadForm.privacyPolicyLink) &&
        Objects.equals(this.questions, leadForm.questions) &&
        Objects.equals(this.status, leadForm.status) &&
        Objects.equals(this.updatedTime, leadForm.updatedTime);
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


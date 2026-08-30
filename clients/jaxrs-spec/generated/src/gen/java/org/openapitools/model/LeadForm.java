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



@JsonTypeName("LeadForm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadForm   {
  private String adAccountId;
  private String completionMessage;
  private Integer createdTime;
  private String disclosureLanguage;
  private Boolean hasAcceptedTerms;
  private String id;
  private String name;
  private @Valid List<@Valid LeadFormPolicyLink> policyLinks = new ArrayList<>();
  private String privacyPolicyLink;
  private @Valid List<@Valid LeadFormQuestion> questions = new ArrayList<>();
  private LeadFormStatus status;
  private Integer updatedTime;

  public LeadForm() {
  }

  @JsonCreator
  public LeadForm(
    @JsonProperty(required = true, value = "completion_message") String completionMessage,
    @JsonProperty(required = true, value = "has_accepted_terms") Boolean hasAcceptedTerms,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "privacy_policy_link") String privacyPolicyLink,
    @JsonProperty(required = true, value = "questions") List<@Valid LeadFormQuestion> questions
  ) {
    this.completionMessage = completionMessage;
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.id = id;
    this.name = name;
    this.privacyPolicyLink = privacyPolicyLink;
    this.questions = questions;
  }

  /**
   * The Ad Account ID that this lead form belongs to.
   **/
  public LeadForm adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  @JsonProperty("ad_account_id")
   @Pattern(regexp="^\\d+$")public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
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
  @JsonProperty(required = true, value = "completion_message")
  @NotNull public String getCompletionMessage() {
    return completionMessage;
  }

  @JsonProperty(required = true, value = "completion_message")
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

  @JsonProperty("created_time")
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

  @JsonProperty("disclosure_language")
  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  /**
   * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   **/
  public LeadForm hasAcceptedTerms(Boolean hasAcceptedTerms) {
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
   * The ID of this lead form
   **/
  public LeadForm id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of this lead form")
  @JsonProperty(required = true, value = "id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  public LeadForm policyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
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

  public LeadForm addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (this.policyLinks == null) {
      this.policyLinks = new ArrayList<>();
    }

    this.policyLinks.add(policyLinksItem);
    return this;
  }

  public LeadForm removePolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (policyLinksItem != null && this.policyLinks != null) {
      this.policyLinks.remove(policyLinksItem);
    }

    return this;
  }
  /**
   * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
   **/
  public LeadForm privacyPolicyLink(String privacyPolicyLink) {
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
  public LeadForm questions(List<@Valid LeadFormQuestion> questions) {
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

  public LeadForm addQuestionsItem(LeadFormQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }

    this.questions.add(questionsItem);
    return this;
  }

  public LeadForm removeQuestionsItem(LeadFormQuestion questionsItem) {
    if (questionsItem != null && this.questions != null) {
      this.questions.remove(questionsItem);
    }

    return this;
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

  @JsonProperty("status")
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

  @JsonProperty("updated_time")
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

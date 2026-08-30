package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormPolicyLink;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadForm  {
  
 /**
  * The Ad Account ID that this lead form belongs to.
  */
  @ApiModelProperty(value = "The Ad Account ID that this lead form belongs to.")
  private String adAccountId;

 /**
  * A message for people who complete the form to let them know what happens next.
  */
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", required = true, value = "A message for people who complete the form to let them know what happens next.")
  private String completionMessage;

 /**
  * Lead form creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Lead form creation time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * Additional disclosure language to be included in the lead form.
  */
  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
  private String disclosureLanguage;

 /**
  * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
  */
  @ApiModelProperty(example = "false", required = true, value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
  private Boolean hasAcceptedTerms;

 /**
  * The ID of this lead form
  */
  @ApiModelProperty(required = true, value = "The ID of this lead form")
  private String id;

 /**
  * Internal name of the lead form.
  */
  @ApiModelProperty(example = "Lead Form 3/14/2023", required = true, value = "Internal name of the lead form.")
  private String name;

 /**
  * List of additional policy links to be displayed on the lead form.
  */
  @ApiModelProperty(example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", value = "List of additional policy links to be displayed on the lead form.")
  @Valid
  private List<@Valid LeadFormPolicyLink> policyLinks = new ArrayList<>();

 /**
  * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  */
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", required = true, value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  private String privacyPolicyLink;

 /**
  * List of questions to be displayed on the lead form.
  */
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", required = true, value = "List of questions to be displayed on the lead form.")
  @Valid
  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private LeadFormStatus status;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(value = "Last update time. Unix timestamp in seconds.")
  private Integer updatedTime;
 /**
  * The Ad Account ID that this lead form belongs to.
  * @return adAccountId
  */
  @JsonProperty("ad_account_id")
 @Pattern(regexp="^\\d+$")  public String getAdAccountId() {
    return adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   * <br><em>N.B. <code>adAccountId</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LeadForm adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
  * A message for people who complete the form to let them know what happens next.
  * @return completionMessage
  */
  @JsonProperty("completion_message")
  @NotNull
  public String getCompletionMessage() {
    return completionMessage;
  }

  /**
   * Sets the <code>completionMessage</code> property.
   */
 public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  /**
   * Sets the <code>completionMessage</code> property.
   */
  public LeadForm completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

 /**
  * Lead form creation time. Unix timestamp in seconds.
  * @return createdTime
  */
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   * <br><em>N.B. <code>createdTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LeadForm createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
  * Additional disclosure language to be included in the lead form.
  * @return disclosureLanguage
  */
  @JsonProperty("disclosure_language")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  /**
   * Sets the <code>disclosureLanguage</code> property.
   */
 public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  /**
   * Sets the <code>disclosureLanguage</code> property.
   */
  public LeadForm disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

 /**
  * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
  * @return hasAcceptedTerms
  */
  @JsonProperty("has_accepted_terms")
  @NotNull
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  /**
   * Sets the <code>hasAcceptedTerms</code> property.
   */
 public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * Sets the <code>hasAcceptedTerms</code> property.
   */
  public LeadForm hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

 /**
  * The ID of this lead form
  * @return id
  */
  @JsonProperty("id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public LeadForm id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Internal name of the lead form.
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public LeadForm name(String name) {
    this.name = name;
    return this;
  }

 /**
  * List of additional policy links to be displayed on the lead form.
  * @return policyLinks
  */
  @JsonProperty("policy_links")
 @Size(min=0,max=3)  public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  /**
   * Sets the <code>policyLinks</code> property.
   */
 public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  /**
   * Sets the <code>policyLinks</code> property.
   */
  public LeadForm policyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  /**
   * Adds a new item to the <code>policyLinks</code> list.
   */
  public LeadForm addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    this.policyLinks.add(policyLinksItem);
    return this;
  }

 /**
  * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
  * @return privacyPolicyLink
  */
  @JsonProperty("privacy_policy_link")
  @NotNull
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  /**
   * Sets the <code>privacyPolicyLink</code> property.
   */
 public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  /**
   * Sets the <code>privacyPolicyLink</code> property.
   */
  public LeadForm privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

 /**
  * List of questions to be displayed on the lead form.
  * @return questions
  */
  @JsonProperty("questions")
  @NotNull
 @Size(min=0,max=10)  public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  /**
   * Sets the <code>questions</code> property.
   */
 public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  /**
   * Sets the <code>questions</code> property.
   */
  public LeadForm questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  /**
   * Adds a new item to the <code>questions</code> list.
   */
  public LeadForm addQuestionsItem(LeadFormQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public LeadFormStatus getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public LeadForm status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

 /**
  * Last update time. Unix timestamp in seconds.
  * @return updatedTime
  */
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   * <br><em>N.B. <code>updatedTime</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public LeadForm updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


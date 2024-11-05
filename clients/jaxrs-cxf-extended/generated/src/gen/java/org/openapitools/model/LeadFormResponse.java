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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormResponse  {
  
 /**
  * Internal name of the lead form.
  */
  @ApiModelProperty(example = "Lead Form 3/14/2023", value = "Internal name of the lead form.")
  private String name;

 /**
  * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  */
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  private String privacyPolicyLink;

 /**
  * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
  */
  @ApiModelProperty(example = "false", value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO")
  private Boolean hasAcceptedTerms;

 /**
  * A message for people who complete the form to let them know what happens next.
  */
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", value = "A message for people who complete the form to let them know what happens next.")
  private String completionMessage;

  @ApiModelProperty(value = "")
  @Valid
  private LeadFormStatus status;

 /**
  * Additional disclosure language to be included in the lead form.
  */
  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
  private String disclosureLanguage;

 /**
  * List of questions to be displayed on the lead form.
  */
  @ApiModelProperty(example = "[{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}]", value = "List of questions to be displayed on the lead form.")
  @Valid
  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

 /**
  * List of additional policy links to be displayed on the lead form.
  */
  @ApiModelProperty(example = "[{label=Copyright, link=https://policy.pinterest.com/en/copyright}]", value = "List of additional policy links to be displayed on the lead form.")
  @Valid
  private List<@Valid LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>();

 /**
  * The ID of this lead form
  */
  @ApiModelProperty(example = "7765300871171", value = "The ID of this lead form")
  private String id;

 /**
  * The Ad Account ID that this lead form belongs to.
  */
  @ApiModelProperty(example = "549755885175", value = "The Ad Account ID that this lead form belongs to.")
  private String adAccountId;

 /**
  * Lead form creation time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Lead form creation time. Unix timestamp in seconds.")
  private Integer createdTime;

 /**
  * Last update time. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
  private Integer updatedTime;
 /**
  * Internal name of the lead form.
  * @return name
  */
  @JsonProperty("name")
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
  public LeadFormResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
  * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
  * @return privacyPolicyLink
  */
  @JsonProperty("privacy_policy_link")
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
  public LeadFormResponse privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

 /**
  * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO
  * @return hasAcceptedTerms
  */
  @JsonProperty("has_accepted_terms")
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
  public LeadFormResponse hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

 /**
  * A message for people who complete the form to let them know what happens next.
  * @return completionMessage
  */
  @JsonProperty("completion_message")
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
  public LeadFormResponse completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
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
  public LeadFormResponse status(LeadFormStatus status) {
    this.status = status;
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
  public LeadFormResponse disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

 /**
  * List of questions to be displayed on the lead form.
  * @return questions
  */
  @JsonProperty("questions")
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
  public LeadFormResponse questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  /**
   * Adds a new item to the <code>questions</code> list.
   */
  public LeadFormResponse addQuestionsItem(LeadFormQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
  * List of additional policy links to be displayed on the lead form.
  * @return policyLinks
  */
  @JsonProperty("policy_links")
 @Size(min=0,max=3)  public List<@Valid LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }

  /**
   * Sets the <code>policyLinks</code> property.
   */
 public void setPolicyLinks(List<@Valid LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }

  /**
   * Sets the <code>policyLinks</code> property.
   */
  public LeadFormResponse policyLinks(List<@Valid LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  /**
   * Adds a new item to the <code>policyLinks</code> list.
   */
  public LeadFormResponse addPolicyLinksItem(LeadFormCommonPolicyLinksInner policyLinksItem) {
    this.policyLinks.add(policyLinksItem);
    return this;
  }

 /**
  * The ID of this lead form
  * @return id
  */
  @JsonProperty("id")
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
  public LeadFormResponse id(String id) {
    this.id = id;
    return this;
  }

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
   */
 public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  /**
   * Sets the <code>adAccountId</code> property.
   */
  public LeadFormResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
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
   */
 public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  /**
   * Sets the <code>createdTime</code> property.
   */
  public LeadFormResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
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
   */
 public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  /**
   * Sets the <code>updatedTime</code> property.
   */
  public LeadFormResponse updatedTime(Integer updatedTime) {
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
    LeadFormResponse leadFormResponse = (LeadFormResponse) o;
    return Objects.equals(this.name, leadFormResponse.name) &&
        Objects.equals(this.privacyPolicyLink, leadFormResponse.privacyPolicyLink) &&
        Objects.equals(this.hasAcceptedTerms, leadFormResponse.hasAcceptedTerms) &&
        Objects.equals(this.completionMessage, leadFormResponse.completionMessage) &&
        Objects.equals(this.status, leadFormResponse.status) &&
        Objects.equals(this.disclosureLanguage, leadFormResponse.disclosureLanguage) &&
        Objects.equals(this.questions, leadFormResponse.questions) &&
        Objects.equals(this.policyLinks, leadFormResponse.policyLinks) &&
        Objects.equals(this.id, leadFormResponse.id) &&
        Objects.equals(this.adAccountId, leadFormResponse.adAccountId) &&
        Objects.equals(this.createdTime, leadFormResponse.createdTime) &&
        Objects.equals(this.updatedTime, leadFormResponse.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyLink, hasAcceptedTerms, completionMessage, status, disclosureLanguage, questions, policyLinks, id, adAccountId, createdTime, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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


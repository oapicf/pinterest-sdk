package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormCommonPolicyLinksInner;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadFormResponse  {
  
  @ApiModelProperty(example = "Lead Form 3/14/2023", value = "Internal name of the lead form.")
 /**
   * Internal name of the lead form.
  **/
  private String name;

  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
 /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
  **/
  private String privacyPolicyLink;

  @ApiModelProperty(example = "false", value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO")
 /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
  **/
  private Boolean hasAcceptedTerms;

  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", value = "A message for people who complete the form to let them know what happens next.")
 /**
   * A message for people who complete the form to let them know what happens next.
  **/
  private String completionMessage;

  @ApiModelProperty(value = "")
  private LeadFormStatus status;

  @ApiModelProperty(example = "By entering your personal information, you agree that your data will be collected and used.", value = "Additional disclosure language to be included in the lead form.")
 /**
   * Additional disclosure language to be included in the lead form.
  **/
  private String disclosureLanguage;

  @ApiModelProperty(example = "[{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}]", value = "List of questions to be displayed on the lead form.")
 /**
   * List of questions to be displayed on the lead form.
  **/
  private List<LeadFormQuestion> questions = new ArrayList<>();

  @ApiModelProperty(example = "[{label=Copyright, link=https://policy.pinterest.com/en/copyright}]", value = "List of additional policy links to be displayed on the lead form.")
 /**
   * List of additional policy links to be displayed on the lead form.
  **/
  private List<LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>();

  @ApiModelProperty(example = "7765300871171", value = "The ID of this lead form")
 /**
   * The ID of this lead form
  **/
  private String id;

  @ApiModelProperty(example = "549755885175", value = "The Ad Account ID that this lead form belongs to.")
 /**
   * The Ad Account ID that this lead form belongs to.
  **/
  private String adAccountId;

  @ApiModelProperty(example = "1451431341", value = "Lead form creation time. Unix timestamp in seconds.")
 /**
   * Lead form creation time. Unix timestamp in seconds.
  **/
  private Integer createdTime;

  @ApiModelProperty(example = "1451431341", value = "Last update time. Unix timestamp in seconds.")
 /**
   * Last update time. Unix timestamp in seconds.
  **/
  private Integer updatedTime;
 /**
   * Internal name of the lead form.
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadFormResponse name(String name) {
    this.name = name;
    return this;
  }

 /**
   * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
   * @return privacyPolicyLink
  **/
  @JsonProperty("privacy_policy_link")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormResponse privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

 /**
   * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
  **/
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormResponse hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

 /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
  **/
  @JsonProperty("completion_message")
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormResponse completionMessage(String completionMessage) {
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

  public LeadFormResponse status(LeadFormStatus status) {
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

  public LeadFormResponse disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

 /**
   * List of questions to be displayed on the lead form.
   * @return questions
  **/
  @JsonProperty("questions")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormResponse questions(List<LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormResponse addQuestionsItem(LeadFormQuestion questionsItem) {
    this.questions.add(questionsItem);
    return this;
  }

 /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
  **/
  @JsonProperty("policy_links")
  public List<LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadFormResponse policyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormResponse addPolicyLinksItem(LeadFormCommonPolicyLinksInner policyLinksItem) {
    this.policyLinks.add(policyLinksItem);
    return this;
  }

 /**
   * The ID of this lead form
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LeadFormResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
  **/
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public LeadFormResponse adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

 /**
   * Lead form creation time. Unix timestamp in seconds.
   * @return createdTime
  **/
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public LeadFormResponse createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

 /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
  **/
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

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


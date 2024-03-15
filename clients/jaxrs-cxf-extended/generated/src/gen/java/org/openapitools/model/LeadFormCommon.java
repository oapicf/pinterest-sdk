package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Creation fields
 */
@ApiModel(description="Creation fields")

public class LeadFormCommon  {
  
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
  * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
  */
  @ApiModelProperty(example = "false", value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.")
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
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", value = "List of questions to be displayed on the lead form.")
  @Valid
  private List<@Valid LeadFormQuestion> questions;
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
  public LeadFormCommon name(String name) {
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
  public LeadFormCommon privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

 /**
  * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.
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
  public LeadFormCommon hasAcceptedTerms(Boolean hasAcceptedTerms) {
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
  public LeadFormCommon completionMessage(String completionMessage) {
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
  public LeadFormCommon status(LeadFormStatus status) {
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
  public LeadFormCommon disclosureLanguage(String disclosureLanguage) {
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
  public LeadFormCommon questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  /**
   * Adds a new item to the <code>questions</code> list.
   */
  public LeadFormCommon addQuestionsItem(LeadFormQuestion questionsItem) {
    this.questions.add(questionsItem);
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
    LeadFormCommon leadFormCommon = (LeadFormCommon) o;
    return Objects.equals(this.name, leadFormCommon.name) &&
        Objects.equals(this.privacyPolicyLink, leadFormCommon.privacyPolicyLink) &&
        Objects.equals(this.hasAcceptedTerms, leadFormCommon.hasAcceptedTerms) &&
        Objects.equals(this.completionMessage, leadFormCommon.completionMessage) &&
        Objects.equals(this.status, leadFormCommon.status) &&
        Objects.equals(this.disclosureLanguage, leadFormCommon.disclosureLanguage) &&
        Objects.equals(this.questions, leadFormCommon.questions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyLink, hasAcceptedTerms, completionMessage, status, disclosureLanguage, questions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCommon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
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


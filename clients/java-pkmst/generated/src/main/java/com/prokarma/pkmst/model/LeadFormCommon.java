package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Creation fields
 */
@ApiModel(description = "Creation fields")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LeadFormCommon   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  @JsonProperty("has_accepted_terms")
  private Boolean hasAcceptedTerms;

  @JsonProperty("completion_message")
  private String completionMessage;

  @JsonProperty("status")
  private LeadFormStatus status;

  @JsonProperty("disclosure_language")
  private String disclosureLanguage;

  @JsonProperty("questions")
  
  private List<LeadFormQuestion> questions = null;

  public LeadFormCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Internal name of the lead form.
   * @return name
  **/
  @ApiModelProperty(example = "Lead Form 3/14/2023", value = "Internal name of the lead form.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadFormCommon privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

   /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   * @return privacyPolicyLink
  **/
  @ApiModelProperty(example = "https://www.advertisername.com/privacy-policy", value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormCommon hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

   /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
   * @return hasAcceptedTerms
  **/
  @ApiModelProperty(example = "false", value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCommon completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

   /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
  **/
  @ApiModelProperty(example = "Thank you for submitting. We will contact you soon.", value = "A message for people who complete the form to let them know what happens next.")
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormCommon status(LeadFormStatus status) {
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

  public LeadFormCommon disclosureLanguage(String disclosureLanguage) {
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

  public LeadFormCommon questions(List<LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormCommon addQuestionsItem(LeadFormQuestion questionsItem) {
    if (this.questions == null) {
      this.questions = new ArrayList<>();
    }
    this.questions.add(questionsItem);
    return this;
  }

   /**
   * List of questions to be displayed on the lead form.
   * @return questions
  **/
  @ApiModelProperty(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", value = "List of questions to be displayed on the lead form.")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


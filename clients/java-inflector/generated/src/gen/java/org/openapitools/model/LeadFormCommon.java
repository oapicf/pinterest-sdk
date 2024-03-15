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
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;



/**
 * Creation fields
 **/

@ApiModel(description = "Creation fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  /**
   * Internal name of the lead form.
   **/
  public LeadFormCommon name(String name) {
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
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   **/
  public LeadFormCommon privacyPolicyLink(String privacyPolicyLink) {
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
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
   **/
  public LeadFormCommon hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.")
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   **/
  public LeadFormCommon completionMessage(String completionMessage) {
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
   **/
  public LeadFormCommon status(LeadFormStatus status) {
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
   * Additional disclosure language to be included in the lead form.
   **/
  public LeadFormCommon disclosureLanguage(String disclosureLanguage) {
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
   * List of questions to be displayed on the lead form.
   **/
  public LeadFormCommon questions(List<LeadFormQuestion> questions) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCommon leadFormCommon = (LeadFormCommon) o;
    return Objects.equals(name, leadFormCommon.name) &&
        Objects.equals(privacyPolicyLink, leadFormCommon.privacyPolicyLink) &&
        Objects.equals(hasAcceptedTerms, leadFormCommon.hasAcceptedTerms) &&
        Objects.equals(completionMessage, leadFormCommon.completionMessage) &&
        Objects.equals(status, leadFormCommon.status) &&
        Objects.equals(disclosureLanguage, leadFormCommon.disclosureLanguage) &&
        Objects.equals(questions, leadFormCommon.questions);
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


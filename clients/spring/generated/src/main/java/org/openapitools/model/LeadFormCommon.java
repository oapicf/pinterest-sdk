package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Creation fields
 */

@Schema(name = "LeadFormCommon", description = "Creation fields")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LeadFormCommon {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> privacyPolicyLink = JsonNullable.<String>undefined();

  private Boolean hasAcceptedTerms;

  private JsonNullable<String> completionMessage = JsonNullable.<String>undefined();

  private LeadFormStatus status;

  private JsonNullable<String> disclosureLanguage = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid LeadFormQuestion> questions;

  public LeadFormCommon name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Internal name of the lead form.
   * @return name
  */
  
  @Schema(name = "name", example = "Lead Form 3/14/2023", description = "Internal name of the lead form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public LeadFormCommon privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = JsonNullable.of(privacyPolicyLink);
    return this;
  }

  /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   * @return privacyPolicyLink
  */
  
  @Schema(name = "privacy_policy_link", example = "https://www.advertisername.com/privacy-policy", description = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("privacy_policy_link")
  public JsonNullable<String> getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(JsonNullable<String> privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormCommon hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
   * @return hasAcceptedTerms
  */
  
  @Schema(name = "has_accepted_terms", example = "false", description = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCommon completionMessage(String completionMessage) {
    this.completionMessage = JsonNullable.of(completionMessage);
    return this;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
  */
  
  @Schema(name = "completion_message", example = "Thank you for submitting. We will contact you soon.", description = "A message for people who complete the form to let them know what happens next.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completion_message")
  public JsonNullable<String> getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(JsonNullable<String> completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormCommon status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public LeadFormStatus getStatus() {
    return status;
  }

  public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

  public LeadFormCommon disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = JsonNullable.of(disclosureLanguage);
    return this;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   * @return disclosureLanguage
  */
  
  @Schema(name = "disclosure_language", example = "By entering your personal information, you agree that your data will be collected and used.", description = "Additional disclosure language to be included in the lead form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disclosure_language")
  public JsonNullable<String> getDisclosureLanguage() {
    return disclosureLanguage;
  }

  public void setDisclosureLanguage(JsonNullable<String> disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  public LeadFormCommon questions(List<@Valid LeadFormQuestion> questions) {
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
  */
  @Valid @Size(min = 0, max = 10) 
  @Schema(name = "questions", example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", description = "List of questions to be displayed on the lead form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("questions")
  public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
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
    return equalsNullable(this.name, leadFormCommon.name) &&
        equalsNullable(this.privacyPolicyLink, leadFormCommon.privacyPolicyLink) &&
        Objects.equals(this.hasAcceptedTerms, leadFormCommon.hasAcceptedTerms) &&
        equalsNullable(this.completionMessage, leadFormCommon.completionMessage) &&
        Objects.equals(this.status, leadFormCommon.status) &&
        equalsNullable(this.disclosureLanguage, leadFormCommon.disclosureLanguage) &&
        Objects.equals(this.questions, leadFormCommon.questions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(privacyPolicyLink), hasAcceptedTerms, hashCodeNullable(completionMessage), status, hashCodeNullable(disclosureLanguage), questions);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormPolicyLink;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "LeadFormCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadFormCreate {

  private JsonNullable<String> completionMessage = JsonNullable.<String>undefined();

  private JsonNullable<String> disclosureLanguage = JsonNullable.<String>undefined();

  private Boolean hasAcceptedTerms;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid LeadFormPolicyLink> policyLinks = new ArrayList<>();

  private JsonNullable<String> privacyPolicyLink = JsonNullable.<String>undefined();

  @Valid
  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

  private LeadFormStatus status;

  public LeadFormCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadFormCreate(String completionMessage, Boolean hasAcceptedTerms, String name, String privacyPolicyLink, List<@Valid LeadFormQuestion> questions) {
    this.completionMessage = JsonNullable.of(completionMessage);
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.name = JsonNullable.of(name);
    this.privacyPolicyLink = JsonNullable.of(privacyPolicyLink);
    this.questions = questions;
  }

  public LeadFormCreate completionMessage(String completionMessage) {
    this.completionMessage = JsonNullable.of(completionMessage);
    return this;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
   */
  @NotNull 
  @Schema(name = "completion_message", example = "Thank you for submitting. We will contact you soon.", description = "A message for people who complete the form to let them know what happens next.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("completion_message")
  public JsonNullable<String> getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(JsonNullable<String> completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormCreate disclosureLanguage(String disclosureLanguage) {
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

  public LeadFormCreate hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

  /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
   */
  @NotNull 
  @Schema(name = "has_accepted_terms", example = "false", description = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCreate name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Internal name of the lead form.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", example = "Lead Form 3/14/2023", description = "Internal name of the lead form.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public LeadFormCreate policyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormCreate addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (this.policyLinks == null) {
      this.policyLinks = new ArrayList<>();
    }
    this.policyLinks.add(policyLinksItem);
    return this;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
   */
  @Valid @Size(min = 0, max = 3) 
  @Schema(name = "policy_links", example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", description = "List of additional policy links to be displayed on the lead form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy_links")
  public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadFormCreate privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = JsonNullable.of(privacyPolicyLink);
    return this;
  }

  /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   * @return privacyPolicyLink
   */
  @NotNull 
  @Schema(name = "privacy_policy_link", example = "https://www.advertisername.com/privacy-policy", description = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("privacy_policy_link")
  public JsonNullable<String> getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(JsonNullable<String> privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormCreate questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormCreate addQuestionsItem(LeadFormQuestion questionsItem) {
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
  @NotNull @Valid @Size(min = 0, max = 10) 
  @Schema(name = "questions", example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", description = "List of questions to be displayed on the lead form.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("questions")
  public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormCreate status(LeadFormStatus status) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCreate leadFormCreate = (LeadFormCreate) o;
    return Objects.equals(this.completionMessage, leadFormCreate.completionMessage) &&
        equalsNullable(this.disclosureLanguage, leadFormCreate.disclosureLanguage) &&
        Objects.equals(this.hasAcceptedTerms, leadFormCreate.hasAcceptedTerms) &&
        Objects.equals(this.name, leadFormCreate.name) &&
        Objects.equals(this.policyLinks, leadFormCreate.policyLinks) &&
        Objects.equals(this.privacyPolicyLink, leadFormCreate.privacyPolicyLink) &&
        Objects.equals(this.questions, leadFormCreate.questions) &&
        Objects.equals(this.status, leadFormCreate.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, hashCodeNullable(disclosureLanguage), hasAcceptedTerms, name, policyLinks, privacyPolicyLink, questions, status);
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
    sb.append("class LeadFormCreate {\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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


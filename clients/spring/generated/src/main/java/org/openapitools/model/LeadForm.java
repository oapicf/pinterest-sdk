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
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LeadForm
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LeadForm {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String adAccountId;

  private JsonNullable<String> completionMessage = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer createdTime;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<String> disclosureLanguage = JsonNullable.<String>undefined();

  private Boolean hasAcceptedTerms;

  private String id;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid LeadFormPolicyLink> policyLinks = new ArrayList<>();

  private JsonNullable<String> privacyPolicyLink = JsonNullable.<String>undefined();

  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable LeadFormStatus status;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer updatedTime;

  public LeadForm() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public LeadForm(String completionMessage, Boolean hasAcceptedTerms, String id, String name, String privacyPolicyLink, List<@Valid LeadFormQuestion> questions) {
    this.completionMessage = JsonNullable.of(completionMessage);
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.id = id;
    this.name = JsonNullable.of(name);
    this.privacyPolicyLink = JsonNullable.of(privacyPolicyLink);
    this.questions = questions;
  }

  public LeadForm adAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * The Ad Account ID that this lead form belongs to.
   * @return adAccountId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The Ad Account ID that this lead form belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public @Nullable String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(@Nullable String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public LeadForm completionMessage(String completionMessage) {
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

  @JsonProperty("completion_message")
  public void setCompletionMessage(JsonNullable<String> completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadForm createdTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Lead form creation time. Unix timestamp in seconds.
   * @return createdTime
   */
  
  @Schema(name = "created_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Lead form creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public @Nullable Integer getCreatedTime() {
    return createdTime;
  }

  @JsonProperty("created_time")
  public void setCreatedTime(@Nullable Integer createdTime) {
    this.createdTime = createdTime;
  }

  public LeadForm disclosureLanguage(String disclosureLanguage) {
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

  public LeadForm hasAcceptedTerms(Boolean hasAcceptedTerms) {
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

  @JsonProperty("has_accepted_terms")
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
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", description = "The ID of this lead form", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public LeadForm name(String name) {
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

  @JsonProperty("name")
  public void setName(JsonNullable<String> name) {
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
   */
  @Valid @Size(min = 0, max = 3) 
  @Schema(name = "policy_links", example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", description = "List of additional policy links to be displayed on the lead form.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy_links")
  public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  @JsonProperty("policy_links")
  public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadForm privacyPolicyLink(String privacyPolicyLink) {
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

  @JsonProperty("privacy_policy_link")
  public void setPrivacyPolicyLink(JsonNullable<String> privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadForm questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadForm addQuestionsItem(LeadFormQuestion questionsItem) {
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

  @JsonProperty("questions")
  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadForm status(@Nullable LeadFormStatus status) {
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
  public @Nullable LeadFormStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable LeadFormStatus status) {
    this.status = status;
  }

  public LeadForm updatedTime(@Nullable Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * Last update time. Unix timestamp in seconds.
   * @return updatedTime
   */
  
  @Schema(name = "updated_time", accessMode = Schema.AccessMode.READ_ONLY, description = "Last update time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public @Nullable Integer getUpdatedTime() {
    return updatedTime;
  }

  @JsonProperty("updated_time")
  public void setUpdatedTime(@Nullable Integer updatedTime) {
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
        equalsNullable(this.disclosureLanguage, leadForm.disclosureLanguage) &&
        Objects.equals(this.hasAcceptedTerms, leadForm.hasAcceptedTerms) &&
        Objects.equals(this.id, leadForm.id) &&
        Objects.equals(this.name, leadForm.name) &&
        Objects.equals(this.policyLinks, leadForm.policyLinks) &&
        Objects.equals(this.privacyPolicyLink, leadForm.privacyPolicyLink) &&
        Objects.equals(this.questions, leadForm.questions) &&
        Objects.equals(this.status, leadForm.status) &&
        Objects.equals(this.updatedTime, leadForm.updatedTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, completionMessage, createdTime, hashCodeNullable(disclosureLanguage), hasAcceptedTerms, id, name, policyLinks, privacyPolicyLink, questions, status, updatedTime);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


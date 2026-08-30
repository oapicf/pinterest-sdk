package apimodels;

import apimodels.LeadFormPolicyLink;
import apimodels.LeadFormQuestion;
import apimodels.LeadFormStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * LeadFormBatchUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeadFormBatchUpdate   {
  @JsonProperty("completion_message")
  
  private String completionMessage;

  @JsonProperty("disclosure_language")
  
  private String disclosureLanguage;

  @JsonProperty("has_accepted_terms")
  
  private Boolean hasAcceptedTerms;

  @JsonProperty("id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String id;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("policy_links")
  @Size(min=0,max=3)
@Valid

  private List<@Valid LeadFormPolicyLink> policyLinks = null;

  @JsonProperty("privacy_policy_link")
  
  private String privacyPolicyLink;

  @JsonProperty("questions")
  @Size(min=0,max=10)
@Valid

  private List<@Valid LeadFormQuestion> questions = null;

  @JsonProperty("status")
  @Valid

  private LeadFormStatus status;

  public LeadFormBatchUpdate completionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
    return this;
  }

   /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
  **/
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  public LeadFormBatchUpdate disclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
    return this;
  }

   /**
   * Additional disclosure language to be included in the lead form.
   * @return disclosureLanguage
  **/
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  public LeadFormBatchUpdate hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

   /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
  **/
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormBatchUpdate id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of this lead form
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LeadFormBatchUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Internal name of the lead form.
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LeadFormBatchUpdate policyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormBatchUpdate addPolicyLinksItem(LeadFormPolicyLink policyLinksItem) {
    if (this.policyLinks == null) {
      this.policyLinks = new ArrayList<>();
    }
    this.policyLinks.add(policyLinksItem);
    return this;
  }

   /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
  **/
  public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  public LeadFormBatchUpdate privacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
    return this;
  }

   /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   * @return privacyPolicyLink
  **/
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  public LeadFormBatchUpdate questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormBatchUpdate addQuestionsItem(LeadFormQuestion questionsItem) {
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
  public List<@Valid LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
  }

  public LeadFormBatchUpdate status(LeadFormStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
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
    LeadFormBatchUpdate leadFormBatchUpdate = (LeadFormBatchUpdate) o;
    return Objects.equals(completionMessage, leadFormBatchUpdate.completionMessage) &&
        Objects.equals(disclosureLanguage, leadFormBatchUpdate.disclosureLanguage) &&
        Objects.equals(hasAcceptedTerms, leadFormBatchUpdate.hasAcceptedTerms) &&
        Objects.equals(id, leadFormBatchUpdate.id) &&
        Objects.equals(name, leadFormBatchUpdate.name) &&
        Objects.equals(policyLinks, leadFormBatchUpdate.policyLinks) &&
        Objects.equals(privacyPolicyLink, leadFormBatchUpdate.privacyPolicyLink) &&
        Objects.equals(questions, leadFormBatchUpdate.questions) &&
        Objects.equals(status, leadFormBatchUpdate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, disclosureLanguage, hasAcceptedTerms, id, name, policyLinks, privacyPolicyLink, questions, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormBatchUpdate {\n");
    
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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


package apimodels;

import apimodels.LeadFormCommonPolicyLinksInner;
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
 * LeadFormCreateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class LeadFormCreateRequest   {
  @JsonProperty("name")
  @NotNull

  private String name;

  @JsonProperty("privacy_policy_link")
  @NotNull

  private String privacyPolicyLink;

  @JsonProperty("has_accepted_terms")
  @NotNull

  private Boolean hasAcceptedTerms;

  @JsonProperty("completion_message")
  @NotNull

  private String completionMessage;

  @JsonProperty("status")
  @Valid

  private LeadFormStatus status;

  @JsonProperty("disclosure_language")
  
  private String disclosureLanguage;

  @JsonProperty("questions")
  @NotNull
@Size(min=0,max=10)
@Valid

  private List<@Valid LeadFormQuestion> questions = new ArrayList<>();

  @JsonProperty("policy_links")
  @Size(min=0,max=3)
@Valid

  private List<@Valid LeadFormCommonPolicyLinksInner> policyLinks = null;

  public LeadFormCreateRequest name(String name) {
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

  public LeadFormCreateRequest privacyPolicyLink(String privacyPolicyLink) {
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

  public LeadFormCreateRequest hasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
    return this;
  }

   /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
  **/
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  public LeadFormCreateRequest completionMessage(String completionMessage) {
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

  public LeadFormCreateRequest status(LeadFormStatus status) {
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

  public LeadFormCreateRequest disclosureLanguage(String disclosureLanguage) {
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

  public LeadFormCreateRequest questions(List<@Valid LeadFormQuestion> questions) {
    this.questions = questions;
    return this;
  }

  public LeadFormCreateRequest addQuestionsItem(LeadFormQuestion questionsItem) {
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

  public LeadFormCreateRequest policyLinks(List<@Valid LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
    return this;
  }

  public LeadFormCreateRequest addPolicyLinksItem(LeadFormCommonPolicyLinksInner policyLinksItem) {
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
  public List<@Valid LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<@Valid LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCreateRequest leadFormCreateRequest = (LeadFormCreateRequest) o;
    return Objects.equals(name, leadFormCreateRequest.name) &&
        Objects.equals(privacyPolicyLink, leadFormCreateRequest.privacyPolicyLink) &&
        Objects.equals(hasAcceptedTerms, leadFormCreateRequest.hasAcceptedTerms) &&
        Objects.equals(completionMessage, leadFormCreateRequest.completionMessage) &&
        Objects.equals(status, leadFormCreateRequest.status) &&
        Objects.equals(disclosureLanguage, leadFormCreateRequest.disclosureLanguage) &&
        Objects.equals(questions, leadFormCreateRequest.questions) &&
        Objects.equals(policyLinks, leadFormCreateRequest.policyLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyLink, hasAcceptedTerms, completionMessage, status, disclosureLanguage, questions, policyLinks);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
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


package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.LeadFormCommonPolicyLinksInner;
import org.openapitools.server.api.model.LeadFormQuestion;
import org.openapitools.server.api.model.LeadFormStatus;

/**
 * Creation fields
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormCommon   {
  
  private String name;
  private String privacyPolicyLink;
  private Boolean hasAcceptedTerms;
  private String completionMessage;
  private LeadFormStatus status;
  private String disclosureLanguage;
  private List<LeadFormQuestion> questions = new ArrayList<>();
  private List<LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>();

  public LeadFormCommon () {

  }

  public LeadFormCommon (String name, String privacyPolicyLink, Boolean hasAcceptedTerms, String completionMessage, LeadFormStatus status, String disclosureLanguage, List<LeadFormQuestion> questions, List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.name = name;
    this.privacyPolicyLink = privacyPolicyLink;
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.completionMessage = completionMessage;
    this.status = status;
    this.disclosureLanguage = disclosureLanguage;
    this.questions = questions;
    this.policyLinks = policyLinks;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("privacy_policy_link")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }
  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

    
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

    
  @JsonProperty("completion_message")
  public String getCompletionMessage() {
    return completionMessage;
  }
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

    
  @JsonProperty("status")
  public LeadFormStatus getStatus() {
    return status;
  }
  public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

    
  @JsonProperty("disclosure_language")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }
  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

    
  @JsonProperty("questions")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

    
  @JsonProperty("policy_links")
  public List<LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }
  public void setPolicyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
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
    LeadFormCommon leadFormCommon = (LeadFormCommon) o;
    return Objects.equals(name, leadFormCommon.name) &&
        Objects.equals(privacyPolicyLink, leadFormCommon.privacyPolicyLink) &&
        Objects.equals(hasAcceptedTerms, leadFormCommon.hasAcceptedTerms) &&
        Objects.equals(completionMessage, leadFormCommon.completionMessage) &&
        Objects.equals(status, leadFormCommon.status) &&
        Objects.equals(disclosureLanguage, leadFormCommon.disclosureLanguage) &&
        Objects.equals(questions, leadFormCommon.questions) &&
        Objects.equals(policyLinks, leadFormCommon.policyLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, privacyPolicyLink, hasAcceptedTerms, completionMessage, status, disclosureLanguage, questions, policyLinks);
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

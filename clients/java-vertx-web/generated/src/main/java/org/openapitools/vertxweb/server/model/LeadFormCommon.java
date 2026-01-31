package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.LeadFormCommonPolicyLinksInner;
import org.openapitools.vertxweb.server.model.LeadFormQuestion;
import org.openapitools.vertxweb.server.model.LeadFormStatus;

/**
 * Creation fields
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormCommon   {
  
  private String completionMessage;
  private String disclosureLanguage;
  private Boolean hasAcceptedTerms;
  private String name;
  private List<LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>();
  private String privacyPolicyLink;
  private List<LeadFormQuestion> questions = new ArrayList<>();
  private LeadFormStatus status;

  public LeadFormCommon () {

  }

  public LeadFormCommon (String completionMessage, String disclosureLanguage, Boolean hasAcceptedTerms, String name, List<LeadFormCommonPolicyLinksInner> policyLinks, String privacyPolicyLink, List<LeadFormQuestion> questions, LeadFormStatus status) {
    this.completionMessage = completionMessage;
    this.disclosureLanguage = disclosureLanguage;
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.name = name;
    this.policyLinks = policyLinks;
    this.privacyPolicyLink = privacyPolicyLink;
    this.questions = questions;
    this.status = status;
  }

    
  @JsonProperty("completion_message")
  public String getCompletionMessage() {
    return completionMessage;
  }
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

    
  @JsonProperty("disclosure_language")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }
  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

    
  @JsonProperty("has_accepted_terms")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("policy_links")
  public List<LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }
  public void setPolicyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }

    
  @JsonProperty("privacy_policy_link")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }
  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

    
  @JsonProperty("questions")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

    
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
    LeadFormCommon leadFormCommon = (LeadFormCommon) o;
    return Objects.equals(completionMessage, leadFormCommon.completionMessage) &&
        Objects.equals(disclosureLanguage, leadFormCommon.disclosureLanguage) &&
        Objects.equals(hasAcceptedTerms, leadFormCommon.hasAcceptedTerms) &&
        Objects.equals(name, leadFormCommon.name) &&
        Objects.equals(policyLinks, leadFormCommon.policyLinks) &&
        Objects.equals(privacyPolicyLink, leadFormCommon.privacyPolicyLink) &&
        Objects.equals(questions, leadFormCommon.questions) &&
        Objects.equals(status, leadFormCommon.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, disclosureLanguage, hasAcceptedTerms, name, policyLinks, privacyPolicyLink, questions, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCommon {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

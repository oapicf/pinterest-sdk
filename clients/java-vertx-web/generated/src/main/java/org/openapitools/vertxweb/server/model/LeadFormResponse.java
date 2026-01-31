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

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadFormResponse   {
  
  private String completionMessage;
  private String disclosureLanguage;
  private Boolean hasAcceptedTerms;
  private String name;
  private List<LeadFormCommonPolicyLinksInner> policyLinks = new ArrayList<>();
  private String privacyPolicyLink;
  private List<LeadFormQuestion> questions = new ArrayList<>();
  private LeadFormStatus status;
  private String adAccountId;
  private Integer createdTime;
  private String id;
  private Integer updatedTime;

  public LeadFormResponse () {

  }

  public LeadFormResponse (String completionMessage, String disclosureLanguage, Boolean hasAcceptedTerms, String name, List<LeadFormCommonPolicyLinksInner> policyLinks, String privacyPolicyLink, List<LeadFormQuestion> questions, LeadFormStatus status, String adAccountId, Integer createdTime, String id, Integer updatedTime) {
    this.completionMessage = completionMessage;
    this.disclosureLanguage = disclosureLanguage;
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.name = name;
    this.policyLinks = policyLinks;
    this.privacyPolicyLink = privacyPolicyLink;
    this.questions = questions;
    this.status = status;
    this.adAccountId = adAccountId;
    this.createdTime = createdTime;
    this.id = id;
    this.updatedTime = updatedTime;
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

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }
  public void setUpdatedTime(Integer updatedTime) {
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
    LeadFormResponse leadFormResponse = (LeadFormResponse) o;
    return Objects.equals(completionMessage, leadFormResponse.completionMessage) &&
        Objects.equals(disclosureLanguage, leadFormResponse.disclosureLanguage) &&
        Objects.equals(hasAcceptedTerms, leadFormResponse.hasAcceptedTerms) &&
        Objects.equals(name, leadFormResponse.name) &&
        Objects.equals(policyLinks, leadFormResponse.policyLinks) &&
        Objects.equals(privacyPolicyLink, leadFormResponse.privacyPolicyLink) &&
        Objects.equals(questions, leadFormResponse.questions) &&
        Objects.equals(status, leadFormResponse.status) &&
        Objects.equals(adAccountId, leadFormResponse.adAccountId) &&
        Objects.equals(createdTime, leadFormResponse.createdTime) &&
        Objects.equals(id, leadFormResponse.id) &&
        Objects.equals(updatedTime, leadFormResponse.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, disclosureLanguage, hasAcceptedTerms, name, policyLinks, privacyPolicyLink, questions, status, adAccountId, createdTime, id, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormResponse {\n");
    
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    disclosureLanguage: ").append(toIndentedString(disclosureLanguage)).append("\n");
    sb.append("    hasAcceptedTerms: ").append(toIndentedString(hasAcceptedTerms)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyLinks: ").append(toIndentedString(policyLinks)).append("\n");
    sb.append("    privacyPolicyLink: ").append(toIndentedString(privacyPolicyLink)).append("\n");
    sb.append("    questions: ").append(toIndentedString(questions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

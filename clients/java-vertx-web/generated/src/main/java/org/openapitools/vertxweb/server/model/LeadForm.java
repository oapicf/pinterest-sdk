package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.LeadFormPolicyLink;
import org.openapitools.vertxweb.server.model.LeadFormQuestion;
import org.openapitools.vertxweb.server.model.LeadFormStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LeadForm   {
  
  private String adAccountId;
  private String completionMessage;
  private Integer createdTime;
  private String disclosureLanguage;
  private Boolean hasAcceptedTerms;
  private String id;
  private String name;
  private List<LeadFormPolicyLink> policyLinks = new ArrayList<>();
  private String privacyPolicyLink;
  private List<LeadFormQuestion> questions = new ArrayList<>();
  private LeadFormStatus status;
  private Integer updatedTime;

  public LeadForm () {

  }

  public LeadForm (String adAccountId, String completionMessage, Integer createdTime, String disclosureLanguage, Boolean hasAcceptedTerms, String id, String name, List<LeadFormPolicyLink> policyLinks, String privacyPolicyLink, List<LeadFormQuestion> questions, LeadFormStatus status, Integer updatedTime) {
    this.adAccountId = adAccountId;
    this.completionMessage = completionMessage;
    this.createdTime = createdTime;
    this.disclosureLanguage = disclosureLanguage;
    this.hasAcceptedTerms = hasAcceptedTerms;
    this.id = id;
    this.name = name;
    this.policyLinks = policyLinks;
    this.privacyPolicyLink = privacyPolicyLink;
    this.questions = questions;
    this.status = status;
    this.updatedTime = updatedTime;
  }

    
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

    
  @JsonProperty("completion_message")
  public String getCompletionMessage() {
    return completionMessage;
  }
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

    
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }
  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
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

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("policy_links")
  public List<LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }
  public void setPolicyLinks(List<LeadFormPolicyLink> policyLinks) {
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
    LeadForm leadForm = (LeadForm) o;
    return Objects.equals(adAccountId, leadForm.adAccountId) &&
        Objects.equals(completionMessage, leadForm.completionMessage) &&
        Objects.equals(createdTime, leadForm.createdTime) &&
        Objects.equals(disclosureLanguage, leadForm.disclosureLanguage) &&
        Objects.equals(hasAcceptedTerms, leadForm.hasAcceptedTerms) &&
        Objects.equals(id, leadForm.id) &&
        Objects.equals(name, leadForm.name) &&
        Objects.equals(policyLinks, leadForm.policyLinks) &&
        Objects.equals(privacyPolicyLink, leadForm.privacyPolicyLink) &&
        Objects.equals(questions, leadForm.questions) &&
        Objects.equals(status, leadForm.status) &&
        Objects.equals(updatedTime, leadForm.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, completionMessage, createdTime, disclosureLanguage, hasAcceptedTerms, id, name, policyLinks, privacyPolicyLink, questions, status, updatedTime);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

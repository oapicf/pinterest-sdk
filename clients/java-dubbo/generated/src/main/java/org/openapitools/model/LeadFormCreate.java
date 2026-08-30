package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadFormPolicyLink;
import org.openapitools.model.LeadFormQuestion;
import org.openapitools.model.LeadFormStatus;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class LeadFormCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * A message for people who complete the form to let them know what happens next.
   */
  @JsonProperty("completion_message")
  private String completionMessage;

  /**
   * Additional disclosure language to be included in the lead form.
   */
  @JsonProperty("disclosure_language")
  private String disclosureLanguage;

  /**
   * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   */
  @JsonProperty("has_accepted_terms")
  private Boolean hasAcceptedTerms;

  /**
   * Internal name of the lead form.
   */
  @JsonProperty("name")
  private String name;

  /**
   * List of additional policy links to be displayed on the lead form.
   */
  @JsonProperty("policy_links")
  private List<LeadFormPolicyLink> policyLinks = new ArrayList<>();

  /**
   * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
   */
  @JsonProperty("privacy_policy_link")
  private String privacyPolicyLink;

  /**
   * List of questions to be displayed on the lead form.
   */
  @JsonProperty("questions")
  private List<LeadFormQuestion> questions = new ArrayList<>();

  @JsonProperty("status")
  private LeadFormStatus status;

  /**
   * A message for people who complete the form to let them know what happens next.
   * @return completionMessage
   */
  public String getCompletionMessage() {
    return completionMessage;
  }

  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   * @return disclosureLanguage
   */
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }

  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  /**
   * Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
   * @return hasAcceptedTerms
   */
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }

  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * Internal name of the lead form.
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   * @return policyLinks
   */
  public List<LeadFormPolicyLink> getPolicyLinks() {
    return policyLinks;
  }

  public void setPolicyLinks(List<LeadFormPolicyLink> policyLinks) {
    this.policyLinks = policyLinks;
  }

  /**
   * A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
   * @return privacyPolicyLink
   */
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }

  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  /**
   * List of questions to be displayed on the lead form.
   * @return questions
   */
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }

  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  /**
   * 
   * @return status
   */
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
        Objects.equals(this.disclosureLanguage, leadFormCreate.disclosureLanguage) &&
        Objects.equals(this.hasAcceptedTerms, leadFormCreate.hasAcceptedTerms) &&
        Objects.equals(this.name, leadFormCreate.name) &&
        Objects.equals(this.policyLinks, leadFormCreate.policyLinks) &&
        Objects.equals(this.privacyPolicyLink, leadFormCreate.privacyPolicyLink) &&
        Objects.equals(this.questions, leadFormCreate.questions) &&
        Objects.equals(this.status, leadFormCreate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionMessage, disclosureLanguage, hasAcceptedTerms, name, policyLinks, privacyPolicyLink, questions, status);
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

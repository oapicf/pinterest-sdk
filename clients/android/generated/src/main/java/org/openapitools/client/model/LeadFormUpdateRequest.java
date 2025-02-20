/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.LeadFormCommonPolicyLinksInner;
import org.openapitools.client.model.LeadFormQuestion;
import org.openapitools.client.model.LeadFormStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class LeadFormUpdateRequest {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("privacy_policy_link")
  private String privacyPolicyLink = null;
  @SerializedName("has_accepted_terms")
  private Boolean hasAcceptedTerms = null;
  @SerializedName("completion_message")
  private String completionMessage = null;
  @SerializedName("status")
  private LeadFormStatus status = null;
  @SerializedName("disclosure_language")
  private String disclosureLanguage = null;
  @SerializedName("questions")
  private List<LeadFormQuestion> questions = null;
  @SerializedName("policy_links")
  private List<LeadFormCommonPolicyLinksInner> policyLinks = null;
  @SerializedName("id")
  private String id = null;

  /**
   * Internal name of the lead form.
   **/
  @ApiModelProperty(value = "Internal name of the lead form.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
   **/
  @ApiModelProperty(value = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
  public String getPrivacyPolicyLink() {
    return privacyPolicyLink;
  }
  public void setPrivacyPolicyLink(String privacyPolicyLink) {
    this.privacyPolicyLink = privacyPolicyLink;
  }

  /**
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
   **/
  @ApiModelProperty(value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO")
  public Boolean getHasAcceptedTerms() {
    return hasAcceptedTerms;
  }
  public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
    this.hasAcceptedTerms = hasAcceptedTerms;
  }

  /**
   * A message for people who complete the form to let them know what happens next.
   **/
  @ApiModelProperty(value = "A message for people who complete the form to let them know what happens next.")
  public String getCompletionMessage() {
    return completionMessage;
  }
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public LeadFormStatus getStatus() {
    return status;
  }
  public void setStatus(LeadFormStatus status) {
    this.status = status;
  }

  /**
   * Additional disclosure language to be included in the lead form.
   **/
  @ApiModelProperty(value = "Additional disclosure language to be included in the lead form.")
  public String getDisclosureLanguage() {
    return disclosureLanguage;
  }
  public void setDisclosureLanguage(String disclosureLanguage) {
    this.disclosureLanguage = disclosureLanguage;
  }

  /**
   * List of questions to be displayed on the lead form.
   **/
  @ApiModelProperty(value = "List of questions to be displayed on the lead form.")
  public List<LeadFormQuestion> getQuestions() {
    return questions;
  }
  public void setQuestions(List<LeadFormQuestion> questions) {
    this.questions = questions;
  }

  /**
   * List of additional policy links to be displayed on the lead form.
   **/
  @ApiModelProperty(value = "List of additional policy links to be displayed on the lead form.")
  public List<LeadFormCommonPolicyLinksInner> getPolicyLinks() {
    return policyLinks;
  }
  public void setPolicyLinks(List<LeadFormCommonPolicyLinksInner> policyLinks) {
    this.policyLinks = policyLinks;
  }

  /**
   * The ID of this lead form to be updated
   **/
  @ApiModelProperty(required = true, value = "The ID of this lead form to be updated")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormUpdateRequest leadFormUpdateRequest = (LeadFormUpdateRequest) o;
    return (this.name == null ? leadFormUpdateRequest.name == null : this.name.equals(leadFormUpdateRequest.name)) &&
        (this.privacyPolicyLink == null ? leadFormUpdateRequest.privacyPolicyLink == null : this.privacyPolicyLink.equals(leadFormUpdateRequest.privacyPolicyLink)) &&
        (this.hasAcceptedTerms == null ? leadFormUpdateRequest.hasAcceptedTerms == null : this.hasAcceptedTerms.equals(leadFormUpdateRequest.hasAcceptedTerms)) &&
        (this.completionMessage == null ? leadFormUpdateRequest.completionMessage == null : this.completionMessage.equals(leadFormUpdateRequest.completionMessage)) &&
        (this.status == null ? leadFormUpdateRequest.status == null : this.status.equals(leadFormUpdateRequest.status)) &&
        (this.disclosureLanguage == null ? leadFormUpdateRequest.disclosureLanguage == null : this.disclosureLanguage.equals(leadFormUpdateRequest.disclosureLanguage)) &&
        (this.questions == null ? leadFormUpdateRequest.questions == null : this.questions.equals(leadFormUpdateRequest.questions)) &&
        (this.policyLinks == null ? leadFormUpdateRequest.policyLinks == null : this.policyLinks.equals(leadFormUpdateRequest.policyLinks)) &&
        (this.id == null ? leadFormUpdateRequest.id == null : this.id.equals(leadFormUpdateRequest.id));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.privacyPolicyLink == null ? 0: this.privacyPolicyLink.hashCode());
    result = 31 * result + (this.hasAcceptedTerms == null ? 0: this.hasAcceptedTerms.hashCode());
    result = 31 * result + (this.completionMessage == null ? 0: this.completionMessage.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.disclosureLanguage == null ? 0: this.disclosureLanguage.hashCode());
    result = 31 * result + (this.questions == null ? 0: this.questions.hashCode());
    result = 31 * result + (this.policyLinks == null ? 0: this.policyLinks.hashCode());
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormUpdateRequest {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  privacyPolicyLink: ").append(privacyPolicyLink).append("\n");
    sb.append("  hasAcceptedTerms: ").append(hasAcceptedTerms).append("\n");
    sb.append("  completionMessage: ").append(completionMessage).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  disclosureLanguage: ").append(disclosureLanguage).append("\n");
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("  policyLinks: ").append(policyLinks).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

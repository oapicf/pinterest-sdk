/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import org.openapitools.client.model.LeadFormQuestion;
import org.openapitools.client.model.LeadFormStatus;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Creation fields
 **/
@ApiModel(description = "Creation fields")
public class LeadFormCommon {
  
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
   * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.
   **/
  @ApiModelProperty(value = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeadFormCommon leadFormCommon = (LeadFormCommon) o;
    return (this.name == null ? leadFormCommon.name == null : this.name.equals(leadFormCommon.name)) &&
        (this.privacyPolicyLink == null ? leadFormCommon.privacyPolicyLink == null : this.privacyPolicyLink.equals(leadFormCommon.privacyPolicyLink)) &&
        (this.hasAcceptedTerms == null ? leadFormCommon.hasAcceptedTerms == null : this.hasAcceptedTerms.equals(leadFormCommon.hasAcceptedTerms)) &&
        (this.completionMessage == null ? leadFormCommon.completionMessage == null : this.completionMessage.equals(leadFormCommon.completionMessage)) &&
        (this.status == null ? leadFormCommon.status == null : this.status.equals(leadFormCommon.status)) &&
        (this.disclosureLanguage == null ? leadFormCommon.disclosureLanguage == null : this.disclosureLanguage.equals(leadFormCommon.disclosureLanguage)) &&
        (this.questions == null ? leadFormCommon.questions == null : this.questions.equals(leadFormCommon.questions));
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
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadFormCommon {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  privacyPolicyLink: ").append(privacyPolicyLink).append("\n");
    sb.append("  hasAcceptedTerms: ").append(hasAcceptedTerms).append("\n");
    sb.append("  completionMessage: ").append(completionMessage).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  disclosureLanguage: ").append(disclosureLanguage).append("\n");
    sb.append("  questions: ").append(questions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
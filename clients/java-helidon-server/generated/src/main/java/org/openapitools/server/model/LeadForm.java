package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.LeadFormPolicyLink;
import org.openapitools.server.model.LeadFormQuestion;
import org.openapitools.server.model.LeadFormStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadForm   {

    private String adAccountId;
    private String completionMessage;
    private Integer createdTime;
    private String disclosureLanguage;
    private Boolean hasAcceptedTerms;
    private String id;
    private String name;
    private List<@Valid LeadFormPolicyLink> policyLinks = new ArrayList<>();
    private String privacyPolicyLink;
    private List<@Valid LeadFormQuestion> questions = new ArrayList<>();
    private LeadFormStatus status;
    private Integer updatedTime;

    /**
     * Default constructor.
     */
    public LeadForm() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadForm.
     *
     * @param adAccountId The Ad Account ID that this lead form belongs to.
     * @param completionMessage A message for people who complete the form to let them know what happens next.
     * @param createdTime Lead form creation time. Unix timestamp in seconds.
     * @param disclosureLanguage Additional disclosure language to be included in the lead form.
     * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
     * @param id The ID of this lead form
     * @param name Internal name of the lead form.
     * @param policyLinks List of additional policy links to be displayed on the lead form.
     * @param privacyPolicyLink A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
     * @param questions List of questions to be displayed on the lead form.
     * @param status status
     * @param updatedTime Last update time. Unix timestamp in seconds.
     */
    public LeadForm(
        String adAccountId, 
        String completionMessage, 
        Integer createdTime, 
        String disclosureLanguage, 
        Boolean hasAcceptedTerms, 
        String id, 
        String name, 
        List<@Valid LeadFormPolicyLink> policyLinks, 
        String privacyPolicyLink, 
        List<@Valid LeadFormQuestion> questions, 
        LeadFormStatus status, 
        Integer updatedTime
    ) {
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



    /**
     * The Ad Account ID that this lead form belongs to.
     * @return adAccountId
     */
    public String getAdAccountId() {
        return adAccountId;
    }

    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

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
     * Lead form creation time. Unix timestamp in seconds.
     * @return createdTime
     */
    public Integer getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Integer createdTime) {
        this.createdTime = createdTime;
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
     * Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
     * @return hasAcceptedTerms
     */
    public Boolean getHasAcceptedTerms() {
        return hasAcceptedTerms;
    }

    public void setHasAcceptedTerms(Boolean hasAcceptedTerms) {
        this.hasAcceptedTerms = hasAcceptedTerms;
    }

    /**
     * The ID of this lead form
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public List<@Valid LeadFormPolicyLink> getPolicyLinks() {
        return policyLinks;
    }

    public void setPolicyLinks(List<@Valid LeadFormPolicyLink> policyLinks) {
        this.policyLinks = policyLinks;
    }

    /**
     * A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
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
    public List<@Valid LeadFormQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(List<@Valid LeadFormQuestion> questions) {
        this.questions = questions;
    }

    /**
     * Get status
     * @return status
     */
    public LeadFormStatus getStatus() {
        return status;
    }

    public void setStatus(LeadFormStatus status) {
        this.status = status;
    }

    /**
     * Last update time. Unix timestamp in seconds.
     * @return updatedTime
     */
    public Integer getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Integer updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}


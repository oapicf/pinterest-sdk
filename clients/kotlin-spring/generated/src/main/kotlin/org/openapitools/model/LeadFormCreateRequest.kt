package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.LeadFormCommonPolicyLinksInner
import org.openapitools.model.LeadFormQuestion
import org.openapitools.model.LeadFormStatus
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param name Internal name of the lead form.
 * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO
 * @param completionMessage A message for people who complete the form to let them know what happens next.
 * @param questions List of questions to be displayed on the lead form.
 * @param status 
 * @param disclosureLanguage Additional disclosure language to be included in the lead form.
 * @param policyLinks List of additional policy links to be displayed on the lead form.
 */
data class LeadFormCreateRequest(

    @Schema(example = "Lead Form 3/14/2023", required = true, description = "Internal name of the lead form.")
    @get:JsonProperty("name", required = true) val name: kotlin.String?,

    @Schema(example = "https://www.advertisername.com/privacy-policy", required = true, description = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
    @get:JsonProperty("privacy_policy_link", required = true) val privacyPolicyLink: kotlin.String?,

    @Schema(example = "false", required = true, description = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's <a href=\"https://policy.pinterest.com/en/lead-ad-terms\">Lead Ad Terms</a>. As a reminder, all advertising on Pinterest is subject to the <a href=\"https://business.pinterest.com/en/pinterest-advertising-services-agreement/\">Pinterest Advertising Services Agreement</a> or an equivalent agreement as set forth on an IO")
    @get:JsonProperty("has_accepted_terms", required = true) val hasAcceptedTerms: kotlin.Boolean,

    @Schema(example = "Thank you for submitting. We will contact you soon.", required = true, description = "A message for people who complete the form to let them know what happens next.")
    @get:JsonProperty("completion_message", required = true) val completionMessage: kotlin.String?,

    @field:Valid
    @get:Size(min=0,max=10) 
    @Schema(example = "[{question_type=CUSTOM, custom_question_field_type=CHECKBOX, custom_question_label=What is your favorite animal?, custom_question_options=[Dog, Cat, Bird, Turtle]}]", required = true, description = "List of questions to be displayed on the lead form.")
    @get:JsonProperty("questions", required = true) val questions: kotlin.collections.List<LeadFormQuestion>,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: LeadFormStatus? = null,

    @Schema(example = "By entering your personal information, you agree that your data will be collected and used.", description = "Additional disclosure language to be included in the lead form.")
    @get:JsonProperty("disclosure_language") val disclosureLanguage: kotlin.String? = null,

    @field:Valid
    @get:Size(min=0,max=3) 
    @Schema(example = "[{label=Copyright, link=https://policy.pinterest.com/en/copyright}]", description = "List of additional policy links to be displayed on the lead form.")
    @get:JsonProperty("policy_links") val policyLinks: kotlin.collections.List<LeadFormCommonPolicyLinksInner>? = null
    ) {

}


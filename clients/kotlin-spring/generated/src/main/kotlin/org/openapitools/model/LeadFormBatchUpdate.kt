package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.LeadFormPolicyLink
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
 * @param id The ID of this lead form
 * @param completionMessage A message for people who complete the form to let them know what happens next.
 * @param disclosureLanguage Additional disclosure language to be included in the lead form.
 * @param hasAcceptedTerms Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO
 * @param name Internal name of the lead form.
 * @param policyLinks List of additional policy links to be displayed on the lead form.
 * @param privacyPolicyLink A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.
 * @param questions List of questions to be displayed on the lead form.
 * @param status 
 */
data class LeadFormBatchUpdate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "The ID of this lead form")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "Thank you for submitting. We will contact you soon.", description = "A message for people who complete the form to let them know what happens next.")
    @param:JsonProperty("completion_message")
    @get:JsonProperty("completion_message") val completionMessage: kotlin.String? = null,

    @Schema(example = "By entering your personal information, you agree that your data will be collected and used.", description = "Additional disclosure language to be included in the lead form.")
    @param:JsonProperty("disclosure_language")
    @get:JsonProperty("disclosure_language") val disclosureLanguage: kotlin.String? = null,

    @Schema(example = "false", description = "Whether the advertiser has accepted Pinterest's terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest's [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("has_accepted_terms")
    @get:JsonProperty("has_accepted_terms") val hasAcceptedTerms: kotlin.Boolean? = null,

    @Schema(example = "Lead Form 3/14/2023", description = "Internal name of the lead form.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @get:Size(min=0,max=3) 
    @Schema(example = "[{\"label\":\"Copyright\",\"link\":\"https://policy.pinterest.com/en/copyright\"}]", description = "List of additional policy links to be displayed on the lead form.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("policy_links")
    @get:JsonProperty("policy_links") val policyLinks: kotlin.collections.List<LeadFormPolicyLink>? = null,

    @Schema(example = "https://www.advertisername.com/privacy-policy", description = "A link to the advertiser's privacy policy. This will be included in the lead form's disclosure language.")
    @param:JsonProperty("privacy_policy_link")
    @get:JsonProperty("privacy_policy_link") val privacyPolicyLink: kotlin.String? = null,

    @field:Valid
    @get:Size(min=0,max=10) 
    @Schema(example = "[{\"question_type\":\"CUSTOM\",\"custom_question_field_type\":\"CHECKBOX\",\"custom_question_label\":\"What is your favorite animal?\",\"custom_question_options\":[\"Dog\",\"Cat\",\"Bird\",\"Turtle\"]}]", description = "List of questions to be displayed on the lead form.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("questions")
    @get:JsonProperty("questions") val questions: kotlin.collections.List<LeadFormQuestion>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: LeadFormStatus? = null
) {

}


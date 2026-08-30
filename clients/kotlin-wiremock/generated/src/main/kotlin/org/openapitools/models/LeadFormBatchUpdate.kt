@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadFormBatchUpdate(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("completion_message")
    val completionMessage: kotlin.String? = null,

    @field:JsonProperty("disclosure_language")
    val disclosureLanguage: kotlin.String? = null,

    @field:JsonProperty("has_accepted_terms")
    val hasAcceptedTerms: kotlin.Boolean? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("policy_links")
    val policyLinks: kotlin.collections.List<LeadFormPolicyLink>? = null,

    @field:JsonProperty("privacy_policy_link")
    val privacyPolicyLink: kotlin.String? = null,

    @field:JsonProperty("questions")
    val questions: kotlin.collections.List<LeadFormQuestion>? = null,

    @field:JsonProperty("status")
    val status: LeadFormStatus? = null,

)

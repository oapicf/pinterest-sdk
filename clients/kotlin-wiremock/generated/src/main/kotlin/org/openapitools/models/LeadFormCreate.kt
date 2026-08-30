@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LeadFormCreate(
    @field:JsonProperty("completion_message")
    val completionMessage: kotlin.String,

    @field:JsonProperty("has_accepted_terms")
    val hasAcceptedTerms: kotlin.Boolean,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("privacy_policy_link")
    val privacyPolicyLink: kotlin.String,

    @field:JsonProperty("questions")
    val questions: kotlin.collections.List<LeadFormQuestion>,

    @field:JsonProperty("disclosure_language")
    val disclosureLanguage: kotlin.String? = null,

    @field:JsonProperty("policy_links")
    val policyLinks: kotlin.collections.List<LeadFormPolicyLink>? = null,

    @field:JsonProperty("status")
    val status: LeadFormStatus? = null,

)

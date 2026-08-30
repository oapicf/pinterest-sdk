package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadFormPolicyLink
import org.openapitools.server.api.model.LeadFormQuestion
import org.openapitools.server.api.model.LeadFormStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormCreate(
    /** A message for people who complete the form to let them know what happens next. */
    val completionMessage: kotlin.String,
    /** Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s [Lead Ad Terms](https://policy.pinterest.com/en/lead-ad-terms). As a reminder, all advertising on Pinterest is subject to the [Pinterest Advertising Services Agreement](https://business.pinterest.com/en/pinterest-advertising-services-agreement/) or an equivalent agreement as set forth on an IO */
    val hasAcceptedTerms: kotlin.Boolean,
    /** Internal name of the lead form. */
    val name: kotlin.String,
    /** A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language. */
    val privacyPolicyLink: kotlin.String,
    /** List of questions to be displayed on the lead form. */
    val questions: kotlin.collections.List<LeadFormQuestion>,
    /** Additional disclosure language to be included in the lead form. */
    val disclosureLanguage: kotlin.String? = null,
    /** List of additional policy links to be displayed on the lead form. */
    val policyLinks: kotlin.collections.List<LeadFormPolicyLink>? = null,
    val status: LeadFormStatus? = null
)

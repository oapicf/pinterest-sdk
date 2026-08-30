package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdAccountsAudienceRule
import org.openapitools.server.api.model.AudienceType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountsAudienceCreate(
    /** Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /** [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    val audienceType: AudienceType? = null,
    /** Audience description. */
    val description: kotlin.String? = null,
    /** Audience name. */
    val name: kotlin.String? = null,
    val rule: AdAccountsAudienceRule? = null
)

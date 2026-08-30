package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdAccountsAudienceRule
import org.openapitools.server.api.model.AudienceType
import org.openapitools.server.api.model.AudienceUpdateOperationType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountsAudienceUpdate(
    /** Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /** [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    val audienceType: AudienceType? = null,
    /** Audience description. */
    val description: kotlin.String? = null,
    /** Audience name. */
    val name: kotlin.String? = null,
    /** Audience operation type (update or remove). Only valid in update request body. */
    val operationType: AudienceUpdateOperationType? = null,
    val rule: AdAccountsAudienceRule? = null
)

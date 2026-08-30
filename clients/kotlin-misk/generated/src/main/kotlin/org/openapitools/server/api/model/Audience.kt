package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceRule
import org.openapitools.server.api.model.AudienceStatus
import org.openapitools.server.api.model.PinnerListType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Audience(
    /** Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /** [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR */
    val audienceType: PinnerListType? = null,
    /** The company that created this audience. */
    val createdByCompanyName: kotlin.String? = null,
    /** Creation time. Unix timestamp in seconds. */
    val createdTimestamp: kotlin.Int? = null,
    /** Audience description. */
    val description: kotlin.String? = null,
    /** Audience ID. */
    val id: kotlin.String? = null,
    /** Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. */
    val isNca: kotlin.Boolean? = null,
    /** Audience name. */
    val name: kotlin.String? = null,
    val rule: AudienceRule? = null,
    /** Audience size. */
    val propertySize: kotlin.Int? = null,
    /** Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. */
    val status: AudienceStatus? = null,
    /** Always \&quot;audience\&quot;. */
    val type: kotlin.String? = null,
    /** Last update time. Unix timestamp in seconds. */
    val updatedTimestamp: kotlin.Int? = null
)

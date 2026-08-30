package org.openapitools.server.api.model

import org.openapitools.server.api.model.PartnerMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadSubscriptionPostParamsCreate(
    /** Standard HTTPS webhook URL. */
    val webhookUrl: kotlin.String,
    /** Lead form ID. */
    val leadFormId: kotlin.String? = null,
    /** Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    val partnerAccessToken: kotlin.String? = null,
    /** Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
    val partnerMetadata: PartnerMetadata? = null,
    /** Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    val partnerRefreshToken: kotlin.String? = null
)

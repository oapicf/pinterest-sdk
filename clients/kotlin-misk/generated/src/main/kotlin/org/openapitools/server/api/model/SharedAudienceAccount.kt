package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceAccountType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SharedAudienceAccount(
    /** Account ID (ad account or business ID). */
    val accountId: kotlin.String,
    /** Account name. */
    val accountName: kotlin.String,
    /** account type */
    val accountType: AudienceAccountType,
    /** Epoch timestamp in seconds for the shared audience event */
    val sharedOnTimestamp: kotlin.Int
)

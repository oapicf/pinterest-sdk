@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AppsflyerAudienceSyncCreate(
    @field:JsonProperty("container_id")
    val containerId: kotlin.String,

    @field:JsonProperty("url_adid_sha256")
    val urlAdidSha256: kotlin.String? = null,

    @field:JsonProperty("url_email_sha256")
    val urlEmailSha256: kotlin.String? = null,

)

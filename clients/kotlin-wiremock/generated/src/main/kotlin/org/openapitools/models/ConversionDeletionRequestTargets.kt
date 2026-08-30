@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionDeletionRequestTargets(
    @field:JsonProperty("user_emails")
    val userEmails: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("epiks")
    val epiks: kotlin.collections.List<kotlin.String>,

)

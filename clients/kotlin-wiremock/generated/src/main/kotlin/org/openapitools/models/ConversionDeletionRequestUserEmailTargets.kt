@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionDeletionRequestUserEmailTargets(
    @field:JsonProperty("user_emails")
    val userEmails: kotlin.collections.List<kotlin.String>,

)

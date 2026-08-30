@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AgeBucketMultipliers(
    @field:JsonProperty("AGE_BUCKET")
    val AGE_BUCKET: TargetingSpecAgeBucket? = null,

)

package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecAgeBucket
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AgeBucketMultipliers(
    /** Age bucket identifier. */
    val AGE_BUCKET: TargetingSpecAgeBucket? = null
)

package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecAgeBucket
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingSpecOperationAgeBucket(
    val `field`: kotlin.String,
    val operation: kotlin.String,
    val propertyValues: kotlin.collections.List<TargetingSpecAgeBucket>
)

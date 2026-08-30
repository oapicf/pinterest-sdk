package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecGender
import org.openapitools.server.api.model.TargetingSpecListOperation
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingSpecOperationGender(
    val `field`: kotlin.String,
    val operation: TargetingSpecListOperation,
    val propertyValues: kotlin.collections.List<TargetingSpecGender>
)

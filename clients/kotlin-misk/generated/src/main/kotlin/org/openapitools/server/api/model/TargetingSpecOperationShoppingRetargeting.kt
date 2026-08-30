package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecShoppingRetargeting
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingSpecOperationShoppingRetargeting(
    val `field`: kotlin.String,
    val operation: kotlin.String,
    val propertyValues: kotlin.collections.List<TargetingSpecShoppingRetargeting>
)

package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingSpecOperationAgeBucket
import org.openapitools.server.api.model.TargetingSpecOperationAppType
import org.openapitools.server.api.model.TargetingSpecOperationAudienceExclude
import org.openapitools.server.api.model.TargetingSpecOperationAudienceInclude
import org.openapitools.server.api.model.TargetingSpecOperationGender
import org.openapitools.server.api.model.TargetingSpecOperationGeo
import org.openapitools.server.api.model.TargetingSpecOperationGeoExclude
import org.openapitools.server.api.model.TargetingSpecOperationInterest
import org.openapitools.server.api.model.TargetingSpecOperationLocale
import org.openapitools.server.api.model.TargetingSpecOperationLocation
import org.openapitools.server.api.model.TargetingSpecOperationLocationExclude
import org.openapitools.server.api.model.TargetingSpecOperationMaximumAge
import org.openapitools.server.api.model.TargetingSpecOperationMinimumAge
import org.openapitools.server.api.model.TargetingSpecOperationShoppingRetargeting
import org.openapitools.server.api.model.TargetingSpecShoppingRetargeting
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingSpecOperations(
    val `field`: kotlin.String,
    val operation: kotlin.String,
    val propertyValues: kotlin.collections.List<TargetingSpecShoppingRetargeting>,
    val `value`: kotlin.String
)

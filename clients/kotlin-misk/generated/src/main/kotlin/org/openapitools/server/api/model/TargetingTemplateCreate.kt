package org.openapitools.server.api.model

import org.openapitools.server.api.model.PlacementGroupType
import org.openapitools.server.api.model.TargetingSpecOptimal
import org.openapitools.server.api.model.TargetingTemplateKeyword
import org.openapitools.server.api.model.TrackingUrls
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplateCreate(
    /** targeting template name */
    val name: kotlin.String,
    /** targeting profile attributes */
    val targetingAttributes: TargetingSpecOptimal,
    /** Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). */
    val autoTargetingEnabled: kotlin.Boolean? = true,
    val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,
    val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,
    val trackingUrls: TrackingUrls? = null
)

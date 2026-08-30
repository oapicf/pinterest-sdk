package org.openapitools.server.api.model

import org.openapitools.server.api.model.PlacementGroupType
import org.openapitools.server.api.model.TargetingSpecOptimal
import org.openapitools.server.api.model.TargetingTemplateAudienceSizing
import org.openapitools.server.api.model.TargetingTemplateKeyword
import org.openapitools.server.api.model.TargetingTemplateStatus
import org.openapitools.server.api.model.TrackingUrls
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplate(
    /** targeting template name */
    val name: kotlin.String,
    /** targeting profile attributes */
    val targetingAttributes: TargetingSpecOptimal,
    /** The ID of the advertiser that this targeting template belongs to. */
    val adAccountId: kotlin.String? = null,
    /** Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). */
    val autoTargetingEnabled: kotlin.Boolean? = true,
    /** Targeting template created time. Unix timestamp in seconds. */
    val createdTime: kotlin.Int? = null,
    /** Targeting template ID. */
    val id: kotlin.String? = null,
    val keywords: kotlin.collections.List<TargetingTemplateKeyword>? = null,
    val placementGroup: PlacementGroupType? = PlacementGroupType.ALL,
    val sizing: TargetingTemplateAudienceSizing? = null,
    /** Indicate targeting template is active or Deleted */
    val status: TargetingTemplateStatus? = null,
    val trackingUrls: TrackingUrls? = null,
    /** Targeting template updated time.Unix timestamp in seconds. */
    val updatedTime: kotlin.Int? = null,
    /** Inform if the targeting template is valid (ex. would be false if has revoked audience) */
    val valid: kotlin.Boolean? = null
)

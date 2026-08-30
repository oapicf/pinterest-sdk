package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdGroupUpdateRequest
import org.openapitools.server.api.model.AdUpdateRequest
import org.openapitools.server.api.model.BulkUpsertRequestUpdateCatalogProductGroupsItems
import org.openapitools.server.api.model.CampaignUpdateRequest
import org.openapitools.server.api.model.KeywordUpdateGenerated
import org.openapitools.server.api.model.LabelBulkUpdateRequest
import org.openapitools.server.api.model.ProductGroupPromotionUpdateRequest
import org.openapitools.server.api.model.ScheduleUpdateRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkUpsertRequestUpdate(
    val adGroups: kotlin.collections.List<AdGroupUpdateRequest>? = null,
    val ads: kotlin.collections.List<AdUpdateRequest>? = null,
    val campaigns: kotlin.collections.List<CampaignUpdateRequest>? = null,
    val catalogProductGroups: kotlin.collections.List<BulkUpsertRequestUpdateCatalogProductGroupsItems>? = null,
    val keywords: kotlin.collections.List<KeywordUpdateGenerated>? = null,
    val labels: kotlin.collections.List<LabelBulkUpdateRequest>? = null,
    val productGroups: kotlin.collections.List<ProductGroupPromotionUpdateRequest>? = null,
    val schedules: kotlin.collections.List<ScheduleUpdateRequest>? = null
)

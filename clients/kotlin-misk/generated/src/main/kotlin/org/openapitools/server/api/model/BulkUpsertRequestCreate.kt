package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdCreateRequest
import org.openapitools.server.api.model.AdGroupCreateRequest
import org.openapitools.server.api.model.BulkUpsertRequestCreateCatalogProductGroupsItems
import org.openapitools.server.api.model.CampaignCreateRequest
import org.openapitools.server.api.model.KeywordsRequest
import org.openapitools.server.api.model.LabelBulkCreateRequest
import org.openapitools.server.api.model.ProductGroupPromotionCreateRequest
import org.openapitools.server.api.model.ScheduleCreateRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BulkUpsertRequestCreate(
    val adGroups: kotlin.collections.List<AdGroupCreateRequest>? = null,
    val ads: kotlin.collections.List<AdCreateRequest>? = null,
    val campaigns: kotlin.collections.List<CampaignCreateRequest>? = null,
    val catalogProductGroups: kotlin.collections.List<BulkUpsertRequestCreateCatalogProductGroupsItems>? = null,
    val keywords: kotlin.collections.List<KeywordsRequest>? = null,
    val labels: kotlin.collections.List<LabelBulkCreateRequest>? = null,
    val productGroups: kotlin.collections.List<ProductGroupPromotionCreateRequest>? = null,
    val schedules: kotlin.collections.List<ScheduleCreateRequest>? = null
)

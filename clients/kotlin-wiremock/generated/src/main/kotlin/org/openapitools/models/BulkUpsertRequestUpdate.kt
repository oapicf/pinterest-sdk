@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkUpsertRequestUpdate(
    @field:JsonProperty("ad_groups")
    val adGroups: kotlin.collections.List<AdGroupUpdateRequest>? = null,

    @field:JsonProperty("ads")
    val ads: kotlin.collections.List<AdUpdateRequest>? = null,

    @field:JsonProperty("campaigns")
    val campaigns: kotlin.collections.List<CampaignUpdateRequest>? = null,

    @field:JsonProperty("catalog_product_groups")
    val catalogProductGroups: kotlin.collections.List<BulkUpsertRequestUpdateCatalogProductGroupsItems>? = null,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<KeywordUpdateGenerated>? = null,

    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<LabelBulkUpdateRequest>? = null,

    @field:JsonProperty("product_groups")
    val productGroups: kotlin.collections.List<ProductGroupPromotionUpdateRequest>? = null,

    @field:JsonProperty("schedules")
    val schedules: kotlin.collections.List<ScheduleUpdateRequest>? = null,

)

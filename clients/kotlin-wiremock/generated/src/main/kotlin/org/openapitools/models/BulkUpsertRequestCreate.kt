@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkUpsertRequestCreate(
    @field:JsonProperty("ad_groups")
    val adGroups: kotlin.collections.List<AdGroupCreateRequest>? = null,

    @field:JsonProperty("ads")
    val ads: kotlin.collections.List<AdCreateRequest>? = null,

    @field:JsonProperty("campaigns")
    val campaigns: kotlin.collections.List<CampaignCreateRequest>? = null,

    @field:JsonProperty("catalog_product_groups")
    val catalogProductGroups: kotlin.collections.List<BulkUpsertRequestCreateCatalogProductGroupsItems>? = null,

    @field:JsonProperty("keywords")
    val keywords: kotlin.collections.List<KeywordsRequest>? = null,

    @field:JsonProperty("labels")
    val labels: kotlin.collections.List<LabelBulkCreateRequest>? = null,

    @field:JsonProperty("product_groups")
    val productGroups: kotlin.collections.List<ProductGroupPromotionCreateRequest>? = null,

    @field:JsonProperty("schedules")
    val schedules: kotlin.collections.List<ScheduleCreateRequest>? = null,

)

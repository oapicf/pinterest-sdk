@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessMemberAssetsGetResponse(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<AssetIdPermissions>,

    @field:JsonProperty("total_data_count")
    val totalDataCount: kotlin.Int,

    @field:JsonProperty("bookmark")
    val bookmark: kotlin.String? = null,

    @field:JsonProperty("total_data_count_by_status")
    val totalDataCountByStatus: TotalCountByEntityStatus? = null,

)

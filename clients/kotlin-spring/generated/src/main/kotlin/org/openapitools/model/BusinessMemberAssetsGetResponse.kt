package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AssetIdPermissions
import org.openapitools.model.TotalCountByEntityStatus
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Paginated response for business member assets with total count metadata.
 * @param items 
 * @param totalDataCount Total number of assets matching the query
 * @param bookmark 
 * @param totalDataCountByStatus Breakdown of asset counts by entity status (ad accounts only)
 */
data class BusinessMemberAssetsGetResponse(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("items")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<AssetIdPermissions>,

    @Schema(required = true, description = "Total number of assets matching the query")
    @param:JsonProperty("total_data_count")
    @get:JsonProperty("total_data_count", required = true) val totalDataCount: kotlin.Int,

    @Schema(description = "")
    @param:JsonProperty("bookmark")
    @get:JsonProperty("bookmark") val bookmark: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Breakdown of asset counts by entity status (ad accounts only)")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("total_data_count_by_status")
    @get:JsonProperty("total_data_count_by_status") val totalDataCountByStatus: TotalCountByEntityStatus? = null
) {

}


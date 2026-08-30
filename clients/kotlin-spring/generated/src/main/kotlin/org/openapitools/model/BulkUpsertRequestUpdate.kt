package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdGroupUpdateRequest
import org.openapitools.model.AdUpdateRequest
import org.openapitools.model.BulkUpsertRequestUpdateCatalogProductGroupsItems
import org.openapitools.model.CampaignUpdateRequest
import org.openapitools.model.KeywordUpdateGenerated
import org.openapitools.model.LabelBulkUpdateRequest
import org.openapitools.model.ProductGroupPromotionUpdateRequest
import org.openapitools.model.ScheduleUpdateRequest
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
 * Request for creation of entities in bulk.
 * @param adGroups 
 * @param ads 
 * @param campaigns 
 * @param catalogProductGroups 
 * @param keywords 
 * @param labels 
 * @param productGroups 
 * @param schedules 
 */
data class BulkUpsertRequestUpdate(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_groups")
    @get:JsonProperty("ad_groups") val adGroups: kotlin.collections.List<AdGroupUpdateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ads")
    @get:JsonProperty("ads") val ads: kotlin.collections.List<AdUpdateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaigns")
    @get:JsonProperty("campaigns") val campaigns: kotlin.collections.List<CampaignUpdateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_product_groups")
    @get:JsonProperty("catalog_product_groups") val catalogProductGroups: kotlin.collections.List<BulkUpsertRequestUpdateCatalogProductGroupsItems>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<KeywordUpdateGenerated>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("labels")
    @get:JsonProperty("labels") val labels: kotlin.collections.List<LabelBulkUpdateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_groups")
    @get:JsonProperty("product_groups") val productGroups: kotlin.collections.List<ProductGroupPromotionUpdateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("schedules")
    @get:JsonProperty("schedules") val schedules: kotlin.collections.List<ScheduleUpdateRequest>? = null
) {

}


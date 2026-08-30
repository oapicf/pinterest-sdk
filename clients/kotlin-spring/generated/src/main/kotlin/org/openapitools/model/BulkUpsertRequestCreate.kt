package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AdCreateRequest
import org.openapitools.model.AdGroupCreateRequest
import org.openapitools.model.BulkUpsertRequestCreateCatalogProductGroupsItems
import org.openapitools.model.CampaignCreateRequest
import org.openapitools.model.KeywordsRequest
import org.openapitools.model.LabelBulkCreateRequest
import org.openapitools.model.ProductGroupPromotionCreateRequest
import org.openapitools.model.ScheduleCreateRequest
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
data class BulkUpsertRequestCreate(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_groups")
    @get:JsonProperty("ad_groups") val adGroups: kotlin.collections.List<AdGroupCreateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ads")
    @get:JsonProperty("ads") val ads: kotlin.collections.List<AdCreateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaigns")
    @get:JsonProperty("campaigns") val campaigns: kotlin.collections.List<CampaignCreateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_product_groups")
    @get:JsonProperty("catalog_product_groups") val catalogProductGroups: kotlin.collections.List<BulkUpsertRequestCreateCatalogProductGroupsItems>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("keywords")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<KeywordsRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("labels")
    @get:JsonProperty("labels") val labels: kotlin.collections.List<LabelBulkCreateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_groups")
    @get:JsonProperty("product_groups") val productGroups: kotlin.collections.List<ProductGroupPromotionCreateRequest>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("schedules")
    @get:JsonProperty("schedules") val schedules: kotlin.collections.List<ScheduleCreateRequest>? = null
) {

}


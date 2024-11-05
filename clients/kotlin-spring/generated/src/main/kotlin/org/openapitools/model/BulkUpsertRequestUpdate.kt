package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdGroupUpdateRequest
import org.openapitools.model.AdUpdateRequest
import org.openapitools.model.CampaignUpdateRequest
import org.openapitools.model.KeywordUpdate
import org.openapitools.model.ProductGroupPromotionUpdateRequest
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
 * @param campaigns 
 * @param adGroups 
 * @param ads 
 * @param productGroups 
 * @param keywords 
 */
data class BulkUpsertRequestUpdate(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("campaigns") val campaigns: kotlin.collections.List<CampaignUpdateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ad_groups") val adGroups: kotlin.collections.List<AdGroupUpdateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ads") val ads: kotlin.collections.List<AdUpdateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("product_groups") val productGroups: kotlin.collections.List<ProductGroupPromotionUpdateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<KeywordUpdate>? = null
    ) {

}


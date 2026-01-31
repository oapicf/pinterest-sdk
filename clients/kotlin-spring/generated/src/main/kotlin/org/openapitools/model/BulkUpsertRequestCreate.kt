package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdCreateRequest
import org.openapitools.model.AdGroupCreateRequest
import org.openapitools.model.CampaignCreateRequest
import org.openapitools.model.KeywordsRequest
import org.openapitools.model.ProductGroupPromotionCreateRequest
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
data class BulkUpsertRequestCreate(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("campaigns") val campaigns: kotlin.collections.List<CampaignCreateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ad_groups") val adGroups: kotlin.collections.List<AdGroupCreateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ads") val ads: kotlin.collections.List<AdCreateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("product_groups") val productGroups: kotlin.collections.List<ProductGroupPromotionCreateRequest>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("keywords") val keywords: kotlin.collections.List<KeywordsRequest>? = null
) {

}


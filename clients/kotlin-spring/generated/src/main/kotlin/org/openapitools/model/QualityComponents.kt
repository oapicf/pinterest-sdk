package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.QualityComponentDetails
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
 * Set of quality components, with each component containing a event coverage and details.
 * @param advertiserExternalId 
 * @param clickIdEpik 
 * @param externalEventId Dedup components.
 * @param hashedEmail User matching identifiers.
 * @param hashedMaid 
 * @param ipAddress 
 * @param orderId 
 * @param orderValue 
 * @param productId Product/event metadata.
 * @param sourceUrl 
 * @param userAgent 
 */
data class QualityComponents(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("advertiser_external_id") val advertiserExternalId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("click_id_epik") val clickIdEpik: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "Dedup components.")
    @get:JsonProperty("external_event_id") val externalEventId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "User matching identifiers.")
    @get:JsonProperty("hashed_email") val hashedEmail: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("hashed_maid") val hashedMaid: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ip_address") val ipAddress: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("order_id") val orderId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("order_value") val orderValue: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "Product/event metadata.")
    @get:JsonProperty("product_id") val productId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("source_url") val sourceUrl: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user_agent") val userAgent: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null
) {

}


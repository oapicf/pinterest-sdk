package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("advertiser_external_id")
    @get:JsonProperty("advertiser_external_id") val advertiserExternalId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("click_id_epik")
    @get:JsonProperty("click_id_epik") val clickIdEpik: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "Dedup components.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("external_event_id")
    @get:JsonProperty("external_event_id") val externalEventId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "User matching identifiers.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hashed_email")
    @get:JsonProperty("hashed_email") val hashedEmail: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hashed_maid")
    @get:JsonProperty("hashed_maid") val hashedMaid: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ip_address")
    @get:JsonProperty("ip_address") val ipAddress: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("order_id")
    @get:JsonProperty("order_id") val orderId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("order_value")
    @get:JsonProperty("order_value") val orderValue: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "Product/event metadata.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_id")
    @get:JsonProperty("product_id") val productId: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("source_url")
    @get:JsonProperty("source_url") val sourceUrl: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_agent")
    @get:JsonProperty("user_agent") val userAgent: kotlin.collections.Map<kotlin.String, QualityComponentDetails>? = null
) {

}


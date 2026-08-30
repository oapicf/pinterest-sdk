package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NullablePartnerType
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
 * 
 * @param partnerIds A list of partner ids to be deleted
 * @param partnerType 
 */
data class DeleteBusinessPartnersDelete(

    @get:Size(min=1,max=50) 
    @Schema(required = true, description = "A list of partner ids to be deleted")
    @param:JsonProperty("partner_ids")
    @get:JsonProperty("partner_ids", required = true) val partnerIds: kotlin.collections.List<kotlin.String>,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("partner_type")
    @get:JsonProperty("partner_type") val partnerType: NullablePartnerType? = null
) {

}


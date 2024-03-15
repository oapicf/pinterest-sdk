package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AudienceCreateRequest1AudienceType
import org.openapitools.model.AudienceRule
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
 * @param name Audience name.
 * @param rule 
 * @param audienceType 
 * @param adAccountId Ad account ID.
 * @param description Audience description.
 */
data class AudienceCreateRequest(

    @Schema(example = "string", required = true, description = "Audience name.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("rule", required = true) val rule: AudienceRule,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("audience_type", required = true) val audienceType: AudienceCreateRequest1AudienceType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "string", description = "Audience description.")
    @get:JsonProperty("description") val description: kotlin.String? = null
) {

}


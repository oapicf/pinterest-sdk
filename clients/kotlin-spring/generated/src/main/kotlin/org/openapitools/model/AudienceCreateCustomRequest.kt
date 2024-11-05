package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AudienceDataParty
import org.openapitools.model.AudienceRule
import org.openapitools.model.AudienceSharingType
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
 * @param sharingType 
 * @param dataParty 
 * @param adAccountId Ad account ID.
 * @param category 
 */
data class AudienceCreateCustomRequest(

    @Schema(example = "string", required = true, description = "Audience name.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("rule", required = true) val rule: AudienceRule,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("sharing_type", required = true) val sharingType: AudienceSharingType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("data_party", required = true) val dataParty: AudienceDataParty,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "549755885175", description = "Ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "DLX Demographics", description = "")
    @get:JsonProperty("category") val category: kotlin.String? = null
    ) {

}


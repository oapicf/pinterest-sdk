package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdAccountOwner
import org.openapitools.model.BusinessAccessRole
import org.openapitools.model.Country
import org.openapitools.model.Currency
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
 * @param id 
 * @param country 
 * @param createdTime  Creation time. Unix timestamp in seconds.
 * @param currency 
 * @param name Ad account name.
 * @param owner Ad account owner
 * @param permissions 
 * @param updatedTime 
 */
data class AdAccount(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(example = "null", readOnly = true, description = " Creation time. Unix timestamp in seconds.")
    @get:JsonProperty("created_time") val createdTime: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Ad account name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "Ad account owner")
    @get:JsonProperty("owner") val owner: AdAccountOwner? = null,

    @field:Valid
    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("permissions") val permissions: kotlin.collections.List<BusinessAccessRole>? = null,

    @Schema(example = "null", readOnly = true, description = "")
    @get:JsonProperty("updated_time") val updatedTime: kotlin.Int? = null
) {

}


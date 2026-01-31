package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Resource create operation model.
 * @param country 
 * @param currency 
 * @param name Ad account name.
 * @param ownerUserId Advertiser's owning user ID.
 */
data class AdAccountCreate(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: Country? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Ad account name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Advertiser's owning user ID.")
    @get:JsonProperty("owner_user_id") val ownerUserId: kotlin.String? = null
) {

}


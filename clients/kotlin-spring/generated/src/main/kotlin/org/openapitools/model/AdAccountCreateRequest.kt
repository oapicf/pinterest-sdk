package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Country
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
 * @param country 
 * @param name Ad Account name.
 * @param ownerUserId Advertiser's owning user ID.
 */
data class AdAccountCreateRequest(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("country") val country: Country? = null,

    @get:Size(max=256)
    @Schema(example = "ACME Tools", description = "Ad Account name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Advertiser's owning user ID.")
    @get:JsonProperty("owner_user_id") val ownerUserId: kotlin.String? = null
    ) {

}


package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param brandAccountId id of the newly created brand account
 */
data class BrandAccountsCreate200Response(

    @Schema(example = "666791336903426391", description = "id of the newly created brand account")
    @get:JsonProperty("brand_account_id") val brandAccountId: kotlin.String? = null
) {

}


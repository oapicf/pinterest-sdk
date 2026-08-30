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
 * @param brandAccountId 
 */
data class BrandAccount(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("brand_account_id")
    @get:JsonProperty("brand_account_id", required = true) val brandAccountId: kotlin.String
) {

}


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
 * @param name Display name
 * @param id Salesforce id for PMP
 */
data class SSIOAccountPMPName(

    @Schema(example = "Bidalgo", description = "Display name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "0011N00001LW2aSQAT", description = "Salesforce id for PMP")
    @get:JsonProperty("id") val id: kotlin.String? = null
    ) {

}


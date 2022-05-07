package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Board fields for updates
 * @param name 
 * @param description 
 * @param privacy 
 */
data class BoardUpdate(

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:JsonProperty("description") val description: kotlin.String? = null,

    @field:JsonProperty("privacy") val privacy: BoardUpdate.Privacy? = null
) {

    /**
    * 
    * Values: pUBLIC,sECRET
    */
    enum class Privacy(val value: kotlin.String) {
    
        @JsonProperty("PUBLIC") pUBLIC("PUBLIC"),
    
        @JsonProperty("SECRET") sECRET("SECRET");
    
    }

}


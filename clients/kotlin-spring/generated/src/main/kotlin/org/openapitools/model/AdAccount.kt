package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AdAccountOwner
import org.openapitools.model.Country
import org.openapitools.model.Currency
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param id 
 * @param name 
 * @param owner 
 * @param country 
 * @param currency 
 */
data class AdAccount(

    @field:JsonProperty("id") val id: kotlin.String? = null,

    @field:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @field:JsonProperty("owner") val owner: AdAccountOwner? = null,

    @field:Valid
    @field:JsonProperty("country") val country: Country? = null,

    @field:Valid
    @field:JsonProperty("currency") val currency: Currency? = null
) {

}


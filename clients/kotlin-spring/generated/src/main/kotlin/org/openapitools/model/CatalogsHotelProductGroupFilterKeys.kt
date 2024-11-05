package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BrandFilter
import org.openapitools.model.CatalogsProductGroupMultipleCountriesCriteria
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria
import org.openapitools.model.CatalogsProductGroupPricingCurrencyCriteria
import org.openapitools.model.CountryFilter
import org.openapitools.model.CustomLabel0Filter
import org.openapitools.model.CustomLabel1Filter
import org.openapitools.model.CustomLabel2Filter
import org.openapitools.model.CustomLabel3Filter
import org.openapitools.model.CustomLabel4Filter
import org.openapitools.model.HotelIdFilter
import org.openapitools.model.PriceFilter
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
 * @param PRICE 
 * @param HOTEL_ID 
 * @param BRAND 
 * @param CUSTOM_LABEL_0 
 * @param CUSTOM_LABEL_1 
 * @param CUSTOM_LABEL_2 
 * @param CUSTOM_LABEL_3 
 * @param CUSTOM_LABEL_4 
 * @param COUNTRY 
 */
data class CatalogsHotelProductGroupFilterKeys(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("PRICE", required = true) val PRICE: CatalogsProductGroupPricingCurrencyCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("HOTEL_ID", required = true) val HOTEL_ID: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("BRAND", required = true) val BRAND: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_0", required = true) val CUSTOM_LABEL_0: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_1", required = true) val CUSTOM_LABEL_1: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_2", required = true) val CUSTOM_LABEL_2: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_3", required = true) val CUSTOM_LABEL_3: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("CUSTOM_LABEL_4", required = true) val CUSTOM_LABEL_4: CatalogsProductGroupMultipleStringCriteria,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("COUNTRY", required = true) val COUNTRY: CatalogsProductGroupMultipleCountriesCriteria
    ) {

}


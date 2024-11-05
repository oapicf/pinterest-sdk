package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelReportParametersReport
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
 * Parameters for retail report
 * @param catalogType 
 * @param report 
 */
data class CatalogsRetailReportParameters(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsRetailReportParameters.CatalogType,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("report", required = true) val report: CatalogsHotelReportParametersReport
    ) {

    /**
    * 
    * Values: RETAIL
    */
    enum class CatalogType(@get:JsonValue val value: kotlin.String) {

        RETAIL("RETAIL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): CatalogType {
                return values().first{it -> it.value == value}
            }
        }
    }

}


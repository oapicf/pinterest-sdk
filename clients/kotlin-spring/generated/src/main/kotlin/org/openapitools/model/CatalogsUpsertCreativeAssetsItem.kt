package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsAttributes
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
 * A creative assets item to be upserted.
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
data class CatalogsUpsertCreativeAssetsItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog creative assets id in the merchant namespace")
    @get:JsonProperty("creative_assets_id", required = true) val creativeAssetsId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: CatalogsUpsertCreativeAssetsItem.Operation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("attributes", required = true) val attributes: CatalogsCreativeAssetsAttributes
    ) {

    /**
    * 
    * Values: UPSERT
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        UPSERT("UPSERT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().first{it -> it.value == value}
            }
        }
    }

}


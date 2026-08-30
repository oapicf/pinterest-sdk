package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreativeAssetsAttributes
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * A creative assets item to be created.
 * @param attributes 
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param operation 
 */
data class CatalogsCreateCreativeAssetsItem(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("attributes")
    @get:JsonProperty("attributes", required = true) val attributes: CatalogsCreativeAssetsAttributes,

    @Schema(example = "DS0294-M", required = true, description = "The catalog creative assets id in the merchant namespace")
    @param:JsonProperty("creative_assets_id")
    @get:JsonProperty("creative_assets_id", required = true) val creativeAssetsId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) override val operation: CatalogsCreateCreativeAssetsItem.Operation = kotlin.String.CREATE
) : CatalogsCreativeAssetsBatchItem {

    /**
    * 
    * Values: CREATE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        CREATE("CREATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Operation'")
            }
        }
    }

}


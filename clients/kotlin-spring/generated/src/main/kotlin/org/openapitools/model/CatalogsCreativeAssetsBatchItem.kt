package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreateCreativeAssetsItem
import org.openapitools.model.CatalogsDeleteCreativeAssetsItem
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes
import org.openapitools.model.CatalogsUpdateCreativeAssetsItem
import org.openapitools.model.CatalogsUpsertCreativeAssetsItem
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
 * Creative assets batch item
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param operation 
 * @param attributes 
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreateCreativeAssetsItem::class, name = "CREATE"),
      JsonSubTypes.Type(value = CatalogsDeleteCreativeAssetsItem::class, name = "DELETE"),
      JsonSubTypes.Type(value = CatalogsUpdateCreativeAssetsItem::class, name = "UPDATE"),
      JsonSubTypes.Type(value = CatalogsUpsertCreativeAssetsItem::class, name = "UPSERT")
)

interface CatalogsCreativeAssetsBatchItem{
                @get:Schema(example = "DS0294-M", requiredMode = Schema.RequiredMode.REQUIRED, description = "The catalog creative assets id in the merchant namespace")
        val creativeAssetsId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val operation: CatalogsCreativeAssetsBatchItem.Operation

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val attributes: CatalogsUpdatableCreativeAssetsAttributes


    /**
    * 
    * Values: DELETE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        DELETE("DELETE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().first{it -> it.value == value}
            }
        }
    }

}


package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ItemAttributes
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
 * An item to be created
 * @param itemId The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
data class CatalogsCreateRetailItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog item id in the merchant namespace")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: CatalogsCreateRetailItem.Operation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("attributes", required = true) val attributes: ItemAttributes
) {

    /**
    * 
    * Values: CREATE,UPDATE,UPSERT,DELETE
    */
    enum class Operation(val value: kotlin.String) {

        @JsonProperty("CREATE") CREATE("CREATE"),
        @JsonProperty("UPDATE") UPDATE("UPDATE"),
        @JsonProperty("UPSERT") UPSERT("UPSERT"),
        @JsonProperty("DELETE") DELETE("DELETE")
    }

}


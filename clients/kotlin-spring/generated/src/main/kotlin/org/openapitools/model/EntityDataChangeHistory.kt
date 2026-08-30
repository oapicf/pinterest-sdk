package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ChangeHistoryDataType
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
 * @param changedFieldId A string identifier representing the changed field on the entity
 * @param changedFieldName The human readable name of the changed field on the entity
 * @param dataType Specifies the type of the field's data values
 * @param newDataValue A string representation of the value of the changed field, after the change
 * @param oldDataValue A string representation of the value of the changed field, before the change
 */
data class EntityDataChangeHistory(

    @Schema(description = "A string identifier representing the changed field on the entity")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("changed_field_id")
    @get:JsonProperty("changed_field_id") val changedFieldId: kotlin.String? = null,

    @Schema(description = "The human readable name of the changed field on the entity")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("changed_field_name")
    @get:JsonProperty("changed_field_name") val changedFieldName: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Specifies the type of the field's data values")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("data_type")
    @get:JsonProperty("data_type") val dataType: ChangeHistoryDataType? = null,

    @Schema(description = "A string representation of the value of the changed field, after the change")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("new_data_value")
    @get:JsonProperty("new_data_value") val newDataValue: kotlin.String? = null,

    @Schema(description = "A string representation of the value of the changed field, before the change")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("old_data_value")
    @get:JsonProperty("old_data_value") val oldDataValue: kotlin.String? = null
) {

}


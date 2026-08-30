@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EntityDataChangeHistory(
    @field:JsonProperty("changed_field_id")
    val changedFieldId: kotlin.String? = null,

    @field:JsonProperty("changed_field_name")
    val changedFieldName: kotlin.String? = null,

    @field:JsonProperty("data_type")
    val dataType: ChangeHistoryDataType? = null,

    @field:JsonProperty("new_data_value")
    val newDataValue: kotlin.String? = null,

    @field:JsonProperty("old_data_value")
    val oldDataValue: kotlin.String? = null,

)

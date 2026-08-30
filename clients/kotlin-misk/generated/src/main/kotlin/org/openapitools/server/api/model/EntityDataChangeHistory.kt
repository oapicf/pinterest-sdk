package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChangeHistoryDataType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EntityDataChangeHistory(
    /** A string identifier representing the changed field on the entity */
    val changedFieldId: kotlin.String? = null,
    /** The human readable name of the changed field on the entity */
    val changedFieldName: kotlin.String? = null,
    /** Specifies the type of the field&#39;s data values */
    val dataType: ChangeHistoryDataType? = null,
    /** A string representation of the value of the changed field, after the change */
    val newDataValue: kotlin.String? = null,
    /** A string representation of the value of the changed field, before the change */
    val oldDataValue: kotlin.String? = null
)

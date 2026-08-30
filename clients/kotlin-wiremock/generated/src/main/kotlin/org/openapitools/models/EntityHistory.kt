@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EntityHistory(
    @field:JsonProperty("change_timestamp")
    val changeTimestamp: kotlin.Int? = null,

    @field:JsonProperty("data_changes")
    val dataChanges: kotlin.collections.List<EntityDataChangeHistory>? = null,

    @field:JsonProperty("entity_id")
    val entityId: kotlin.String? = null,

    @field:JsonProperty("entity_name")
    val entityName: kotlin.String? = null,

    @field:JsonProperty("ldap")
    val ldap: kotlin.String? = null,

    @field:JsonProperty("operation")
    val operation: ChangeHistoryOperationType? = null,

    @field:JsonProperty("user_id")
    val userId: kotlin.String? = null,

)

package org.openapitools.server.api.model

import org.openapitools.server.api.model.ChangeHistoryOperationType
import org.openapitools.server.api.model.EntityDataChangeHistory
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EntityHistory(
    /** A Unix timestamp representing the time of the change in seconds */
    val changeTimestamp: kotlin.Int? = null,
    /** Properties associated with a particular change to an entity&#39;s data */
    val dataChanges: kotlin.collections.List<EntityDataChangeHistory>? = null,
    /** The id of the entity that was changed */
    val entityId: kotlin.String? = null,
    /** The name of the entity that was changed */
    val entityName: kotlin.String? = null,
    /** The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users */
    val ldap: kotlin.String? = null,
    /** The type of operation that caused the change */
    val operation: ChangeHistoryOperationType? = null,
    /** The id of the user who initiated the change */
    val userId: kotlin.String? = null
)

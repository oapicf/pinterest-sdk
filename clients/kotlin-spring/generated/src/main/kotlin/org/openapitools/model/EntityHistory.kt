package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ChangeHistoryOperationType
import org.openapitools.model.EntityDataChangeHistory
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
 * @param changeTimestamp A Unix timestamp representing the time of the change in seconds
 * @param dataChanges Properties associated with a particular change to an entity's data
 * @param entityId The id of the entity that was changed
 * @param entityName The name of the entity that was changed
 * @param ldap The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
 * @param operation The type of operation that caused the change
 * @param userId The id of the user who initiated the change
 */
data class EntityHistory(

    @Schema(description = "A Unix timestamp representing the time of the change in seconds")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("change_timestamp")
    @get:JsonProperty("change_timestamp") val changeTimestamp: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Properties associated with a particular change to an entity's data")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("data_changes")
    @get:JsonProperty("data_changes") val dataChanges: kotlin.collections.List<EntityDataChangeHistory>? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The id of the entity that was changed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("entity_id")
    @get:JsonProperty("entity_id") val entityId: kotlin.String? = null,

    @Schema(description = "The name of the entity that was changed")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("entity_name")
    @get:JsonProperty("entity_name") val entityName: kotlin.String? = null,

    @Schema(description = "The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ldap")
    @get:JsonProperty("ldap") val ldap: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The type of operation that caused the change")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("operation")
    @get:JsonProperty("operation") val operation: ChangeHistoryOperationType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The id of the user who initiated the change")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_id")
    @get:JsonProperty("user_id") val userId: kotlin.String? = null
) {

}


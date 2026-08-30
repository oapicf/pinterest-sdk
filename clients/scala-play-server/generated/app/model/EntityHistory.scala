package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EntityHistory.
  * @param changeTimestamp A Unix timestamp representing the time of the change in seconds
  * @param dataChanges Properties associated with a particular change to an entity's data
  * @param entityId The id of the entity that was changed
  * @param entityName The name of the entity that was changed
  * @param ldap The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
  * @param operation The type of operation that caused the change
  * @param userId The id of the user who initiated the change
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EntityHistory(
  changeTimestamp: Option[Int],
  dataChanges: Option[List[EntityDataChangeHistory]],
  entityId: Option[String],
  entityName: Option[String],
  ldap: Option[String],
  operation: Option[ChangeHistoryOperationType],
  userId: Option[String]
)

object EntityHistory {
  implicit lazy val entityHistoryJsonFormat: Format[EntityHistory] = Json.format[EntityHistory]
}


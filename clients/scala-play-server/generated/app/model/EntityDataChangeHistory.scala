package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EntityDataChangeHistory.
  * @param changedFieldId A string identifier representing the changed field on the entity
  * @param changedFieldName The human readable name of the changed field on the entity
  * @param dataType Specifies the type of the field's data values
  * @param newDataValue A string representation of the value of the changed field, after the change
  * @param oldDataValue A string representation of the value of the changed field, before the change
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EntityDataChangeHistory(
  changedFieldId: Option[String],
  changedFieldName: Option[String],
  dataType: Option[ChangeHistoryDataType],
  newDataValue: Option[String],
  oldDataValue: Option[String]
)

object EntityDataChangeHistory {
  implicit lazy val entityDataChangeHistoryJsonFormat: Format[EntityDataChangeHistory] = Json.format[EntityDataChangeHistory]
}


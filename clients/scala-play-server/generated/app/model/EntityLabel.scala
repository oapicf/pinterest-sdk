package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EntityLabel.
  * @param entityId Entity ID to apply label to.
  * @param labelId Label ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class EntityLabel(
  entityId: String,
  entityType: Option[LabelParentType],
  labelId: String,
  status: Option[EntityLabelStatus]
)

object EntityLabel {
  implicit lazy val entityLabelJsonFormat: Format[EntityLabel] = Json.format[EntityLabel]
}


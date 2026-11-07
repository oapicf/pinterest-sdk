package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for EntityLabelError.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class EntityLabelError(
  data: Option[EntityLabel],
  errorMessages: Option[List[String]]
)

object EntityLabelError {
  implicit lazy val entityLabelErrorJsonFormat: Format[EntityLabelError] = Json.format[EntityLabelError]
}


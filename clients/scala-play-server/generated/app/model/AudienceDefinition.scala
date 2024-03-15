package model

import play.api.libs.json._

/**
  * Queryable audience representation.
  * @param date Generation date
  * @param `type` Generated audience type to request.
  * @param scope Generated audience scope to request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AudienceDefinition(
  date: Option[String],
  `type`: Option[String],
  scope: Option[String]
)

object AudienceDefinition {
  implicit lazy val audienceDefinitionJsonFormat: Format[AudienceDefinition] = Json.format[AudienceDefinition]
}


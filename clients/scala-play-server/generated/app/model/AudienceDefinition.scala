package model

import play.api.libs.json._

/**
  * Queryable audience representation.
  * @param date Generation date
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceDefinition(
  date: Option[String],
  scope: Option[String],
  `type`: Option[String]
)

object AudienceDefinition {
  implicit lazy val audienceDefinitionJsonFormat: Format[AudienceDefinition] = Json.format[AudienceDefinition]
}


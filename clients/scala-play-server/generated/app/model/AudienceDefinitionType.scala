package model

import play.api.libs.json._

/**
  * Generated audience type to request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceDefinitionType(
  scope: Option[AudienceDefinitionType.Scope.Value]
)

object AudienceDefinitionType {
  implicit lazy val audienceDefinitionTypeJsonFormat: Format[AudienceDefinitionType] = Json.format[AudienceDefinitionType]

  // noinspection TypeAnnotation
  object Scope extends Enumeration {
    val IMPRESSIONPLUSENGAGEMENT = Value("IMPRESSION_PLUS_ENGAGEMENT")
    val ENGAGEMENT = Value("ENGAGEMENT")

    type Scope = Value
    implicit lazy val ScopeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


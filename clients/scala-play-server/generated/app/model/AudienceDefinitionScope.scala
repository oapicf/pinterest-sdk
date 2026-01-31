package model

import play.api.libs.json._

/**
  * Generated audience scope to request.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceDefinitionScope(
  scope: Option[AudienceDefinitionScope.Scope.Value]
)

object AudienceDefinitionScope {
  implicit lazy val audienceDefinitionScopeJsonFormat: Format[AudienceDefinitionScope] = Json.format[AudienceDefinitionScope]

  // noinspection TypeAnnotation
  object Scope extends Enumeration {
    val PARTNER = Value("PARTNER")
    val PINTEREST = Value("PINTEREST")

    type Scope = Value
    implicit lazy val ScopeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


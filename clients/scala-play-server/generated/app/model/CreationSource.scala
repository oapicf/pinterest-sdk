package model

import play.api.libs.json._

/**
  * The source of conversion events ingestion
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreationSource(
)

object CreationSource {
  implicit lazy val creationSourceJsonFormat: Format[CreationSource] = Json.format[CreationSource]
}


package model

import play.api.libs.json._

/**
  * List of source platforms for a conversion event.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class SourcePlatformOptions(
)

object SourcePlatformOptions {
  implicit lazy val sourcePlatformOptionsJsonFormat: Format[SourcePlatformOptions] = Json.format[SourcePlatformOptions]
}


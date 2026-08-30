package model

import play.api.libs.json._

/**
  * Language code, which is among the official ISO 639-1 language list.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Language(
)

object Language {
  implicit lazy val languageJsonFormat: Format[Language] = Json.format[Language]
}


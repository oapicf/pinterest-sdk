package model

import play.api.libs.json._

/**
  * Language code, which is among the official ISO 639-1 language list.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class Language(
)

object Language {
  implicit lazy val languageJsonFormat: Format[Language] = Json.format[Language]
}


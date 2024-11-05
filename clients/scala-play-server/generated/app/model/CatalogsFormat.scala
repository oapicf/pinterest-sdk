package model

import play.api.libs.json._

/**
  * The file format of a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFormat(
)

object CatalogsFormat {
  implicit lazy val catalogsFormatJsonFormat: Format[CatalogsFormat] = Json.format[CatalogsFormat]
}


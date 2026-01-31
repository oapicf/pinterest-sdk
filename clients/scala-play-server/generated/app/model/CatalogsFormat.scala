package model

import play.api.libs.json._

/**
  * The file format of a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFormat(
)

object CatalogsFormat {
  implicit lazy val catalogsFormatJsonFormat: Format[CatalogsFormat] = Json.format[CatalogsFormat]
}


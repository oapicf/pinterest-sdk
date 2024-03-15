package model

import play.api.libs.json._

/**
  * The file format of a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsFormat(
)

object CatalogsFormat {
  implicit lazy val catalogsFormatJsonFormat: Format[CatalogsFormat] = Json.format[CatalogsFormat]
}


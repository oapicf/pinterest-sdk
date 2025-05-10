package model

import play.api.libs.json._

/**
  * The file format of a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsFormat(
)

object CatalogsFormat {
  implicit lazy val catalogsFormatJsonFormat: Format[CatalogsFormat] = Json.format[CatalogsFormat]
}


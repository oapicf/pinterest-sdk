package model

import play.api.libs.json._

/**
  * The file format of a feed.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFormat(
)

object CatalogsFormat {
  implicit lazy val catalogsFormatJsonFormat: Format[CatalogsFormat] = Json.format[CatalogsFormat]
}


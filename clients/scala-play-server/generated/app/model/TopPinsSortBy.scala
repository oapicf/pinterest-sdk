package model

import play.api.libs.json._

/**
  * Sort metric for top pins analytics.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TopPinsSortBy(
)

object TopPinsSortBy {
  implicit lazy val topPinsSortByJsonFormat: Format[TopPinsSortBy] = Json.format[TopPinsSortBy]
}


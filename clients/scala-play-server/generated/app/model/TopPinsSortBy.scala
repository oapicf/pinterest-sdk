package model

import play.api.libs.json._

/**
  * Sort metric for top pins analytics.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TopPinsSortBy(
)

object TopPinsSortBy {
  implicit lazy val topPinsSortByJsonFormat: Format[TopPinsSortBy] = Json.format[TopPinsSortBy]
}


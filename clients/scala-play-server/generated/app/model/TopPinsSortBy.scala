package model

import play.api.libs.json._

/**
  * Sort metric for top pins analytics.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TopPinsSortBy(
)

object TopPinsSortBy {
  implicit lazy val topPinsSortByJsonFormat: Format[TopPinsSortBy] = Json.format[TopPinsSortBy]
}


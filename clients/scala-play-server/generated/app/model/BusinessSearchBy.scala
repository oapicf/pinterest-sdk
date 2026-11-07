package model

import play.api.libs.json._

/**
  * The names of fields that business accounts are searched by
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessSearchBy(
)

object BusinessSearchBy {
  implicit lazy val businessSearchByJsonFormat: Format[BusinessSearchBy] = Json.format[BusinessSearchBy]
}


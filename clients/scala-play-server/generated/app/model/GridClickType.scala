package model

import play.api.libs.json._

/**
  * Where a user is taken after clicking on an ad in grid.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class GridClickType(
)

object GridClickType {
  implicit lazy val gridClickTypeJsonFormat: Format[GridClickType] = Json.format[GridClickType]
}


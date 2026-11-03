package model

import play.api.libs.json._

/**
  * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PlacementTrafficType(
)

object PlacementTrafficType {
  implicit lazy val placementTrafficTypeJsonFormat: Format[PlacementTrafficType] = Json.format[PlacementTrafficType]
}


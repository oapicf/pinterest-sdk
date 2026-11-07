package model

import play.api.libs.json._

/**
  * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PlacementTrafficType(
)

object PlacementTrafficType {
  implicit lazy val placementTrafficTypeJsonFormat: Format[PlacementTrafficType] = Json.format[PlacementTrafficType]
}


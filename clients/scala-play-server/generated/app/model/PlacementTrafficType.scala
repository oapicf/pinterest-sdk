package model

import play.api.libs.json._

/**
  * A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PlacementTrafficType(
)

object PlacementTrafficType {
  implicit lazy val placementTrafficTypeJsonFormat: Format[PlacementTrafficType] = Json.format[PlacementTrafficType]
}


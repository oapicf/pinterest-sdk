package model

import play.api.libs.json._

/**
  * Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class GridClickType(
)

object GridClickType {
  implicit lazy val gridClickTypeJsonFormat: Format[GridClickType] = Json.format[GridClickType]
}


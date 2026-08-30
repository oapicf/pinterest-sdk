package model

import play.api.libs.json._

/**
  * The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class NullableLabelStatus(
)

object NullableLabelStatus {
  implicit lazy val nullableLabelStatusJsonFormat: Format[NullableLabelStatus] = Json.format[NullableLabelStatus]
}


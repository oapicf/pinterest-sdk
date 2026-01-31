package model

import play.api.libs.json._

/**
  * The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelStatus(
)

object LabelStatus {
  implicit lazy val labelStatusJsonFormat: Format[LabelStatus] = Json.format[LabelStatus]
}


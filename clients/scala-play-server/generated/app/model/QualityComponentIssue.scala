package model

import play.api.libs.json._

/**
  * Details of an issue with a quality component.
  * @param id Unique identifier for the issue check.
  * @param name Human-readable name of the issue.
  * @param reason Detailed reason for the issue.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class QualityComponentIssue(
  id: String,
  name: String,
  reason: String
)

object QualityComponentIssue {
  implicit lazy val qualityComponentIssueJsonFormat: Format[QualityComponentIssue] = Json.format[QualityComponentIssue]
}


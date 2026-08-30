package model

import play.api.libs.json._

/**
  * Metrics for a specific event type within a quality component.
  * @param coverage Coverage percentage for this event type.
  * @param issues List of issues detected for this event type, if any.
  * @param overlap Overlap percentage for this event type. Only populated for external_event_id
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class QualityComponentDetails(
  coverage: BigDecimal,
  issues: Option[List[QualityComponentIssue]],
  overlap: Option[BigDecimal]
)

object QualityComponentDetails {
  implicit lazy val qualityComponentDetailsJsonFormat: Format[QualityComponentDetails] = Json.format[QualityComponentDetails]
}


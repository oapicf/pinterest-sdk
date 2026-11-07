package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DynamicTitlesGetStatus.
  * @param generatedCount The count of generated titles.
  * @param isReady Whether dynamic titles have been generated and are ready to be reviewed for the ad group.
  * @param reviewedCount The count of advertiser reviewed titles.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DynamicTitlesGetStatus(
  generatedCount: Option[Int],
  isReady: Option[Boolean],
  reviewedCount: Option[Int]
)

object DynamicTitlesGetStatus {
  implicit lazy val dynamicTitlesGetStatusJsonFormat: Format[DynamicTitlesGetStatus] = Json.format[DynamicTitlesGetStatus]
}


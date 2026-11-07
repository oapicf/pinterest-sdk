package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsGetAsyncResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdsAnalyticsGetAsyncResponse(
  reportStatus: Option[BulkReportingJobStatus],
  size: Option[BigDecimal],
  url: Option[String]
)

object AdsAnalyticsGetAsyncResponse {
  implicit lazy val adsAnalyticsGetAsyncResponseJsonFormat: Format[AdsAnalyticsGetAsyncResponse] = Json.format[AdsAnalyticsGetAsyncResponse]
}


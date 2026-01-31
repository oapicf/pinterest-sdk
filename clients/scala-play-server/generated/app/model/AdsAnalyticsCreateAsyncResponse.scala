package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdsAnalyticsCreateAsyncResponse(
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String],
  message: Option[String]
)

object AdsAnalyticsCreateAsyncResponse {
  implicit lazy val adsAnalyticsCreateAsyncResponseJsonFormat: Format[AdsAnalyticsCreateAsyncResponse] = Json.format[AdsAnalyticsCreateAsyncResponse]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdsAnalyticsCreateAsyncResponse(
  message: Option[String],
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String]
)

object AdsAnalyticsCreateAsyncResponse {
  implicit lazy val adsAnalyticsCreateAsyncResponseJsonFormat: Format[AdsAnalyticsCreateAsyncResponse] = Json.format[AdsAnalyticsCreateAsyncResponse]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsAnalyticsCreateAsyncResponse(
  reportStatus: Option[BulkReportingJobStatus],
  token: Option[String],
  message: Option[String]
)

object AdsAnalyticsCreateAsyncResponse {
  implicit lazy val adsAnalyticsCreateAsyncResponseJsonFormat: Format[AdsAnalyticsCreateAsyncResponse] = Json.format[AdsAnalyticsCreateAsyncResponse]
}


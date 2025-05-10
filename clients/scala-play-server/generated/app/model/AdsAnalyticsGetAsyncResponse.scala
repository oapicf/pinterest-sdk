package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsGetAsyncResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdsAnalyticsGetAsyncResponse(
  reportStatus: Option[BulkReportingJobStatus],
  url: Option[String],
  size: Option[BigDecimal]
)

object AdsAnalyticsGetAsyncResponse {
  implicit lazy val adsAnalyticsGetAsyncResponseJsonFormat: Format[AdsAnalyticsGetAsyncResponse] = Json.format[AdsAnalyticsGetAsyncResponse]
}


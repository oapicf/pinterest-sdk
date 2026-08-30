package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for campaign_ad_preview_delete_200_response_inner_status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignAdPreviewDelete200ResponseInnerStatus(
  statusCode: CampaignAdPreviewDelete200ResponseInnerStatus.StatusCode.Value,
  code: Int,
  message: String
)

object CampaignAdPreviewDelete200ResponseInnerStatus {
  implicit lazy val campaignAdPreviewDelete200ResponseInnerStatusJsonFormat: Format[CampaignAdPreviewDelete200ResponseInnerStatus] = Json.format[CampaignAdPreviewDelete200ResponseInnerStatus]

  // noinspection TypeAnnotation
  object StatusCode extends Enumeration {
    val _204 = Value("204")

    type StatusCode = Value
    implicit lazy val StatusCodeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


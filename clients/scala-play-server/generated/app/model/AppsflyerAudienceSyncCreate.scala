package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param containerId The container ID of the audience
  * @param urlAdidSha256 The pre-signed URL for SHA256 hashed GAID/IDFA file
  * @param urlEmailSha256 The pre-signed URL for SHA256 hashed email file
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AppsflyerAudienceSyncCreate(
  containerId: String,
  urlAdidSha256: Option[String],
  urlEmailSha256: Option[String]
)

object AppsflyerAudienceSyncCreate {
  implicit lazy val appsflyerAudienceSyncCreateJsonFormat: Format[AppsflyerAudienceSyncCreate] = Json.format[AppsflyerAudienceSyncCreate]
}


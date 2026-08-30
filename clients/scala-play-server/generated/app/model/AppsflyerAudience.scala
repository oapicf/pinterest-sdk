package model

import play.api.libs.json._

/**
  * Request model for creating an AppsFlyer audience
  * @param containerId The ID of the audience container
  * @param name The name of the audience
  * @param platform The platform of the audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AppsflyerAudience(
  containerId: String,
  name: String,
  platform: AppsflyerPlatform
)

object AppsflyerAudience {
  implicit lazy val appsflyerAudienceJsonFormat: Format[AppsflyerAudience] = Json.format[AppsflyerAudience]
}


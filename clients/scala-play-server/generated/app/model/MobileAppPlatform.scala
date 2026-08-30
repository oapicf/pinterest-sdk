package model

import play.api.libs.json._

/**
  * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MobileAppPlatform(
)

object MobileAppPlatform {
  implicit lazy val mobileAppPlatformJsonFormat: Format[MobileAppPlatform] = Json.format[MobileAppPlatform]
}


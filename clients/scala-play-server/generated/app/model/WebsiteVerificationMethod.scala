package model

import play.api.libs.json._

/**
  * Method used to verify website ownership.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class WebsiteVerificationMethod(
)

object WebsiteVerificationMethod {
  implicit lazy val websiteVerificationMethodJsonFormat: Format[WebsiteVerificationMethod] = Json.format[WebsiteVerificationMethod]
}


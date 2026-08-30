package model

import play.api.libs.json._

/**
  * Account type filter for audience sharing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AudienceAccountType(
)

object AudienceAccountType {
  implicit lazy val audienceAccountTypeJsonFormat: Format[AudienceAccountType] = Json.format[AudienceAccountType]
}


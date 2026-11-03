package model

import play.api.libs.json._

/**
  * Account type filter for audience sharing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceAccountType(
)

object AudienceAccountType {
  implicit lazy val audienceAccountTypeJsonFormat: Format[AudienceAccountType] = Json.format[AudienceAccountType]
}


package model

import play.api.libs.json._

/**
  * Account type filter for audience sharing.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceAccountType(
)

object AudienceAccountType {
  implicit lazy val audienceAccountTypeJsonFormat: Format[AudienceAccountType] = Json.format[AudienceAccountType]
}


package model

import play.api.libs.json._

/**
  * Whether the data is owned by the partner (1p) or by the data provider (3p)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceDataParty(
)

object AudienceDataParty {
  implicit lazy val audienceDataPartyJsonFormat: Format[AudienceDataParty] = Json.format[AudienceDataParty]
}


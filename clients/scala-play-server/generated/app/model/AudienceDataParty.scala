package model

import play.api.libs.json._

/**
  * Whether the data is owned by the partner (1p) or by the data provider (3p)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AudienceDataParty(
)

object AudienceDataParty {
  implicit lazy val audienceDataPartyJsonFormat: Format[AudienceDataParty] = Json.format[AudienceDataParty]
}


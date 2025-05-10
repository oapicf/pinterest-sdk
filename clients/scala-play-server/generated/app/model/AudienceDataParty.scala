package model

import play.api.libs.json._

/**
  * Whether the data is owned by the partner (1p) or by the data provider (3p)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AudienceDataParty(
)

object AudienceDataParty {
  implicit lazy val audienceDataPartyJsonFormat: Format[AudienceDataParty] = Json.format[AudienceDataParty]
}


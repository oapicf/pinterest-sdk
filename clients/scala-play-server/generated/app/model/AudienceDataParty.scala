package model

import play.api.libs.json._

/**
  * Whether the data is owned by the partner (1p) or by the data provider (3p)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceDataParty(
)

object AudienceDataParty {
  implicit lazy val audienceDataPartyJsonFormat: Format[AudienceDataParty] = Json.format[AudienceDataParty]
}


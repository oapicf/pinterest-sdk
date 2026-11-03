package model

import play.api.libs.json._

/**
  * An object with a list of partner asset accesses to assign or update.
  * @param accesses List of partner asset accesses to assign or update.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdatePartnerAssetAccessBody(
  accesses: List[UpdatePartnerAssetAccessItem]
)

object UpdatePartnerAssetAccessBody {
  implicit lazy val updatePartnerAssetAccessBodyJsonFormat: Format[UpdatePartnerAssetAccessBody] = Json.format[UpdatePartnerAssetAccessBody]
}


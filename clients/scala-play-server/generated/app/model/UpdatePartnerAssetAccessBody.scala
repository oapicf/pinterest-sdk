package model

import play.api.libs.json._

/**
  * An object with a list of partner asset accesses to assign or update.
  * @param accesses List of partner asset accesses to assign or update.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UpdatePartnerAssetAccessBody(
  accesses: List[UpdatePartnerAssetAccessItem]
)

object UpdatePartnerAssetAccessBody {
  implicit lazy val updatePartnerAssetAccessBodyJsonFormat: Format[UpdatePartnerAssetAccessBody] = Json.format[UpdatePartnerAssetAccessBody]
}


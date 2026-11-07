package model

import play.api.libs.json._

/**
  * An object with a list of partner asset accesses to delete.
  * @param accesses List of partner asset accesses to delete.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeletePartnerAssetAccessBody(
  accesses: List[DeletePartnerAssetAccessItem]
)

object DeletePartnerAssetAccessBody {
  implicit lazy val deletePartnerAssetAccessBodyJsonFormat: Format[DeletePartnerAssetAccessBody] = Json.format[DeletePartnerAssetAccessBody]
}


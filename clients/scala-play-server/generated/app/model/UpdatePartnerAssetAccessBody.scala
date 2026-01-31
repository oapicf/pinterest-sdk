package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerAssetAccessBody.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdatePartnerAssetAccessBody(
  accesses: List[UpdatePartnerAssetAccessBodyAccessesInner]
)

object UpdatePartnerAssetAccessBody {
  implicit lazy val updatePartnerAssetAccessBodyJsonFormat: Format[UpdatePartnerAssetAccessBody] = Json.format[UpdatePartnerAssetAccessBody]
}


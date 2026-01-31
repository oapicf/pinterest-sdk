package model

import play.api.libs.json._

/**
  * An object with a list of all the new accesses.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateMemberAssetAccessBody(
  accesses: List[UpdateMemberAssetAccessBodyAccessesInner]
)

object UpdateMemberAssetAccessBody {
  implicit lazy val updateMemberAssetAccessBodyJsonFormat: Format[UpdateMemberAssetAccessBody] = Json.format[UpdateMemberAssetAccessBody]
}


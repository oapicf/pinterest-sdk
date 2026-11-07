package model

import play.api.libs.json._

/**
  * An object with a list of all the new member asset accesses.
  * @param accesses List of member asset accesses to assign or update.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdateMemberAssetAccessBody(
  accesses: List[UpdateMemberAssetAccessItem]
)

object UpdateMemberAssetAccessBody {
  implicit lazy val updateMemberAssetAccessBodyJsonFormat: Format[UpdateMemberAssetAccessBody] = Json.format[UpdateMemberAssetAccessBody]
}


package model

import play.api.libs.json._

/**
  * An object with a list of member asset accesses to delete.
  * @param accesses List of members asset access to be deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessMembersAssetAccessDeleteBody(
  accesses: List[DeleteMemberAssetAccessItem]
)

object BusinessMembersAssetAccessDeleteBody {
  implicit lazy val businessMembersAssetAccessDeleteBodyJsonFormat: Format[BusinessMembersAssetAccessDeleteBody] = Json.format[BusinessMembersAssetAccessDeleteBody]
}


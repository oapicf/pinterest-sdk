package model

import play.api.libs.json._

/**
  * An object with a list of member asset accesses to delete.
  * @param accesses List of members asset access to be deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessMembersAssetAccessDeleteBody(
  accesses: List[DeleteMemberAssetAccessItem]
)

object BusinessMembersAssetAccessDeleteBody {
  implicit lazy val businessMembersAssetAccessDeleteBodyJsonFormat: Format[BusinessMembersAssetAccessDeleteBody] = Json.format[BusinessMembersAssetAccessDeleteBody]
}


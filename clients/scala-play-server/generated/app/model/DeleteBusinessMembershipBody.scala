package model

import play.api.libs.json._

/**
  * List of members with role to delete.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteBusinessMembershipBody(
  members: List[DeleteBusinessMembershipMember]
)

object DeleteBusinessMembershipBody {
  implicit lazy val deleteBusinessMembershipBodyJsonFormat: Format[DeleteBusinessMembershipBody] = Json.format[DeleteBusinessMembershipBody]
}


package model

import play.api.libs.json._

/**
  * List of members with role to delete.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteBusinessMembershipBody(
  members: List[DeleteBusinessMembershipMember]
)

object DeleteBusinessMembershipBody {
  implicit lazy val deleteBusinessMembershipBodyJsonFormat: Format[DeleteBusinessMembershipBody] = Json.format[DeleteBusinessMembershipBody]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateBusinessMembershipsResponse.
  * @param items List of members with updated business access role.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdateBusinessMembershipsResponse(
  items: Option[List[BusinessMembershipMember]]
)

object UpdateBusinessMembershipsResponse {
  implicit lazy val updateBusinessMembershipsResponseJsonFormat: Format[UpdateBusinessMembershipsResponse] = Json.format[UpdateBusinessMembershipsResponse]
}


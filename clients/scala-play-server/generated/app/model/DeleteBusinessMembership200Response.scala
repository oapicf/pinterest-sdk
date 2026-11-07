package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for delete_business_membership_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class DeleteBusinessMembership200Response(
  deletedMembers: Option[List[String]]
)

object DeleteBusinessMembership200Response {
  implicit lazy val deleteBusinessMembership200ResponseJsonFormat: Format[DeleteBusinessMembership200Response] = Json.format[DeleteBusinessMembership200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_members_200_response.
  * @param items List of business members.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetBusinessMembers200Response(
  bookmark: Option[String],
  items: List[UserBusinessRoleBinding]
)

object GetBusinessMembers200Response {
  implicit lazy val getBusinessMembers200ResponseJsonFormat: Format[GetBusinessMembers200Response] = Json.format[GetBusinessMembers200Response]
}


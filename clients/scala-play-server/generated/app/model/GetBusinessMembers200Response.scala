package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_members_200_response.
  * @param items List of business members.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GetBusinessMembers200Response(
  items: List[UserBusinessRoleBinding],
  bookmark: Option[String]
)

object GetBusinessMembers200Response {
  implicit lazy val getBusinessMembers200ResponseJsonFormat: Format[GetBusinessMembers200Response] = Json.format[GetBusinessMembers200Response]
}


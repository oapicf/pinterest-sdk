package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_employers_200_response.
  * @param items List of employers.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetBusinessEmployers200Response(
  items: List[UserBusinessRoleBinding],
  bookmark: Option[String]
)

object GetBusinessEmployers200Response {
  implicit lazy val getBusinessEmployers200ResponseJsonFormat: Format[GetBusinessEmployers200Response] = Json.format[GetBusinessEmployers200Response]
}


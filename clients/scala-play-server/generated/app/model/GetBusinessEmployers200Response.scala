package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_employers_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GetBusinessEmployers200Response(
  bookmark: Option[String],
  items: List[UserBusinessRoleBinding]
)

object GetBusinessEmployers200Response {
  implicit lazy val getBusinessEmployers200ResponseJsonFormat: Format[GetBusinessEmployers200Response] = Json.format[GetBusinessEmployers200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_partners_200_response.
  * @param items List of business partners.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GetBusinessPartners200Response(
  items: List[UserBusinessRoleBinding],
  bookmark: Option[String]
)

object GetBusinessPartners200Response {
  implicit lazy val getBusinessPartners200ResponseJsonFormat: Format[GetBusinessPartners200Response] = Json.format[GetBusinessPartners200Response]
}


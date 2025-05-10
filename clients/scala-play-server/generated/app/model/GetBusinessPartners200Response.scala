package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_partners_200_response.
  * @param items List of business partners.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class GetBusinessPartners200Response(
  items: List[UserBusinessRoleBinding],
  bookmark: Option[String]
)

object GetBusinessPartners200Response {
  implicit lazy val getBusinessPartners200ResponseJsonFormat: Format[GetBusinessPartners200Response] = Json.format[GetBusinessPartners200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_business_partners_200_response.
  * @param items List of business partners.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetBusinessPartners200Response(
  bookmark: Option[String],
  items: List[UserBusinessRoleBinding]
)

object GetBusinessPartners200Response {
  implicit lazy val getBusinessPartners200ResponseJsonFormat: Format[GetBusinessPartners200Response] = Json.format[GetBusinessPartners200Response]
}


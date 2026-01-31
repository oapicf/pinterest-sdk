package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for customer_lists_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CustomerListsList200Response(
  items: List[CustomerList],
  bookmark: Option[String]
)

object CustomerListsList200Response {
  implicit lazy val customerListsList200ResponseJsonFormat: Format[CustomerListsList200Response] = Json.format[CustomerListsList200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for customer_lists_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CustomerListsList200Response(
  items: List[CustomerList],
  bookmark: Option[String]
)

object CustomerListsList200Response {
  implicit lazy val customerListsList200ResponseJsonFormat: Format[CustomerListsList200Response] = Json.format[CustomerListsList200Response]
}


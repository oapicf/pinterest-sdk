package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for customer_lists_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerListsList200Response(
  bookmark: Option[String],
  items: List[CustomerList]
)

object CustomerListsList200Response {
  implicit lazy val customerListsList200ResponseJsonFormat: Format[CustomerListsList200Response] = Json.format[CustomerListsList200Response]
}


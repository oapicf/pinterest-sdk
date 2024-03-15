package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ads_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsList200Response(
  items: List[AdResponse],
  bookmark: Option[String]
)

object AdsList200Response {
  implicit lazy val adsList200ResponseJsonFormat: Format[AdsList200Response] = Json.format[AdsList200Response]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ads_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdsList200Response(
  items: List[AdResponse],
  bookmark: Option[String]
)

object AdsList200Response {
  implicit lazy val adsList200ResponseJsonFormat: Format[AdsList200Response] = Json.format[AdsList200Response]
}


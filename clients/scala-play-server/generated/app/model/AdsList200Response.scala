package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ads_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdsList200Response(
  bookmark: Option[String],
  items: List[Ad]
)

object AdsList200Response {
  implicit lazy val adsList200ResponseJsonFormat: Format[AdsList200Response] = Json.format[AdsList200Response]
}


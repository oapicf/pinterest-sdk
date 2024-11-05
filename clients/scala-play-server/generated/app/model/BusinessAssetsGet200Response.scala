package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_assets_get_200_response.
  * @param items List of assets the requesting business has access to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessAssetsGet200Response(
  items: List[GetBusinessAssetsResponse],
  bookmark: Option[String]
)

object BusinessAssetsGet200Response {
  implicit lazy val businessAssetsGet200ResponseJsonFormat: Format[BusinessAssetsGet200Response] = Json.format[BusinessAssetsGet200Response]
}


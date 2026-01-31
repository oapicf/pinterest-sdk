package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_assets_get_200_response.
  * @param items List of assets the requesting business has access to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessAssetsGet200Response(
  bookmark: Option[String],
  items: List[GetBusinessAssetsResponse]
)

object BusinessAssetsGet200Response {
  implicit lazy val businessAssetsGet200ResponseJsonFormat: Format[BusinessAssetsGet200Response] = Json.format[BusinessAssetsGet200Response]
}


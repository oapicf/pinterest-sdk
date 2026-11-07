package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_assets_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessAssetsGet200Response(
  bookmark: Option[String],
  items: List[BusinessAssets]
)

object BusinessAssetsGet200Response {
  implicit lazy val businessAssetsGet200ResponseJsonFormat: Format[BusinessAssetsGet200Response] = Json.format[BusinessAssetsGet200Response]
}


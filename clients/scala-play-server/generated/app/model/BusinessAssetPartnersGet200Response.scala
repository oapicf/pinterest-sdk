package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_asset_partners_get_200_response.
  * @param items List of partners with permissions to the asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessAssetPartnersGet200Response(
  items: List[UserSingleAssetBinding],
  bookmark: Option[String]
)

object BusinessAssetPartnersGet200Response {
  implicit lazy val businessAssetPartnersGet200ResponseJsonFormat: Format[BusinessAssetPartnersGet200Response] = Json.format[BusinessAssetPartnersGet200Response]
}


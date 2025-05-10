package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_partner_asset_access_get_200_response.
  * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BusinessPartnerAssetAccessGet200Response(
  items: List[GetPartnerAssetsResponse],
  bookmark: Option[String]
)

object BusinessPartnerAssetAccessGet200Response {
  implicit lazy val businessPartnerAssetAccessGet200ResponseJsonFormat: Format[BusinessPartnerAssetAccessGet200Response] = Json.format[BusinessPartnerAssetAccessGet200Response]
}


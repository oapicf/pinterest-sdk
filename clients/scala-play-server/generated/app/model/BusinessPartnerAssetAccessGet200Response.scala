package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_partner_asset_access_get_200_response.
  * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessPartnerAssetAccessGet200Response(
  items: List[GetPartnerAssetsResponse],
  bookmark: Option[String]
)

object BusinessPartnerAssetAccessGet200Response {
  implicit lazy val businessPartnerAssetAccessGet200ResponseJsonFormat: Format[BusinessPartnerAssetAccessGet200Response] = Json.format[BusinessPartnerAssetAccessGet200Response]
}


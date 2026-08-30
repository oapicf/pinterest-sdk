package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_partner_asset_access_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BusinessPartnerAssetAccessGet200Response(
  bookmark: Option[String],
  items: List[BaseBusinessAssets]
)

object BusinessPartnerAssetAccessGet200Response {
  implicit lazy val businessPartnerAssetAccessGet200ResponseJsonFormat: Format[BusinessPartnerAssetAccessGet200Response] = Json.format[BusinessPartnerAssetAccessGet200Response]
}


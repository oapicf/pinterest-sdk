package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_asset_members_get_200_response.
  * @param items List of members with permissions to the asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BusinessAssetMembersGet200Response(
  items: List[UserSingleAssetBinding],
  bookmark: Option[String]
)

object BusinessAssetMembersGet200Response {
  implicit lazy val businessAssetMembersGet200ResponseJsonFormat: Format[BusinessAssetMembersGet200Response] = Json.format[BusinessAssetMembersGet200Response]
}


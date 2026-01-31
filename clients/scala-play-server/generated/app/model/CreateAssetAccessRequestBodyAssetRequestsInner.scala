package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestBody_asset_requests_inner.
  * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  * @param partnerId Unique identifier of a business partner to request asset access to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssetAccessRequestBodyAssetRequestsInner(
  assetIdToPermissions: Map[String, List[Permissions]],
  partnerId: String
)

object CreateAssetAccessRequestBodyAssetRequestsInner {
  implicit lazy val createAssetAccessRequestBodyAssetRequestsInnerJsonFormat: Format[CreateAssetAccessRequestBodyAssetRequestsInner] = Json.format[CreateAssetAccessRequestBodyAssetRequestsInner]
}


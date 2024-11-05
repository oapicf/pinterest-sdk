package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestBody_asset_requests_inner.
  * @param partnerId Unique identifier of a business partner to request asset access to.
  * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetAccessRequestBodyAssetRequestsInner(
  partnerId: String,
  assetIdToPermissions: Map[String, List[Permissions]],
)

object CreateAssetAccessRequestBodyAssetRequestsInner {
  implicit lazy val createAssetAccessRequestBodyAssetRequestsInnerJsonFormat: Format[CreateAssetAccessRequestBodyAssetRequestsInner] = Json.format[CreateAssetAccessRequestBodyAssetRequestsInner]
}


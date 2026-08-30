package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetAccessRequestItem.
  * @param assetIdToPermissions An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.
  * @param partnerId Unique identifier of a business partner to request asset access to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateAssetAccessRequestItem(
  assetIdToPermissions: Map[String, List[Permissions]],
  partnerId: String
)

object CreateAssetAccessRequestItem {
  implicit lazy val createAssetAccessRequestItemJsonFormat: Format[CreateAssetAccessRequestItem] = Json.format[CreateAssetAccessRequestItem]
}


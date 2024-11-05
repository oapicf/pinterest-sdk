package model

import play.api.libs.json._

/**
  * An object containing a list of all the asset access requests
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetAccessRequestBody(
  assetRequests: List[CreateAssetAccessRequestBodyAssetRequestsInner]
)

object CreateAssetAccessRequestBody {
  implicit lazy val createAssetAccessRequestBodyJsonFormat: Format[CreateAssetAccessRequestBody] = Json.format[CreateAssetAccessRequestBody]
}


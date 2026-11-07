package model

import play.api.libs.json._

/**
  * An object containing a list of all the asset access requests
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreateAssetAccessRequestBody(
  assetRequests: List[CreateAssetAccessRequestItem]
)

object CreateAssetAccessRequestBody {
  implicit lazy val createAssetAccessRequestBodyJsonFormat: Format[CreateAssetAccessRequestBody] = Json.format[CreateAssetAccessRequestBody]
}


package model

import play.api.libs.json._

/**
  * An object containing a list of all the asset access requests
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssetAccessRequestBody(
  assetRequests: List[CreateAssetAccessRequestBodyAssetRequestsInner]
)

object CreateAssetAccessRequestBody {
  implicit lazy val createAssetAccessRequestBodyJsonFormat: Format[CreateAssetAccessRequestBody] = Json.format[CreateAssetAccessRequestBody]
}


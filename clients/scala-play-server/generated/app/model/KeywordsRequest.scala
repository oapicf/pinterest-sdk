package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for KeywordsRequest.
  * @param keywords Keyword JSON array. Each array element has 3 fields
  * @param parentId Keyword parent entity ID (advertiser, campaign, ad group).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class KeywordsRequest(
  keywords: List[KeywordsCommon],
  parentId: String
)

object KeywordsRequest {
  implicit lazy val keywordsRequestJsonFormat: Format[KeywordsRequest] = Json.format[KeywordsRequest]
}


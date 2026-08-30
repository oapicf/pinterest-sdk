package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateMemberAssetsResultsResponseArray.
  * @param items List of assigned/updated member asset access. If there is an error, an exception object will be returned. If the action was successfully completed, a response object will be returned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class UpdateMemberAssetsResultsResponseArray(
  items: Option[List[UpdateMemberAssetResultItem]]
)

object UpdateMemberAssetsResultsResponseArray {
  implicit lazy val updateMemberAssetsResultsResponseArrayJsonFormat: Format[UpdateMemberAssetsResultsResponseArray] = Json.format[UpdateMemberAssetsResultsResponseArray]
}


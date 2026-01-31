package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeletePartnerAssetsResultsResponseArray.
  * @param items List of terminated asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class DeletePartnerAssetsResultsResponseArray(
  items: Option[List[DeletePartnerAssetsResult]]
)

object DeletePartnerAssetsResultsResponseArray {
  implicit lazy val deletePartnerAssetsResultsResponseArrayJsonFormat: Format[DeletePartnerAssetsResultsResponseArray] = Json.format[DeletePartnerAssetsResultsResponseArray]
}


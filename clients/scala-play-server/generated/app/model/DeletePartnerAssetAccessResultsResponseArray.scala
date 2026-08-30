package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeletePartnerAssetAccessResultsResponseArray.
  * @param items List of terminated partner asset accesses.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class DeletePartnerAssetAccessResultsResponseArray(
  items: Option[List[DeletePartnerAssetAccessResult]]
)

object DeletePartnerAssetAccessResultsResponseArray {
  implicit lazy val deletePartnerAssetAccessResultsResponseArrayJsonFormat: Format[DeletePartnerAssetAccessResultsResponseArray] = Json.format[DeletePartnerAssetAccessResultsResponseArray]
}


package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerAssetsResultsResponseArray.
  * @param items List of assigned/updated partner asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdatePartnerAssetsResultsResponseArray(
  items: Option[List[UpdatePartnerAssetsResult]]
)

object UpdatePartnerAssetsResultsResponseArray {
  implicit lazy val updatePartnerAssetsResultsResponseArrayJsonFormat: Format[UpdatePartnerAssetsResultsResponseArray] = Json.format[UpdatePartnerAssetsResultsResponseArray]
}


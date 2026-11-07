package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdatePartnerAssetsResultsResponseArray.
  * @param items List of assigned/updated partner asset access.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class UpdatePartnerAssetsResultsResponseArray(
  items: Option[List[UpdatePartnerAssetsResult]]
)

object UpdatePartnerAssetsResultsResponseArray {
  implicit lazy val updatePartnerAssetsResultsResponseArrayJsonFormat: Format[UpdatePartnerAssetsResultsResponseArray] = Json.format[UpdatePartnerAssetsResultsResponseArray]
}


package model

import play.api.libs.json._

/**
  * Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] in BETA. For update, only draft campaigns may update objective type.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ObjectiveType(
)

object ObjectiveType {
  implicit lazy val objectiveTypeJsonFormat: Format[ObjectiveType] = Json.format[ObjectiveType]
}


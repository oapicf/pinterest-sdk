package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpec_SHOPPING_RETARGETING.
  * @param lookbackWindow Number of days ago to start lookback timeframe for dynamic retargeting
  * @param tagTypes Event types to target for dynamic retargeting
  * @param exclusionWindow Number of days ago to stop lookback timeframe for dynamic retargeting
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TargetingSpecSHOPPINGRETARGETING(
  lookbackWindow: Option[Int],
  tagTypes: Option[List[Int]],
  exclusionWindow: Option[Int]
)

object TargetingSpecSHOPPINGRETARGETING {
  implicit lazy val targetingSpecSHOPPINGRETARGETINGJsonFormat: Format[TargetingSpecSHOPPINGRETARGETING] = Json.format[TargetingSpecSHOPPINGRETARGETING]
}


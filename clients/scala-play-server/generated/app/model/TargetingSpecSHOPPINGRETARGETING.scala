package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingSpecShoppingRetargeting.
  * @param exclusionWindow Number of days ago to stop lookback timeframe for dynamic retargeting
  * @param lookbackWindow Number of days ago to start lookback timeframe for dynamic retargeting
  * @param tagTypes Event types to target for dynamic retargeting
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingSpecShoppingRetargeting(
  exclusionWindow: Option[Int],
  lookbackWindow: Option[Int],
  tagTypes: Option[List[Int]]
)

object TargetingSpecShoppingRetargeting {
  implicit lazy val targetingSpecShoppingRetargetingJsonFormat: Format[TargetingSpecShoppingRetargeting] = Json.format[TargetingSpecShoppingRetargeting]
}


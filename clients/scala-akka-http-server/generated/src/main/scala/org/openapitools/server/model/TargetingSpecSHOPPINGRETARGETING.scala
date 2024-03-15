package org.openapitools.server.model


/**
 * = TargetingSpec_SHOPPING_RETARGETING =
 *
 * @param lookbackWindow Number of days ago to start lookback timeframe for dynamic retargeting for example: ''30''
 * @param tagTypes Event types to target for dynamic retargeting for example: ''[0,6]''
 * @param exclusionWindow Number of days ago to stop lookback timeframe for dynamic retargeting for example: ''14''
*/
final case class TargetingSpecSHOPPINGRETARGETING (
  lookbackWindow: Option[Int] = None,
  tagTypes: Option[Seq[Int]] = None,
  exclusionWindow: Option[Int] = None
)


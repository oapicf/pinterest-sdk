package org.openapitools.server.model


/**
 * @param exclusionWindow Number of days ago to stop lookback timeframe for dynamic retargeting for example: ''14''
 * @param lookbackWindow Number of days ago to start lookback timeframe for dynamic retargeting for example: ''30''
 * @param tagTypes Event types to target for dynamic retargeting for example: ''[0,6]''
*/
final case class TargetingSpecShoppingRetargeting (
  exclusionWindow: Option[Int] = None,
  lookbackWindow: Option[Int] = None,
  tagTypes: Option[Seq[Int]] = None
)


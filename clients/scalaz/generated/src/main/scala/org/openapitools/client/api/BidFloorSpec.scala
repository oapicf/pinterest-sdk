package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidFloorSpec._

case class BidFloorSpec (
  /* Ad group billable event type. */
  billableEvent: ActionType,
/* List of ISO 3166-1 alpha-2 country codes. */
  countries: Option[List[Country]],
/* Creative type for the bid floor request. */
  creativeType: Option[CreativeType],
/* Currency for the bid floor value. */
  currency: Currency,
/* Campaign objective type. */
  objectiveType: Option[BidFloorObjectiveType],
/* Optimization goal metadata. */
  optimizationGoalMetadata: Option[OptimizationGoalMetadata])

object BidFloorSpec {
  import DateTimeCodecs._

  implicit val BidFloorSpecCodecJson: CodecJson[BidFloorSpec] = CodecJson.derive[BidFloorSpec]
  implicit val BidFloorSpecDecoder: EntityDecoder[BidFloorSpec] = jsonOf[BidFloorSpec]
  implicit val BidFloorSpecEncoder: EntityEncoder[BidFloorSpec] = jsonEncoderOf[BidFloorSpec]
}

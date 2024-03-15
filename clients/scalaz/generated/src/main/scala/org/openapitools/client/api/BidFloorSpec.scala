package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BidFloorSpec._

case class BidFloorSpec (
  countries: Option[List[Country]],
currency: Currency,
objectiveType: Option[ObjectiveType],
billableEvent: ActionType,
optimizationGoalMetadata: Option[OptimizationGoalMetadata],
creativeType: Option[CreativeType])

object BidFloorSpec {
  import DateTimeCodecs._

  implicit val BidFloorSpecCodecJson: CodecJson[BidFloorSpec] = CodecJson.derive[BidFloorSpec]
  implicit val BidFloorSpecDecoder: EntityDecoder[BidFloorSpec] = jsonOf[BidFloorSpec]
  implicit val BidFloorSpecEncoder: EntityEncoder[BidFloorSpec] = jsonEncoderOf[BidFloorSpec]
}

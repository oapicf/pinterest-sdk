package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import TrendsAgeDistribution._

case class TrendsAgeDistribution (
  ageDistribution: Option[TrendsAgeBucket])

object TrendsAgeDistribution {
  import DateTimeCodecs._

  implicit val TrendsAgeDistributionCodecJson: CodecJson[TrendsAgeDistribution] = CodecJson.derive[TrendsAgeDistribution]
  implicit val TrendsAgeDistributionDecoder: EntityDecoder[TrendsAgeDistribution] = jsonOf[TrendsAgeDistribution]
  implicit val TrendsAgeDistributionEncoder: EntityEncoder[TrendsAgeDistribution] = jsonEncoderOf[TrendsAgeDistribution]
}

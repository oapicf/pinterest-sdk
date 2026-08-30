package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import TrendsGenderDistribution._

case class TrendsGenderDistribution (
  genderDistribution: Option[TrendsGender])

object TrendsGenderDistribution {
  import DateTimeCodecs._

  implicit val TrendsGenderDistributionCodecJson: CodecJson[TrendsGenderDistribution] = CodecJson.derive[TrendsGenderDistribution]
  implicit val TrendsGenderDistributionDecoder: EntityDecoder[TrendsGenderDistribution] = jsonOf[TrendsGenderDistribution]
  implicit val TrendsGenderDistributionEncoder: EntityEncoder[TrendsGenderDistribution] = jsonEncoderOf[TrendsGenderDistribution]
}

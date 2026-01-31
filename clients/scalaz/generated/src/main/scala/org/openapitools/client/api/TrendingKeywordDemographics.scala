package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendingKeywordDemographics._

case class TrendingKeywordDemographics (
  ageDistribution: Option[TrendingKeywordDemographicsAgeDistribution],
genderDistribution: Option[TrendingKeywordDemographicsGenderDistribution])

object TrendingKeywordDemographics {
  import DateTimeCodecs._

  implicit val TrendingKeywordDemographicsCodecJson: CodecJson[TrendingKeywordDemographics] = CodecJson.derive[TrendingKeywordDemographics]
  implicit val TrendingKeywordDemographicsDecoder: EntityDecoder[TrendingKeywordDemographics] = jsonOf[TrendingKeywordDemographics]
  implicit val TrendingKeywordDemographicsEncoder: EntityEncoder[TrendingKeywordDemographics] = jsonEncoderOf[TrendingKeywordDemographics]
}

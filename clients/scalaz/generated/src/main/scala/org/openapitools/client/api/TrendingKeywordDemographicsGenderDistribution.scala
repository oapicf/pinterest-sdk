package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import TrendingKeywordDemographicsGenderDistribution._

case class TrendingKeywordDemographicsGenderDistribution (
  genderDistribution: Option[GenderDistribution])

object TrendingKeywordDemographicsGenderDistribution {
  import DateTimeCodecs._
  sealed trait GenderDistribution
  case object Male extends GenderDistribution
  case object Female extends GenderDistribution
  case object Unspecified extends GenderDistribution

  object GenderDistribution {
    def toGenderDistribution(s: String): Option[GenderDistribution] = s match {
      case "Male" => Some(Male)
      case "Female" => Some(Female)
      case "Unspecified" => Some(Unspecified)
      case _ => None
    }

    def fromGenderDistribution(x: GenderDistribution): String = x match {
      case Male => "Male"
      case Female => "Female"
      case Unspecified => "Unspecified"
    }
  }

  implicit val GenderDistributionEnumEncoder: EncodeJson[GenderDistribution] =
    EncodeJson[GenderDistribution](is => StringEncodeJson(GenderDistribution.fromGenderDistribution(is)))

  implicit val GenderDistributionEnumDecoder: DecodeJson[GenderDistribution] =
    DecodeJson.optionDecoder[GenderDistribution](n => n.string.flatMap(jStr => GenderDistribution.toGenderDistribution(jStr)), "GenderDistribution failed to de-serialize")

  implicit val TrendingKeywordDemographicsGenderDistributionCodecJson: CodecJson[TrendingKeywordDemographicsGenderDistribution] = CodecJson.derive[TrendingKeywordDemographicsGenderDistribution]
  implicit val TrendingKeywordDemographicsGenderDistributionDecoder: EntityDecoder[TrendingKeywordDemographicsGenderDistribution] = jsonOf[TrendingKeywordDemographicsGenderDistribution]
  implicit val TrendingKeywordDemographicsGenderDistributionEncoder: EntityEncoder[TrendingKeywordDemographicsGenderDistribution] = jsonEncoderOf[TrendingKeywordDemographicsGenderDistribution]
}

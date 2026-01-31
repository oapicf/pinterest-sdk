package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import TrendingKeywordDemographicsAgeDistribution._

case class TrendingKeywordDemographicsAgeDistribution (
  ageDistribution: Option[AgeDistribution])

object TrendingKeywordDemographicsAgeDistribution {
  import DateTimeCodecs._
  sealed trait AgeDistribution
  case object `1824` extends AgeDistribution
  case object `2534` extends AgeDistribution
  case object `3544` extends AgeDistribution
  case object `4549` extends AgeDistribution
  case object `5054` extends AgeDistribution
  case object `5564` extends AgeDistribution
  case object `65` extends AgeDistribution

  object AgeDistribution {
    def toAgeDistribution(s: String): Option[AgeDistribution] = s match {
      case "`1824`" => Some(`1824`)
      case "`2534`" => Some(`2534`)
      case "`3544`" => Some(`3544`)
      case "`4549`" => Some(`4549`)
      case "`5054`" => Some(`5054`)
      case "`5564`" => Some(`5564`)
      case "`65`" => Some(`65`)
      case _ => None
    }

    def fromAgeDistribution(x: AgeDistribution): String = x match {
      case `1824` => "`1824`"
      case `2534` => "`2534`"
      case `3544` => "`3544`"
      case `4549` => "`4549`"
      case `5054` => "`5054`"
      case `5564` => "`5564`"
      case `65` => "`65`"
    }
  }

  implicit val AgeDistributionEnumEncoder: EncodeJson[AgeDistribution] =
    EncodeJson[AgeDistribution](is => StringEncodeJson(AgeDistribution.fromAgeDistribution(is)))

  implicit val AgeDistributionEnumDecoder: DecodeJson[AgeDistribution] =
    DecodeJson.optionDecoder[AgeDistribution](n => n.string.flatMap(jStr => AgeDistribution.toAgeDistribution(jStr)), "AgeDistribution failed to de-serialize")

  implicit val TrendingKeywordDemographicsAgeDistributionCodecJson: CodecJson[TrendingKeywordDemographicsAgeDistribution] = CodecJson.derive[TrendingKeywordDemographicsAgeDistribution]
  implicit val TrendingKeywordDemographicsAgeDistributionDecoder: EntityDecoder[TrendingKeywordDemographicsAgeDistribution] = jsonOf[TrendingKeywordDemographicsAgeDistribution]
  implicit val TrendingKeywordDemographicsAgeDistributionEncoder: EntityEncoder[TrendingKeywordDemographicsAgeDistribution] = jsonEncoderOf[TrendingKeywordDemographicsAgeDistribution]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenderDemographics._

case class GenderDemographics (
  /* Percentage of female users */
  female: BigDecimal,
/* Percentage of male users */
  male: BigDecimal,
/* Percentage of users with unspecified gender */
  unspecified: BigDecimal)

object GenderDemographics {
  import DateTimeCodecs._

  implicit val GenderDemographicsCodecJson: CodecJson[GenderDemographics] = CodecJson.derive[GenderDemographics]
  implicit val GenderDemographicsDecoder: EntityDecoder[GenderDemographics] = jsonOf[GenderDemographics]
  implicit val GenderDemographicsEncoder: EntityEncoder[GenderDemographics] = jsonEncoderOf[GenderDemographics]
}

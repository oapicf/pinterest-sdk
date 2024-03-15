package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDemographics._

case class AudienceDemographics (
  /* Ages distribution. */
  ages: Option[List[AudienceDemographicValue]],
/* Gender distribution. */
  genders: Option[List[AudienceDemographicValue]],
/* Device usage distribution. */
  devices: Option[List[AudienceDemographicValue]],
/* Geographic metro area distribution. */
  metros: Option[List[AudienceDemographicValue]],
/* Country area distribution. */
  countries: Option[List[AudienceDemographicValue]])

object AudienceDemographics {
  import DateTimeCodecs._

  implicit val AudienceDemographicsCodecJson: CodecJson[AudienceDemographics] = CodecJson.derive[AudienceDemographics]
  implicit val AudienceDemographicsDecoder: EntityDecoder[AudienceDemographics] = jsonOf[AudienceDemographics]
  implicit val AudienceDemographicsEncoder: EntityEncoder[AudienceDemographics] = jsonEncoderOf[AudienceDemographics]
}

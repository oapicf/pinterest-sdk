package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDemographicValue._

case class AudienceDemographicValue (
  /* Unique key for demographic item */
  key: Option[String],
/* Display name for demographic */
  name: Option[String],
/* Value of demographic item as a percent of total audience */
  ratio: Option[BigDecimal])

object AudienceDemographicValue {
  import DateTimeCodecs._

  implicit val AudienceDemographicValueCodecJson: CodecJson[AudienceDemographicValue] = CodecJson.derive[AudienceDemographicValue]
  implicit val AudienceDemographicValueDecoder: EntityDecoder[AudienceDemographicValue] = jsonOf[AudienceDemographicValue]
  implicit val AudienceDemographicValueEncoder: EntityEncoder[AudienceDemographicValue] = jsonEncoderOf[AudienceDemographicValue]
}

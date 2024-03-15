package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingAdvertiserCountry._

case class TargetingAdvertiserCountry (
  
object TargetingAdvertiserCountry {
  import DateTimeCodecs._

  implicit val TargetingAdvertiserCountryCodecJson: CodecJson[TargetingAdvertiserCountry] = CodecJson.derive[TargetingAdvertiserCountry]
  implicit val TargetingAdvertiserCountryDecoder: EntityDecoder[TargetingAdvertiserCountry] = jsonOf[TargetingAdvertiserCountry]
  implicit val TargetingAdvertiserCountryEncoder: EntityEncoder[TargetingAdvertiserCountry] = jsonEncoderOf[TargetingAdvertiserCountry]
}

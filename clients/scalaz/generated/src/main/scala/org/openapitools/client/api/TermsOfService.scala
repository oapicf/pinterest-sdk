package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TermsOfService._

case class TermsOfService (
  /* The ID of the terms of service */
  id: Option[String],
/* The terms of service content */
  html: Option[String],
/* Whether the ad account has accepted terms of service. */
  hasAccepted: Option[Boolean],
/* The ID of the ad account. */
  adAccountId: Option[String])

object TermsOfService {
  import DateTimeCodecs._

  implicit val TermsOfServiceCodecJson: CodecJson[TermsOfService] = CodecJson.derive[TermsOfService]
  implicit val TermsOfServiceDecoder: EntityDecoder[TermsOfService] = jsonOf[TermsOfService]
  implicit val TermsOfServiceEncoder: EntityEncoder[TermsOfService] = jsonEncoderOf[TermsOfService]
}

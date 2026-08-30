package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteBusinessPartners._

case class DeleteBusinessPartners (
  deletedPartners: Option[List[String]])

object DeleteBusinessPartners {
  import DateTimeCodecs._

  implicit val DeleteBusinessPartnersCodecJson: CodecJson[DeleteBusinessPartners] = CodecJson.derive[DeleteBusinessPartners]
  implicit val DeleteBusinessPartnersDecoder: EntityDecoder[DeleteBusinessPartners] = jsonOf[DeleteBusinessPartners]
  implicit val DeleteBusinessPartnersEncoder: EntityEncoder[DeleteBusinessPartners] = jsonEncoderOf[DeleteBusinessPartners]
}

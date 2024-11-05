package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnersRequest._

case class DeletePartnersRequest (
  partnerIds: List[String],
partnerType: Option[String])

object DeletePartnersRequest {
  import DateTimeCodecs._

  implicit val DeletePartnersRequestCodecJson: CodecJson[DeletePartnersRequest] = CodecJson.derive[DeletePartnersRequest]
  implicit val DeletePartnersRequestDecoder: EntityDecoder[DeletePartnersRequest] = jsonOf[DeletePartnersRequest]
  implicit val DeletePartnersRequestEncoder: EntityEncoder[DeletePartnersRequest] = jsonEncoderOf[DeletePartnersRequest]
}

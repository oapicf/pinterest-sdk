package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnersResponse._

case class DeletePartnersResponse (
  /* List of partners whose business partnership have been terminated. */
  deletedPartners: Option[List[String]])

object DeletePartnersResponse {
  import DateTimeCodecs._

  implicit val DeletePartnersResponseCodecJson: CodecJson[DeletePartnersResponse] = CodecJson.derive[DeletePartnersResponse]
  implicit val DeletePartnersResponseDecoder: EntityDecoder[DeletePartnersResponse] = jsonOf[DeletePartnersResponse]
  implicit val DeletePartnersResponseEncoder: EntityEncoder[DeletePartnersResponse] = jsonEncoderOf[DeletePartnersResponse]
}

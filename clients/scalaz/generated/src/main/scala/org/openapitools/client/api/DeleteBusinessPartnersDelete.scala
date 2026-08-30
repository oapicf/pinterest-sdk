package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteBusinessPartnersDelete._

case class DeleteBusinessPartnersDelete (
  /* A list of partner ids to be deleted */
  partnerIds: List[String],
partnerType: Option[NullablePartnerType])

object DeleteBusinessPartnersDelete {
  import DateTimeCodecs._

  implicit val DeleteBusinessPartnersDeleteCodecJson: CodecJson[DeleteBusinessPartnersDelete] = CodecJson.derive[DeleteBusinessPartnersDelete]
  implicit val DeleteBusinessPartnersDeleteDecoder: EntityDecoder[DeleteBusinessPartnersDelete] = jsonOf[DeleteBusinessPartnersDelete]
  implicit val DeleteBusinessPartnersDeleteEncoder: EntityEncoder[DeleteBusinessPartnersDelete] = jsonEncoderOf[DeleteBusinessPartnersDelete]
}

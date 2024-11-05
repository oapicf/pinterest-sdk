package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePartnerResultsResponseArrayItemsInner._

case class UpdatePartnerResultsResponseArrayItemsInner (
  exception: Option[BusinessAccessError],
memberOrPartnerId: Option[String])

object UpdatePartnerResultsResponseArrayItemsInner {
  import DateTimeCodecs._

  implicit val UpdatePartnerResultsResponseArrayItemsInnerCodecJson: CodecJson[UpdatePartnerResultsResponseArrayItemsInner] = CodecJson.derive[UpdatePartnerResultsResponseArrayItemsInner]
  implicit val UpdatePartnerResultsResponseArrayItemsInnerDecoder: EntityDecoder[UpdatePartnerResultsResponseArrayItemsInner] = jsonOf[UpdatePartnerResultsResponseArrayItemsInner]
  implicit val UpdatePartnerResultsResponseArrayItemsInnerEncoder: EntityEncoder[UpdatePartnerResultsResponseArrayItemsInner] = jsonEncoderOf[UpdatePartnerResultsResponseArrayItemsInner]
}

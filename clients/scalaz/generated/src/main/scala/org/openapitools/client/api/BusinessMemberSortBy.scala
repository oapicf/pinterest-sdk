package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMemberSortBy._

case class BusinessMemberSortBy (
  
object BusinessMemberSortBy {
  import DateTimeCodecs._

  implicit val BusinessMemberSortByCodecJson: CodecJson[BusinessMemberSortBy] = CodecJson.derive[BusinessMemberSortBy]
  implicit val BusinessMemberSortByDecoder: EntityDecoder[BusinessMemberSortBy] = jsonOf[BusinessMemberSortBy]
  implicit val BusinessMemberSortByEncoder: EntityEncoder[BusinessMemberSortBy] = jsonEncoderOf[BusinessMemberSortBy]
}

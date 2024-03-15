package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetAudiencesOrderBy._

case class GetAudiencesOrderBy (
  
object GetAudiencesOrderBy {
  import DateTimeCodecs._

  implicit val GetAudiencesOrderByCodecJson: CodecJson[GetAudiencesOrderBy] = CodecJson.derive[GetAudiencesOrderBy]
  implicit val GetAudiencesOrderByDecoder: EntityDecoder[GetAudiencesOrderBy] = jsonOf[GetAudiencesOrderBy]
  implicit val GetAudiencesOrderByEncoder: EntityEncoder[GetAudiencesOrderBy] = jsonEncoderOf[GetAudiencesOrderBy]
}

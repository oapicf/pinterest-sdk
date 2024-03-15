package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDefinitionResponse._

case class AudienceDefinitionResponse (
  items: Option[List[AudienceDefinition]])

object AudienceDefinitionResponse {
  import DateTimeCodecs._

  implicit val AudienceDefinitionResponseCodecJson: CodecJson[AudienceDefinitionResponse] = CodecJson.derive[AudienceDefinitionResponse]
  implicit val AudienceDefinitionResponseDecoder: EntityDecoder[AudienceDefinitionResponse] = jsonOf[AudienceDefinitionResponse]
  implicit val AudienceDefinitionResponseEncoder: EntityEncoder[AudienceDefinitionResponse] = jsonEncoderOf[AudienceDefinitionResponse]
}

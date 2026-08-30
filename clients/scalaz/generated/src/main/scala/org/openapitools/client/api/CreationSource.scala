package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreationSource._

case class CreationSource (
  
object CreationSource {
  import DateTimeCodecs._

  implicit val CreationSourceCodecJson: CodecJson[CreationSource] = CodecJson.derive[CreationSource]
  implicit val CreationSourceDecoder: EntityDecoder[CreationSource] = jsonOf[CreationSource]
  implicit val CreationSourceEncoder: EntityEncoder[CreationSource] = jsonEncoderOf[CreationSource]
}

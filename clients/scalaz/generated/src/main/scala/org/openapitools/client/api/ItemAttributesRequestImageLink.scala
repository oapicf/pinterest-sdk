package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemAttributesRequestImageLink._

case class ItemAttributesRequestImageLink (
  
object ItemAttributesRequestImageLink {
  import DateTimeCodecs._

  implicit val ItemAttributesRequestImageLinkCodecJson: CodecJson[ItemAttributesRequestImageLink] = CodecJson.derive[ItemAttributesRequestImageLink]
  implicit val ItemAttributesRequestImageLinkDecoder: EntityDecoder[ItemAttributesRequestImageLink] = jsonOf[ItemAttributesRequestImageLink]
  implicit val ItemAttributesRequestImageLinkEncoder: EntityEncoder[ItemAttributesRequestImageLink] = jsonEncoderOf[ItemAttributesRequestImageLink]
}

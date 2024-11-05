package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemAttributesRequestAllOfImageLink._

case class ItemAttributesRequestAllOfImageLink (
  
object ItemAttributesRequestAllOfImageLink {
  import DateTimeCodecs._

  implicit val ItemAttributesRequestAllOfImageLinkCodecJson: CodecJson[ItemAttributesRequestAllOfImageLink] = CodecJson.derive[ItemAttributesRequestAllOfImageLink]
  implicit val ItemAttributesRequestAllOfImageLinkDecoder: EntityDecoder[ItemAttributesRequestAllOfImageLink] = jsonOf[ItemAttributesRequestAllOfImageLink]
  implicit val ItemAttributesRequestAllOfImageLinkEncoder: EntityEncoder[ItemAttributesRequestAllOfImageLink] = jsonEncoderOf[ItemAttributesRequestAllOfImageLink]
}

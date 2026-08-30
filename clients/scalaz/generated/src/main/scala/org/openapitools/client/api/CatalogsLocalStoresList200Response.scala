package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsLocalStoresList200Response._

case class CatalogsLocalStoresList200Response (
  bookmark: Option[String],
items: List[LocalStore])

object CatalogsLocalStoresList200Response {
  import DateTimeCodecs._

  implicit val CatalogsLocalStoresList200ResponseCodecJson: CodecJson[CatalogsLocalStoresList200Response] = CodecJson.derive[CatalogsLocalStoresList200Response]
  implicit val CatalogsLocalStoresList200ResponseDecoder: EntityDecoder[CatalogsLocalStoresList200Response] = jsonOf[CatalogsLocalStoresList200Response]
  implicit val CatalogsLocalStoresList200ResponseEncoder: EntityEncoder[CatalogsLocalStoresList200Response] = jsonEncoderOf[CatalogsLocalStoresList200Response]
}

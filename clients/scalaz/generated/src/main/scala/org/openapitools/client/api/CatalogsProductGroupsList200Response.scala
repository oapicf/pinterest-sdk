package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupsList200Response._

case class CatalogsProductGroupsList200Response (
  items: List[CatalogsProductGroupsList200ResponseAllOfItemsInner],
bookmark: Option[String])

object CatalogsProductGroupsList200Response {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupsList200ResponseCodecJson: CodecJson[CatalogsProductGroupsList200Response] = CodecJson.derive[CatalogsProductGroupsList200Response]
  implicit val CatalogsProductGroupsList200ResponseDecoder: EntityDecoder[CatalogsProductGroupsList200Response] = jsonOf[CatalogsProductGroupsList200Response]
  implicit val CatalogsProductGroupsList200ResponseEncoder: EntityEncoder[CatalogsProductGroupsList200Response] = jsonEncoderOf[CatalogsProductGroupsList200Response]
}

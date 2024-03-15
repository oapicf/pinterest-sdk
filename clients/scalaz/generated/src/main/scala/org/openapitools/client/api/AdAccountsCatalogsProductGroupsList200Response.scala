package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountsCatalogsProductGroupsList200Response._

case class AdAccountsCatalogsProductGroupsList200Response (
  items: List[CatalogProductGroup],
bookmark: Option[String])

object AdAccountsCatalogsProductGroupsList200Response {
  import DateTimeCodecs._

  implicit val AdAccountsCatalogsProductGroupsList200ResponseCodecJson: CodecJson[AdAccountsCatalogsProductGroupsList200Response] = CodecJson.derive[AdAccountsCatalogsProductGroupsList200Response]
  implicit val AdAccountsCatalogsProductGroupsList200ResponseDecoder: EntityDecoder[AdAccountsCatalogsProductGroupsList200Response] = jsonOf[AdAccountsCatalogsProductGroupsList200Response]
  implicit val AdAccountsCatalogsProductGroupsList200ResponseEncoder: EntityEncoder[AdAccountsCatalogsProductGroupsList200Response] = jsonEncoderOf[AdAccountsCatalogsProductGroupsList200Response]
}

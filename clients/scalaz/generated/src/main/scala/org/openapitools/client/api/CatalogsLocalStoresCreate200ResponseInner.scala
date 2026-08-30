package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsLocalStoresCreate200ResponseInner._

case class CatalogsLocalStoresCreate200ResponseInner (
  data: CatalogsLocalStoresCreate200ResponseInnerData)

object CatalogsLocalStoresCreate200ResponseInner {
  import DateTimeCodecs._

  implicit val CatalogsLocalStoresCreate200ResponseInnerCodecJson: CodecJson[CatalogsLocalStoresCreate200ResponseInner] = CodecJson.derive[CatalogsLocalStoresCreate200ResponseInner]
  implicit val CatalogsLocalStoresCreate200ResponseInnerDecoder: EntityDecoder[CatalogsLocalStoresCreate200ResponseInner] = jsonOf[CatalogsLocalStoresCreate200ResponseInner]
  implicit val CatalogsLocalStoresCreate200ResponseInnerEncoder: EntityEncoder[CatalogsLocalStoresCreate200ResponseInner] = jsonEncoderOf[CatalogsLocalStoresCreate200ResponseInner]
}

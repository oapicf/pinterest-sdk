package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsLocalStoresDelete200ResponseInner._

case class CatalogsLocalStoresDelete200ResponseInner (
  /* The ID of the local store. */
  id: String,
status: CampaignAdPreviewDelete200ResponseInnerStatus)

object CatalogsLocalStoresDelete200ResponseInner {
  import DateTimeCodecs._

  implicit val CatalogsLocalStoresDelete200ResponseInnerCodecJson: CodecJson[CatalogsLocalStoresDelete200ResponseInner] = CodecJson.derive[CatalogsLocalStoresDelete200ResponseInner]
  implicit val CatalogsLocalStoresDelete200ResponseInnerDecoder: EntityDecoder[CatalogsLocalStoresDelete200ResponseInner] = jsonOf[CatalogsLocalStoresDelete200ResponseInner]
  implicit val CatalogsLocalStoresDelete200ResponseInnerEncoder: EntityEncoder[CatalogsLocalStoresDelete200ResponseInner] = jsonEncoderOf[CatalogsLocalStoresDelete200ResponseInner]
}

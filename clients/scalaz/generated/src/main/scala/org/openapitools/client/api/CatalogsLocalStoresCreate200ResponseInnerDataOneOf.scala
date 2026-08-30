package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsLocalStoresCreate200ResponseInnerDataOneOf._

case class CatalogsLocalStoresCreate200ResponseInnerDataOneOf (
  /* The ID of the local store. */
  id: String,
exceptions: Error)

object CatalogsLocalStoresCreate200ResponseInnerDataOneOf {
  import DateTimeCodecs._

  implicit val CatalogsLocalStoresCreate200ResponseInnerDataOneOfCodecJson: CodecJson[CatalogsLocalStoresCreate200ResponseInnerDataOneOf] = CodecJson.derive[CatalogsLocalStoresCreate200ResponseInnerDataOneOf]
  implicit val CatalogsLocalStoresCreate200ResponseInnerDataOneOfDecoder: EntityDecoder[CatalogsLocalStoresCreate200ResponseInnerDataOneOf] = jsonOf[CatalogsLocalStoresCreate200ResponseInnerDataOneOf]
  implicit val CatalogsLocalStoresCreate200ResponseInnerDataOneOfEncoder: EntityEncoder[CatalogsLocalStoresCreate200ResponseInnerDataOneOf] = jsonEncoderOf[CatalogsLocalStoresCreate200ResponseInnerDataOneOf]
}

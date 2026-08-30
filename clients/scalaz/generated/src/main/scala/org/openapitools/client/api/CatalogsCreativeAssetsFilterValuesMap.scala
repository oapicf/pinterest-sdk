package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsFilterValuesMap._

case class CatalogsCreativeAssetsFilterValuesMap (
  customLabel0: Option[List[String]],
customLabel1: Option[List[String]],
customLabel2: Option[List[String]],
customLabel3: Option[List[String]],
customLabel4: Option[List[String]],
googleProductCategory0: Option[List[String]],
googleProductCategory1: Option[List[String]],
googleProductCategory2: Option[List[String]],
googleProductCategory3: Option[List[String]],
googleProductCategory4: Option[List[String]],
googleProductCategory5: Option[List[String]],
googleProductCategory6: Option[List[String]],
mediaType: Option[List[MediaType]])

object CatalogsCreativeAssetsFilterValuesMap {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsFilterValuesMapCodecJson: CodecJson[CatalogsCreativeAssetsFilterValuesMap] = CodecJson.derive[CatalogsCreativeAssetsFilterValuesMap]
  implicit val CatalogsCreativeAssetsFilterValuesMapDecoder: EntityDecoder[CatalogsCreativeAssetsFilterValuesMap] = jsonOf[CatalogsCreativeAssetsFilterValuesMap]
  implicit val CatalogsCreativeAssetsFilterValuesMapEncoder: EntityEncoder[CatalogsCreativeAssetsFilterValuesMap] = jsonEncoderOf[CatalogsCreativeAssetsFilterValuesMap]
}

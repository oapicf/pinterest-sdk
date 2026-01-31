package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessAssetsResponseCatalogInfo._

case class GetBusinessAssetsResponseCatalogInfo (
  /* Catalog type */
  catalogType: Option[String],
/* Catalog ID. */
  id: Option[String],
/* Catalog name */
  name: Option[String])

object GetBusinessAssetsResponseCatalogInfo {
  import DateTimeCodecs._

  implicit val GetBusinessAssetsResponseCatalogInfoCodecJson: CodecJson[GetBusinessAssetsResponseCatalogInfo] = CodecJson.derive[GetBusinessAssetsResponseCatalogInfo]
  implicit val GetBusinessAssetsResponseCatalogInfoDecoder: EntityDecoder[GetBusinessAssetsResponseCatalogInfo] = jsonOf[GetBusinessAssetsResponseCatalogInfo]
  implicit val GetBusinessAssetsResponseCatalogInfoEncoder: EntityEncoder[GetBusinessAssetsResponseCatalogInfo] = jsonEncoderOf[GetBusinessAssetsResponseCatalogInfo]
}

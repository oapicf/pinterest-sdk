package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedCredentials._

case class CatalogsFeedCredentials (
  /* The required password for downloading a feed. */
  password: String,
/* The required username for downloading a feed. */
  username: String)

object CatalogsFeedCredentials {
  import DateTimeCodecs._

  implicit val CatalogsFeedCredentialsCodecJson: CodecJson[CatalogsFeedCredentials] = CodecJson.derive[CatalogsFeedCredentials]
  implicit val CatalogsFeedCredentialsDecoder: EntityDecoder[CatalogsFeedCredentials] = jsonOf[CatalogsFeedCredentials]
  implicit val CatalogsFeedCredentialsEncoder: EntityEncoder[CatalogsFeedCredentials] = jsonEncoderOf[CatalogsFeedCredentials]
}

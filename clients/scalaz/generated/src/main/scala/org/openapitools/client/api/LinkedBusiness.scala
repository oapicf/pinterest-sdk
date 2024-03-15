package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LinkedBusiness._

case class LinkedBusiness (
  /* Username */
  username: Option[String],
/* image_small_url */
  imageSmallUrl: Option[String],
/* image_medium_url */
  imageMediumUrl: Option[String],
/* image_large_url */
  imageLargeUrl: Option[String],
/* image_xlarge_url */
  imageXlargeUrl: Option[String])

object LinkedBusiness {
  import DateTimeCodecs._

  implicit val LinkedBusinessCodecJson: CodecJson[LinkedBusiness] = CodecJson.derive[LinkedBusiness]
  implicit val LinkedBusinessDecoder: EntityDecoder[LinkedBusiness] = jsonOf[LinkedBusiness]
  implicit val LinkedBusinessEncoder: EntityEncoder[LinkedBusiness] = jsonEncoderOf[LinkedBusiness]
}

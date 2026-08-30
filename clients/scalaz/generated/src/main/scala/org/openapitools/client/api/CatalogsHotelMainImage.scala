package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelMainImage._

case class CatalogsHotelMainImage (
  /* <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. */
  link: Option[String],
/* Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image */
  tag: Option[List[String]])

object CatalogsHotelMainImage {
  import DateTimeCodecs._

  implicit val CatalogsHotelMainImageCodecJson: CodecJson[CatalogsHotelMainImage] = CodecJson.derive[CatalogsHotelMainImage]
  implicit val CatalogsHotelMainImageDecoder: EntityDecoder[CatalogsHotelMainImage] = jsonOf[CatalogsHotelMainImage]
  implicit val CatalogsHotelMainImageEncoder: EntityEncoder[CatalogsHotelMainImage] = jsonEncoderOf[CatalogsHotelMainImage]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelAttributesAllOfMainImage._

case class CatalogsHotelAttributesAllOfMainImage (
  /* <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p> */
  link: Option[String],
/* Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image */
  tag: Option[List[String]])

object CatalogsHotelAttributesAllOfMainImage {
  import DateTimeCodecs._

  implicit val CatalogsHotelAttributesAllOfMainImageCodecJson: CodecJson[CatalogsHotelAttributesAllOfMainImage] = CodecJson.derive[CatalogsHotelAttributesAllOfMainImage]
  implicit val CatalogsHotelAttributesAllOfMainImageDecoder: EntityDecoder[CatalogsHotelAttributesAllOfMainImage] = jsonOf[CatalogsHotelAttributesAllOfMainImage]
  implicit val CatalogsHotelAttributesAllOfMainImageEncoder: EntityEncoder[CatalogsHotelAttributesAllOfMainImage] = jsonEncoderOf[CatalogsHotelAttributesAllOfMainImage]
}

package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsUpdatableCreativeAssetsAttributes._

case class CatalogsUpdatableCreativeAssetsAttributes (
  /* The name of the creative assets. */
  title: Option[String],
/* Brief description of the creative assets. */
  description: Option[String],
/* Link to the creative assets page. */
  link: Option[String],
/* IOS deep link to the creative assets page. */
  iosDeepLink: Option[String],
/* Link to the creative assets page. */
  androidDeepLink: Option[String],
/* The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted. */
  googleProductCategory: Option[String],
/* Custom grouping of creative assets. */
  customLabel0: Option[String],
/* Custom grouping of creative assets. */
  customLabel1: Option[String],
/* Custom grouping of creative assets. */
  customLabel2: Option[String],
/* Custom grouping of creative assets. */
  customLabel3: Option[String],
/* Custom grouping of creative assets. */
  customLabel4: Option[String],
/* Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’. */
  visibility: Option[String])

object CatalogsUpdatableCreativeAssetsAttributes {
  import DateTimeCodecs._

  implicit val CatalogsUpdatableCreativeAssetsAttributesCodecJson: CodecJson[CatalogsUpdatableCreativeAssetsAttributes] = CodecJson.derive[CatalogsUpdatableCreativeAssetsAttributes]
  implicit val CatalogsUpdatableCreativeAssetsAttributesDecoder: EntityDecoder[CatalogsUpdatableCreativeAssetsAttributes] = jsonOf[CatalogsUpdatableCreativeAssetsAttributes]
  implicit val CatalogsUpdatableCreativeAssetsAttributesEncoder: EntityEncoder[CatalogsUpdatableCreativeAssetsAttributes] = jsonEncoderOf[CatalogsUpdatableCreativeAssetsAttributes]
}

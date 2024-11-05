package model

import play.api.libs.json._

/**
  * Pin media source.
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  * @param coverImageUrl Cover image url.
  * @param coverImageContentType Content type for cover image Base64.
  * @param coverImageData Cover image Base64.
  * @param items Array with image objects.
  * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinMediaSource(
  sourceType: PinMediaSource.SourceType.Value,
  contentType: PinMediaSource.ContentType.Value,
  data: String,
  isStandard: Option[Boolean],
  url: String,
  coverImageUrl: Option[String],
  coverImageContentType: Option[PinMediaSource.CoverImageContentType.Value],
  coverImageData: Option[String],
  mediaId: String,
  items: List[PinMediaSourceImagesURLItemsInner],
  index: Option[Int],
  isAffiliateLink: Option[Boolean]
)

object PinMediaSource {
  implicit lazy val pinMediaSourceJsonFormat: Format[PinMediaSource] = Json.format[PinMediaSource]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val PinUrl = Value("pin_url")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ContentType extends Enumeration {
    val Jpeg = Value("image/jpeg")
    val Png = Value("image/png")

    type ContentType = Value
    implicit lazy val ContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object CoverImageContentType extends Enumeration {
    val Jpeg = Value("image/jpeg")
    val Png = Value("image/png")

    type CoverImageContentType = Value
    implicit lazy val CoverImageContentTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


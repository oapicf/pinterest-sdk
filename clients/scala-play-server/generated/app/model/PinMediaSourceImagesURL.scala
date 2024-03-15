package model

import play.api.libs.json._

/**
  * Multiple images urls-based media source
  * @param items Array with image objects.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaSourceImagesURL(
  sourceType: Option[PinMediaSourceImagesURL.SourceType.Value],
  items: List[PinMediaSourceImagesURLItemsInner],
  index: Option[Int]
)

object PinMediaSourceImagesURL {
  implicit lazy val pinMediaSourceImagesURLJsonFormat: Format[PinMediaSourceImagesURL] = Json.format[PinMediaSourceImagesURL]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val MultipleImageUrls = Value("multiple_image_urls")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


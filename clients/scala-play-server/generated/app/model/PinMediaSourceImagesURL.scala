package model

import play.api.libs.json._

/**
  * Multiple URL-based images media source
  * @param items Array with image objects.
  * @param sourceType The source type of the media.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinMediaSourceImagesURL(
  index: Option[Int],
  items: List[PinMediaSourceImagesURLItem],
  sourceType: PinMediaSourceImagesURL.SourceType.Value
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


package model

import play.api.libs.json._

/**
  * Image URL-based media source.
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  * @param sourceType The source type of the media.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PinMediaSourceImageURL(
  isStandard: Option[Boolean],
  sourceType: PinMediaSourceImageURL.SourceType.Value,
  url: String
)

object PinMediaSourceImageURL {
  implicit lazy val pinMediaSourceImageURLJsonFormat: Format[PinMediaSourceImageURL] = Json.format[PinMediaSourceImageURL]

  // noinspection TypeAnnotation
  object SourceType extends Enumeration {
    val ImageUrl = Value("image_url")

    type SourceType = Value
    implicit lazy val SourceTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


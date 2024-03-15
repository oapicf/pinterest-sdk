package model

import play.api.libs.json._

/**
  * Image URL-based media source
  * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinMediaSourceImageURL(
  sourceType: PinMediaSourceImageURL.SourceType.Value,
  url: String,
  isStandard: Option[Boolean]
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


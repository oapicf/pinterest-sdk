package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ImageMetadata.
  * @param itemType Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ImageMetadata(
  description: Option[String],
  images: Option[ImageSize],
  itemType: ImageMetadata.ItemType.Value,
  link: Option[String],
  title: Option[String]
)

object ImageMetadata {
  implicit lazy val imageMetadataJsonFormat: Format[ImageMetadata] = Json.format[ImageMetadata]

  // noinspection TypeAnnotation
  object ItemType extends Enumeration {
    val Image = Value("image")

    type ItemType = Value
    implicit lazy val ItemTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


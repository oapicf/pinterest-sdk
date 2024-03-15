package org.openapitools.server.model


/**
 * = Images =
 *
 * Pin with multiple images.
 *
 * @param mediaType  for example: ''null''
 * @param items  for example: ''null''
*/
final case class PinMediaWithImages (
  mediaType: Option[String] = None,
  items: Option[Seq[ImageMetadata]] = None
)


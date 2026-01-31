package org.openapitools.server.model


/**
 * = Object containing videos definitions. =
 *
 * Pin with multiple videos.
 *
 * @param items  for example: ''null''
 * @param mediaType  for example: ''null''
*/
final case class PinMediaWithVideos (
  items: Option[Seq[VideoMetadataWithItemType]] = None,
  mediaType: String
)


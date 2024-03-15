package org.openapitools.server.model


/**
 * = Videos =
 *
 * Pin with multiple videos.
 *
 * @param mediaType  for example: ''null''
 * @param items  for example: ''null''
*/
final case class PinMediaWithVideos (
  mediaType: Option[String] = None,
  items: Option[Seq[VideoMetadata]] = None
)


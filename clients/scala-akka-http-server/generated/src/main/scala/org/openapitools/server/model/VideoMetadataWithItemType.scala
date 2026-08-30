package org.openapitools.server.model


/**
 * = Video metadata with required itemType discriminator. =
 *
 * @param coverImageUrl  for example: ''null''
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time. for example: ''null''
 * @param height Height (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
 * @param itemType Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload. for example: ''null''
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param width Width (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
*/
final case class VideoMetadataWithItemType (
  coverImageUrl: Option[String] = None,
  duration: Option[Double] = None,
  height: Option[Int] = None,
  itemType: String,
  videoUrl: Option[String] = None,
  videoUrlHls: Option[String] = None,
  width: Option[Int] = None
)


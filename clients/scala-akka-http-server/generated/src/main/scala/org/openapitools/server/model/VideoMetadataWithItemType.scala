package org.openapitools.server.model


/**
 * = Video metadata with optional itemType information. =
 *
 * @param coverImageUrl  for example: ''null''
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time. for example: ''null''
 * @param height Height (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
 * @param itemType  for example: ''null''
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param width Width (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
*/
final case class VideoMetadataWithItemType (
  coverImageUrl: Option[String] = None,
  duration: Option[Double] = None,
  height: Option[Int] = None,
  itemType: Option[String] = None,
  videoUrl: Option[String] = None,
  width: Option[Int] = None
)


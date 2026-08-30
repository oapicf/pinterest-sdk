package org.openapitools.server.model


/**
 * = Object containing video definitions. =
 *
 * Pin with video.
 *
 * @param coverImageUrl  for example: ''null''
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time. for example: ''null''
 * @param height Height (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
 * @param images  for example: ''null''
 * @param mediaType  for example: ''null''
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param width Width (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
*/
final case class PinMediaWithVideo (
  coverImageUrl: Option[String] = None,
  duration: Option[Double] = None,
  height: Option[Int] = None,
  images: Option[ImageSize] = None,
  mediaType: String,
  videoUrl: Option[String] = None,
  videoUrlHls: Option[String] = None,
  width: Option[Int] = None
)


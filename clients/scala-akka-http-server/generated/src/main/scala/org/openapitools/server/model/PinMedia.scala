package org.openapitools.server.model


/**
 * = Pin media response object. =
 *
 * Pin media that can be an image, video, or a mix of both.
 *
 * @param images  for example: ''null''
 * @param mediaType  for example: ''null''
 * @param coverImageUrl  for example: ''null''
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time. for example: ''null''
 * @param height Height (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param width Width (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
 * @param items  for example: ''null''
*/
final case class PinMedia (
  images: Option[ImageSize] = None,
  mediaType: String,
  coverImageUrl: Option[String] = None,
  duration: Option[Double] = None,
  height: Option[Int] = None,
  videoUrl: Option[String] = None,
  width: Option[Int] = None,
  items: Option[Seq[PinMediaMetadata]] = None
)


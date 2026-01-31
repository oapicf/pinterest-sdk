package org.openapitools.server.model


/**
 * @param description  for example: ''null''
 * @param images  for example: ''null''
 * @param itemType  for example: ''null''
 * @param link  for example: ''null''
 * @param title  for example: ''null''
 * @param coverImageUrl  for example: ''null''
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time. for example: ''null''
 * @param height Height (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps. for example: ''null''
 * @param width Width (in pixels). Field maybe null after creation due to video processing time. for example: ''null''
*/
final case class PinMediaMetadata (
  description: Option[String] = None,
  images: Option[ImageSize] = None,
  itemType: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None,
  coverImageUrl: Option[String] = None,
  duration: Option[Double] = None,
  height: Option[Int] = None,
  videoUrl: Option[String] = None,
  width: Option[Int] = None
)


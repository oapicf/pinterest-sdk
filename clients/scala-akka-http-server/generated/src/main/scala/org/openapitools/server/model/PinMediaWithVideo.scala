package org.openapitools.server.model


/**
 * = video =
 *
 * Pin with video.
 *
 * @param mediaType  for example: ''null''
 * @param images  for example: ''null''
 * @param coverImageUrl  for example: ''null''
 * @param videoUrl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. for example: ''null''
 * @param duration Duration (in milliseconds) for example: ''null''
 * @param height Height (in pixels) for example: ''null''
 * @param width Width (in pixels) for example: ''null''
*/
final case class PinMediaWithVideo (
  mediaType: Option[String] = None,
  images: Option[PinMediaWithImageAllOfImages] = None,
  coverImageUrl: Option[String] = None,
  videoUrl: Option[String] = None,
  duration: Option[Double] = None,
  height: Option[Int] = None,
  width: Option[Int] = None
)


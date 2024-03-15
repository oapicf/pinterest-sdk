package org.openapitools.server.model


/**
 * = LinkedBusiness =
 *
 * @param username Username for example: ''username''
 * @param imageSmallUrl image_small_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param imageMediumUrl image_medium_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param imageLargeUrl image_large_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param imageXlargeUrl image_xlarge_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
*/
final case class LinkedBusiness (
  username: Option[String] = None,
  imageSmallUrl: Option[String] = None,
  imageMediumUrl: Option[String] = None,
  imageLargeUrl: Option[String] = None,
  imageXlargeUrl: Option[String] = None
)


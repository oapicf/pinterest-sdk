package org.openapitools.server.model


/**
 * @param imageLargeUrl image_large_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param imageMediumUrl image_medium_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param imageSmallUrl image_small_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param imageXlargeUrl image_xlarge_url for example: ''https://www.example.com/dj23454f53dfk2324.jpg''
 * @param username Username for example: ''username''
*/
final case class LinkedBusiness (
  imageLargeUrl: Option[String] = None,
  imageMediumUrl: Option[String] = None,
  imageSmallUrl: Option[String] = None,
  imageXlargeUrl: Option[String] = None,
  username: Option[String] = None
)


package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param about Brand Account about information for example: ''null''
 * @param country  for example: ''null''
 * @param name Brand Account name for example: ''null''
 * @param profileImage  for example: ''null''
 * @param username Brand Account username for example: ''null''
 * @param website Brand Account website for example: ''null''
*/
final case class BrandAccountUpdate (
  about: Option[String] = None,
  country: Option[Country] = None,
  name: Option[String] = None,
  profileImage: Option[BrandAccountProfileImageUpdate] = None,
  username: Option[String] = None,
  website: Option[String] = None
)


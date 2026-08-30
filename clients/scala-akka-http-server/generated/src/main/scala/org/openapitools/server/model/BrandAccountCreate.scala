package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param about Brand Account about information for example: ''null''
 * @param country  for example: ''null''
 * @param name Brand Account name for example: ''null''
 * @param profileImage  for example: ''null''
 * @param username Brand Account username for example: ''null''
 * @param website Brand Account website for example: ''null''
*/
final case class BrandAccountCreate (
  about: Option[String] = None,
  country: Country,
  name: String,
  profileImage: Option[BrandAccountProfileImage] = None,
  username: String,
  website: Option[String] = None
)


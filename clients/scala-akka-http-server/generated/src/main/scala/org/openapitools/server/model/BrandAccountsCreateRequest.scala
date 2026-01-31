package org.openapitools.server.model


/**
 * @param name Brand Account name for example: ''Canada Stores''
 * @param username Brand Account username for example: ''canada_stores''
 * @param country  for example: ''null''
 * @param about Brand Account about information for example: ''Stores in Canada''
 * @param website Brand Account website for example: ''https://www.example.com''
 * @param profileImage  for example: ''null''
*/
final case class BrandAccountsCreateRequest (
  name: String,
  username: String,
  country: Country,
  about: Option[String] = None,
  website: Option[String] = None,
  profileImage: Option[ImageBase64] = None
)


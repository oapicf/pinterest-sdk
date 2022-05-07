package org.openapitools.server.model


/**
 * @param accountType Type of account for example: ''null''
 * @param profileImage  for example: ''null''
 * @param websiteUrl  for example: ''null''
 * @param username  for example: ''null''
*/
final case class Account (
  accountType: Option[String],
  profileImage: Option[String],
  websiteUrl: Option[String],
  username: Option[String]
)


package org.openapitools.server.model


/**
 * = Board =
 *
 * Board
 *
 * @param id  for example: ''549755885175''
 * @param name  for example: ''Summer Recipes''
 * @param description  for example: ''My favorite summer recipes''
 * @param owner  for example: ''null''
 * @param privacy Privacy setting for a board. Learn more about <a href=\"https://help.pinterest.com/en/article/secret-boards\">secret boards</a> and <a href=\"https://help.pinterest.com/en/business/article/protected-boards\">protected boards</a> for example: ''null''
*/
final case class Board (
  id: Option[String],
  name: String,
  description: Option[String],
  owner: Option[BoardOwner],
  privacy: Option[String]
)


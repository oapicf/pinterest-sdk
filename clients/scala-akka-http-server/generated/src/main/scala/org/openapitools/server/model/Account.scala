package org.openapitools.server.model


/**
 * User account model containing properties related to a user's account.
 *
 * @param about Profile about description. for example: ''null''
 * @param accountType Type of account for example: ''null''
 * @param boardCount   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. for example: ''14''
 * @param businessName  for example: ''null''
 * @param followerCount User account follower count. for example: ''10''
 * @param followingCount User account following count. for example: ''347''
 * @param id User account ID. for example: ''2783136121146311751''
 * @param monthlyViews User account monthly views. for example: ''163''
 * @param pinCount User account pin count. This includes both created and saved pins. for example: ''339''
 * @param profileImage  for example: ''null''
 * @param username  for example: ''null''
 * @param websiteUrl  for example: ''null''
*/
final case class Account (
  about: Option[String] = None,
  accountType: Option[UserAccountType] = None,
  boardCount: Option[Int] = None,
  businessName: Option[String] = None,
  followerCount: Option[Int] = None,
  followingCount: Option[Int] = None,
  id: Option[String] = None,
  monthlyViews: Option[Int] = None,
  pinCount: Option[Int] = None,
  profileImage: Option[String] = None,
  username: Option[String] = None,
  websiteUrl: Option[String] = None
)


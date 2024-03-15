package org.openapitools.server.model


/**
 * @param accountType Type of account for example: ''null''
 * @param id User account ID. for example: ''2783136121146311751''
 * @param profileImage  for example: ''null''
 * @param websiteUrl  for example: ''null''
 * @param username  for example: ''null''
 * @param about Profile about description. for example: ''null''
 * @param businessName  for example: ''null''
 * @param boardCount User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. for example: ''14''
 * @param pinCount User account pin count. This includes both created and saved pins. for example: ''339''
 * @param followerCount User account follower count. for example: ''10''
 * @param followingCount User account following count. for example: ''347''
 * @param monthlyViews User account monthly views. for example: ''163''
*/
final case class Account (
  accountType: Option[String] = None,
  id: Option[String] = None,
  profileImage: Option[String] = None,
  websiteUrl: Option[String] = None,
  username: Option[String] = None,
  about: Option[String] = None,
  businessName: Option[String] = None,
  boardCount: Option[Int] = None,
  pinCount: Option[Int] = None,
  followerCount: Option[Int] = None,
  followingCount: Option[Int] = None,
  monthlyViews: Option[Int] = None
)


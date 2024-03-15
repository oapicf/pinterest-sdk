
package org.openapitools.client.model


case class Account (
    /* Type of account */
    _accountType: Option[String],
    /* User account ID. */
    _id: Option[String],
    _profileImage: Option[String],
    _websiteUrl: Option[String],
    _username: Option[String],
    /* Profile about description. */
    _about: Option[String],
    _businessName: Option[String],
    /* User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
    _boardCount: Option[Integer],
    /* User account pin count. This includes both created and saved pins. */
    _pinCount: Option[Integer],
    /* User account follower count. */
    _followerCount: Option[Integer],
    /* User account following count. */
    _followingCount: Option[Integer],
    /* User account monthly views. */
    _monthlyViews: Option[Integer]
)
object Account {
    def toStringBody(var_accountType: Object, var_id: Object, var_profileImage: Object, var_websiteUrl: Object, var_username: Object, var_about: Object, var_businessName: Object, var_boardCount: Object, var_pinCount: Object, var_followerCount: Object, var_followingCount: Object, var_monthlyViews: Object) =
        s"""
        | {
        | "accountType":$var_accountType,"id":$var_id,"profileImage":$var_profileImage,"websiteUrl":$var_websiteUrl,"username":$var_username,"about":$var_about,"businessName":$var_businessName,"boardCount":$var_boardCount,"pinCount":$var_pinCount,"followerCount":$var_followerCount,"followingCount":$var_followingCount,"monthlyViews":$var_monthlyViews
        | }
        """.stripMargin
}

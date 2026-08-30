
package org.openapitools.client.model


case class Account (
    /* Profile about description. */
    _about: Option[String],
    /* Type of account */
    _accountType: Option[UserAccountType],
    /*   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. */
    _boardCount: Option[Integer],
    _businessName: Option[String],
    /* User account follower count. */
    _followerCount: Option[Integer],
    /* User account following count. */
    _followingCount: Option[Integer],
    /* User account ID. */
    _id: Option[String],
    /* User account monthly views. */
    _monthlyViews: Option[Integer],
    /* User account pin count. This includes both created and saved pins. */
    _pinCount: Option[Integer],
    _profileImage: Option[String],
    _username: Option[String],
    _websiteUrl: Option[String]
)
object Account {
    def toStringBody(var_about: Object, var_accountType: Object, var_boardCount: Object, var_businessName: Object, var_followerCount: Object, var_followingCount: Object, var_id: Object, var_monthlyViews: Object, var_pinCount: Object, var_profileImage: Object, var_username: Object, var_websiteUrl: Object) =
        s"""
        | {
        | "about":$var_about,"accountType":$var_accountType,"boardCount":$var_boardCount,"businessName":$var_businessName,"followerCount":$var_followerCount,"followingCount":$var_followingCount,"id":$var_id,"monthlyViews":$var_monthlyViews,"pinCount":$var_pinCount,"profileImage":$var_profileImage,"username":$var_username,"websiteUrl":$var_websiteUrl
        | }
        """.stripMargin
}

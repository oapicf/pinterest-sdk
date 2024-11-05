package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Account.
  * @param accountType Type of account
  * @param id User account ID.
  * @param about Profile about description.
  * @param boardCount User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  * @param pinCount User account pin count. This includes both created and saved pins.
  * @param followerCount User account follower count.
  * @param followingCount User account following count.
  * @param monthlyViews User account monthly views.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class Account(
  accountType: Option[Account.AccountType.Value],
  id: Option[String],
  profileImage: Option[String],
  websiteUrl: Option[String],
  username: Option[String],
  about: Option[String],
  businessName: Option[String],
  boardCount: Option[Int],
  pinCount: Option[Int],
  followerCount: Option[Int],
  followingCount: Option[Int],
  monthlyViews: Option[Int]
)

object Account {
  implicit lazy val accountJsonFormat: Format[Account] = Json.format[Account]

  // noinspection TypeAnnotation
  object AccountType extends Enumeration {
    val PINNER = Value("PINNER")
    val BUSINESS = Value("BUSINESS")

    type AccountType = Value
    implicit lazy val AccountTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}


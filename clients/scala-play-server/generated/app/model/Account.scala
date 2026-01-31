package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Account.
  * @param about Profile about description.
  * @param accountType Type of account
  * @param boardCount User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  * @param followerCount User account follower count.
  * @param followingCount User account following count.
  * @param id User account ID.
  * @param monthlyViews User account monthly views.
  * @param pinCount User account pin count. This includes both created and saved pins.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Account(
  about: Option[String],
  accountType: Option[Account.AccountType.Value],
  boardCount: Option[Int],
  businessName: Option[String],
  followerCount: Option[Int],
  followingCount: Option[Int],
  id: Option[String],
  monthlyViews: Option[Int],
  pinCount: Option[Int],
  profileImage: Option[String],
  username: Option[String],
  websiteUrl: Option[String]
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


package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param about Profile about description.
 * @param accountUnderscoretype Type of account
 * @param boardUnderscorecount User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
 * @param businessUnderscorename 
 * @param followerUnderscorecount User account follower count.
 * @param followingUnderscorecount User account following count.
 * @param id User account ID.
 * @param monthlyUnderscoreviews User account monthly views.
 * @param pinUnderscorecount User account pin count. This includes both created and saved pins.
 * @param profileUnderscoreimage 
 * @param username 
 * @param websiteUnderscoreurl 
 */
case class Account(about: Option[String],
                accountUnderscoretype: Option[String],
                boardUnderscorecount: Option[Int],
                businessUnderscorename: Option[String],
                followerUnderscorecount: Option[Int],
                followingUnderscorecount: Option[Int],
                id: Option[String],
                monthlyUnderscoreviews: Option[Int],
                pinUnderscorecount: Option[Int],
                profileUnderscoreimage: Option[String],
                username: Option[String],
                websiteUnderscoreurl: Option[String]
                )

object Account {
    /**
     * Creates the codec for converting Account from and to JSON.
     */
    implicit val decoder: Decoder[Account] = deriveDecoder
    implicit val encoder: ObjectEncoder[Account] = deriveEncoder
}

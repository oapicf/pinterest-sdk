package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param accountUnderscoretype Type of account
 * @param id User account ID.
 * @param profileUnderscoreimage 
 * @param websiteUnderscoreurl 
 * @param username 
 * @param about Profile about description.
 * @param businessUnderscorename 
 * @param boardUnderscorecount User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
 * @param pinUnderscorecount User account pin count. This includes both created and saved pins.
 * @param followerUnderscorecount User account follower count.
 * @param followingUnderscorecount User account following count.
 * @param monthlyUnderscoreviews User account monthly views.
 */
case class Account(accountUnderscoretype: Option[String],
                id: Option[String],
                profileUnderscoreimage: Option[String],
                websiteUnderscoreurl: Option[String],
                username: Option[String],
                about: Option[String],
                businessUnderscorename: Option[String],
                boardUnderscorecount: Option[Int],
                pinUnderscorecount: Option[Int],
                followerUnderscorecount: Option[Int],
                followingUnderscorecount: Option[Int],
                monthlyUnderscoreviews: Option[Int]
                )

object Account {
    /**
     * Creates the codec for converting Account from and to JSON.
     */
    implicit val decoder: Decoder[Account] = deriveDecoder
    implicit val encoder: ObjectEncoder[Account] = deriveEncoder
}

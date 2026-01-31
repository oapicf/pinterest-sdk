package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param dnsUnderscoretxtUnderscorerecord DNS TXT record to check against for the website to be claimed
 * @param fileUnderscorecontent A full html file to upload to the website in order for it to be claimed
 * @param filename File expected to find on the website being claimed
 * @param metatag Metatag the verification process searchs for the website to be claimed
 * @param verificationUnderscorecode Code to check against the user claiming the website
 */
case class UserWebsiteVerificationCode(dnsUnderscoretxtUnderscorerecord: Option[String],
                fileUnderscorecontent: Option[String],
                filename: Option[String],
                metatag: Option[String],
                verificationUnderscorecode: Option[String]
                )

object UserWebsiteVerificationCode {
    /**
     * Creates the codec for converting UserWebsiteVerificationCode from and to JSON.
     */
    implicit val decoder: Decoder[UserWebsiteVerificationCode] = deriveDecoder
    implicit val encoder: ObjectEncoder[UserWebsiteVerificationCode] = deriveEncoder
}

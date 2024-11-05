package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * 
 * @param em Sha256 hashes of lowercase version of user's email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @param hashedUnderscoremaids Sha256 hashes of user's \"Google Advertising IDs\" (GAIDs) or \"Apple's Identifier for Advertisers\" (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format.
 * @param clientUnderscoreipUnderscoreaddress The user's IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
 * @param clientUnderscoreuserUnderscoreagent The user agent string of the user's web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA.
 */
case class ConversionEventsUserDataAnyOf1(em: Option[Seq[String]],
                hashedUnderscoremaids: Seq[String],
                clientUnderscoreipUnderscoreaddress: Option[String],
                clientUnderscoreuserUnderscoreagent: Option[String]
                )

object ConversionEventsUserDataAnyOf1 {
    /**
     * Creates the codec for converting ConversionEventsUserDataAnyOf1 from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsUserDataAnyOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsUserDataAnyOf1] = deriveEncoder
}

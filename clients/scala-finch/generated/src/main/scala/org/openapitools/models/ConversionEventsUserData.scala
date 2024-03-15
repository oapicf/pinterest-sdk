package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import scala.collection.immutable.Seq

/**
 * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
 * @param ph Sha256 hashes of user's phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
 * @param ge Sha256 hashes of user's gender, in lowercase. Either \"f\" or \"m\" or \"n\" for non-binary gender.
 * @param db Sha256 hashes of user's date of birthday, given as year, month, and day.
 * @param ln Sha256 hashes of user's last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
 * @param fn Sha256 hashes of user's first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
 * @param ct Sha256 hashes of user's city, in lowercase, and without spaces or punctuation. User residency city (mostly billing).
 * @param st Sha256 hashes of user's state, given as a two-letter code in lowercase. User residency state (mostly billing).
 * @param zp Sha256 hashes of user's zipcode, only digits. User residency zipcode (mostly billing).
 * @param country Sha256 hashes of two-character ISO-3166 country code indicating the user's country, in lowercase.
 * @param externalUnderscoreid Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA.
 * @param clickUnderscoreid The unique identifier stored in _epik cookie on your domain or &epik= query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA.
 * @param partnerUnderscoreid A unique identifier of visitors' information defined by third party partners. e.g RampID
 */
case class ConversionEventsUserData(ph: Option[Seq[String]],
                ge: Option[Seq[String]],
                db: Option[Seq[String]],
                ln: Option[Seq[String]],
                fn: Option[Seq[String]],
                ct: Option[Seq[String]],
                st: Option[Seq[String]],
                zp: Option[Seq[String]],
                country: Option[Seq[String]],
                externalUnderscoreid: Option[Seq[String]],
                clickUnderscoreid: Option[String],
                partnerUnderscoreid: Option[String]
                )

object ConversionEventsUserData {
    /**
     * Creates the codec for converting ConversionEventsUserData from and to JSON.
     */
    implicit val decoder: Decoder[ConversionEventsUserData] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionEventsUserData] = deriveEncoder
}

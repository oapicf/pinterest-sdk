package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Integration record
 * @param additionalUnderscoreidUnderscore1 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param connectedUnderscoreuserUnderscoreid 
 * @param createdUnderscoretime 
 * @param externalUnderscorebusinessUnderscoreid 
 * @param id 
 * @param partnerUnderscoreaccessUnderscoretoken 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscoremetadata 
 * @param partnerUnderscoreprimaryUnderscoreemail 
 * @param partnerUnderscorerefreshUnderscoretoken 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 * @param updatedUnderscoretime 
 */
case class IntegrationRecord(additionalUnderscoreidUnderscore1: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                connectedUnderscoreuserUnderscoreid: Option[String],
                createdUnderscoretime: Option[Int],
                externalUnderscorebusinessUnderscoreid: Option[String],
                id: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[Int],
                partnerUnderscoremetadata: Option[String],
                partnerUnderscoreprimaryUnderscoreemail: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[Int],
                scopes: Option[String],
                updatedUnderscoretime: Option[Int]
                )

object IntegrationRecord {
    /**
     * Creates the codec for converting IntegrationRecord from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationRecord] = deriveEncoder
}

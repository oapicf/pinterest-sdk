package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Integration record
 * @param id 
 * @param externalUnderscorebusinessUnderscoreid 
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoreuserUnderscoreid 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param partnerUnderscoreaccessUnderscoretoken 
 * @param partnerUnderscorerefreshUnderscoretoken 
 * @param partnerUnderscoreprimaryUnderscoreemail 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 * @param partnerUnderscoremetadata 
 * @param additionalUnderscoreidUnderscore1 
 * @param createdUnderscoretime 
 * @param updatedUnderscoretime 
 */
case class IntegrationRecord(id: Option[String],
                externalUnderscorebusinessUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoreuserUnderscoreid: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscoreprimaryUnderscoreemail: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[Int],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[Int],
                scopes: Option[String],
                partnerUnderscoremetadata: Option[String],
                additionalUnderscoreidUnderscore1: Option[String],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int]
                )

object IntegrationRecord {
    /**
     * Creates the codec for converting IntegrationRecord from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationRecord] = deriveEncoder
}

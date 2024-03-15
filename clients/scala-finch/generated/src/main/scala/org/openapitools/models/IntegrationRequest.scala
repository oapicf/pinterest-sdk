package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Schema used for creating the integration metadata.
 * @param externalUnderscorebusinessUnderscoreid External business ID for the integration.
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param partnerUnderscoreaccessUnderscoretoken 
 * @param partnerUnderscorerefreshUnderscoretoken 
 * @param partnerUnderscoreprimaryUnderscoreemail 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 * @param additionalUnderscoreidUnderscore1 
 * @param partnerUnderscoremetadata 
 */
case class IntegrationRequest(externalUnderscorebusinessUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscoreprimaryUnderscoreemail: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[Int],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[Int],
                scopes: Option[String],
                additionalUnderscoreidUnderscore1: Option[String],
                partnerUnderscoremetadata: Option[String]
                )

object IntegrationRequest {
    /**
     * Creates the codec for converting IntegrationRequest from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationRequest] = deriveEncoder
}

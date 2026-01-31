package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Schema used for creating the integration metadata.
 * @param additionalUnderscoreidUnderscore1 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param externalUnderscorebusinessUnderscoreid External business ID for the integration.
 * @param partnerUnderscoreaccessUnderscoretoken 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscoremetadata 
 * @param partnerUnderscoreprimaryUnderscoreemail 
 * @param partnerUnderscorerefreshUnderscoretoken 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 */
case class IntegrationRequest(additionalUnderscoreidUnderscore1: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                externalUnderscorebusinessUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[Int],
                partnerUnderscoremetadata: Option[String],
                partnerUnderscoreprimaryUnderscoreemail: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[Int],
                scopes: Option[String]
                )

object IntegrationRequest {
    /**
     * Creates the codec for converting IntegrationRequest from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationRequest] = deriveEncoder
}

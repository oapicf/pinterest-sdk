package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Schema used for updating the integration metadata.
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
case class IntegrationRequestPatch(connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscoreprimaryUnderscoreemail: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                scopes: Option[String],
                additionalUnderscoreidUnderscore1: Option[String],
                partnerUnderscoremetadata: Option[String]
                )

object IntegrationRequestPatch {
    /**
     * Creates the codec for converting IntegrationRequestPatch from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationRequestPatch] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationRequestPatch] = deriveEncoder
}

package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Schema used for updating the integration metadata.
 * @param additionalUnderscoreidUnderscore1 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param partnerUnderscoreaccessUnderscoretoken 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscoremetadata 
 * @param partnerUnderscoreprimaryUnderscoreemail 
 * @param partnerUnderscorerefreshUnderscoretoken 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 */
case class IntegrationRequestPatch(additionalUnderscoreidUnderscore1: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretoken: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                partnerUnderscoremetadata: Option[String],
                partnerUnderscoreprimaryUnderscoreemail: Option[String],
                partnerUnderscorerefreshUnderscoretoken: Option[String],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                scopes: Option[String]
                )

object IntegrationRequestPatch {
    /**
     * Creates the codec for converting IntegrationRequestPatch from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationRequestPatch] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationRequestPatch] = deriveEncoder
}

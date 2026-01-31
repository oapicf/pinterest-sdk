package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Integration metadata
 * @param additionalUnderscoreidUnderscore1 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param connectedUnderscoreuserUnderscoreid 
 * @param createdUnderscoretimestamp 
 * @param externalUnderscorebusinessUnderscoreid 
 * @param id 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscoremetadata 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 * @param updatedUnderscoretimestamp 
 */
case class IntegrationMetadata(additionalUnderscoreidUnderscore1: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                connectedUnderscoreuserUnderscoreid: Option[String],
                createdUnderscoretimestamp: Option[BigDecimal],
                externalUnderscorebusinessUnderscoreid: Option[String],
                id: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                partnerUnderscoremetadata: Option[String],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                scopes: Option[String],
                updatedUnderscoretimestamp: Option[BigDecimal]
                )

object IntegrationMetadata {
    /**
     * Creates the codec for converting IntegrationMetadata from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationMetadata] = deriveEncoder
}

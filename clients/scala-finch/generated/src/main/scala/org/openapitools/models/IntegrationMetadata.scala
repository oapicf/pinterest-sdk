package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Integration metadata
 * @param id 
 * @param externalUnderscorebusinessUnderscoreid 
 * @param connectedUnderscoremerchantUnderscoreid 
 * @param connectedUnderscoreuserUnderscoreid 
 * @param connectedUnderscoreadvertiserUnderscoreid 
 * @param connectedUnderscorelbaUnderscoreid 
 * @param connectedUnderscoretagUnderscoreid 
 * @param partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry 
 * @param partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry 
 * @param scopes 
 * @param createdUnderscoretimestamp 
 * @param updatedUnderscoretimestamp 
 * @param additionalUnderscoreidUnderscore1 
 * @param partnerUnderscoremetadata 
 */
case class IntegrationMetadata(id: Option[String],
                externalUnderscorebusinessUnderscoreid: Option[String],
                connectedUnderscoremerchantUnderscoreid: Option[String],
                connectedUnderscoreuserUnderscoreid: Option[String],
                connectedUnderscoreadvertiserUnderscoreid: Option[String],
                connectedUnderscorelbaUnderscoreid: Option[String],
                connectedUnderscoretagUnderscoreid: Option[String],
                partnerUnderscoreaccessUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                partnerUnderscorerefreshUnderscoretokenUnderscoreexpiry: Option[BigDecimal],
                scopes: Option[String],
                createdUnderscoretimestamp: Option[BigDecimal],
                updatedUnderscoretimestamp: Option[BigDecimal],
                additionalUnderscoreidUnderscore1: Option[String],
                partnerUnderscoremetadata: Option[String]
                )

object IntegrationMetadata {
    /**
     * Creates the codec for converting IntegrationMetadata from and to JSON.
     */
    implicit val decoder: Decoder[IntegrationMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[IntegrationMetadata] = deriveEncoder
}

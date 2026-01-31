package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Country

/**
 * 
 * @param addressUnderscoreprimary Primary address line of the store.
 * @param addressUnderscoresecondary Secondary address line of the store.
 * @param city City where the store is located.
 * @param country Country code where the store is located.
 * @param id The ID of the local store.
 * @param latitude Geographic latitude coordinate of the store.
 * @param longitude Geographic longitude coordinate of the store.
 * @param name The name of the local store.
 * @param postalUnderscorecode Postal or ZIP code of the store.
 * @param region State or region code where the store is located.
 * @param storeUnderscorecode Merchant provided code for the local store. Unique within the merchant's catalog.
 */
case class LocalStoreUpdate(addressUnderscoreprimary: Option[String],
                addressUnderscoresecondary: Option[String],
                city: Option[String],
                country: Option[Country],
                id: String,
                latitude: Option[Float],
                longitude: Option[Float],
                name: Option[String],
                postalUnderscorecode: Option[String],
                region: Option[String],
                storeUnderscorecode: Option[String]
                )

object LocalStoreUpdate {
    /**
     * Creates the codec for converting LocalStoreUpdate from and to JSON.
     */
    implicit val decoder: Decoder[LocalStoreUpdate] = deriveDecoder
    implicit val encoder: ObjectEncoder[LocalStoreUpdate] = deriveEncoder
}

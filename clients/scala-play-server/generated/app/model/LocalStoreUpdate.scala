package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LocalStoreUpdate.
  * @param addressPrimary Primary address line of the store.
  * @param addressSecondary Secondary address line of the store.
  * @param city City where the store is located.
  * @param country Country code where the store is located.
  * @param id The ID of the local store.
  * @param latitude Geographic latitude coordinate of the store.
  * @param longitude Geographic longitude coordinate of the store.
  * @param name The name of the local store.
  * @param postalCode Postal or ZIP code of the store.
  * @param region State or region code where the store is located.
  * @param storeCode Merchant provided code for the local store. Unique within the merchant's catalog.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LocalStoreUpdate(
  addressPrimary: Option[String],
  addressSecondary: Option[String],
  city: Option[String],
  country: Option[Country],
  id: String,
  latitude: Option[Float],
  longitude: Option[Float],
  name: Option[String],
  postalCode: Option[String],
  region: Option[String],
  storeCode: Option[String]
)

object LocalStoreUpdate {
  implicit lazy val localStoreUpdateJsonFormat: Format[LocalStoreUpdate] = Json.format[LocalStoreUpdate]
}


package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param addressPrimary Primary address line of the store.
  * @param addressSecondary Secondary address line of the store.
  * @param city City where the store is located.
  * @param country Country code where the store is located.
  * @param latitude Geographic latitude coordinate of the store.
  * @param longitude Geographic longitude coordinate of the store.
  * @param name The name of the local store.
  * @param postalCode Postal or ZIP code of the store.
  * @param region State or region code where the store is located.
  * @param storeCode Merchant provided code for the local store. Unique within the merchant's catalog.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LocalStoreCreate(
  addressPrimary: Option[String],
  addressSecondary: Option[String],
  city: Option[String],
  country: Country,
  latitude: Option[Float],
  longitude: Option[Float],
  name: String,
  postalCode: Option[String],
  region: Option[String],
  storeCode: String
)

object LocalStoreCreate {
  implicit lazy val localStoreCreateJsonFormat: Format[LocalStoreCreate] = Json.format[LocalStoreCreate]
}


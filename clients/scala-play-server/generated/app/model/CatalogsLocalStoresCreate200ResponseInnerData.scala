package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Created/updated resource on success or error details on failure
  * @param addressPrimary Primary address line of the store.
  * @param addressSecondary Secondary address line of the store.
  * @param city City where the store is located.
  * @param country Country code where the store is located.
  * @param createdAt Creation timestamp
  * @param id The ID of the local store.
  * @param latitude Geographic latitude coordinate of the store.
  * @param longitude Geographic longitude coordinate of the store.
  * @param name The name of the local store.
  * @param postalCode Postal or ZIP code of the store.
  * @param region State or region code where the store is located.
  * @param storeCode Merchant provided code for the local store. Unique within the merchant's catalog.
  * @param updatedAt Last update timestamp
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsLocalStoresCreate200ResponseInnerData(
  addressPrimary: Option[String],
  addressSecondary: Option[String],
  city: Option[String],
  country: Country,
  createdAt: OffsetDateTime,
  id: String,
  latitude: Option[Float],
  longitude: Option[Float],
  name: String,
  postalCode: Option[String],
  region: Option[String],
  storeCode: String,
  updatedAt: OffsetDateTime,
  exceptions: Error
)

object CatalogsLocalStoresCreate200ResponseInnerData {
  implicit lazy val catalogsLocalStoresCreate200ResponseInnerDataJsonFormat: Format[CatalogsLocalStoresCreate200ResponseInnerData] = Json.format[CatalogsLocalStoresCreate200ResponseInnerData]
}


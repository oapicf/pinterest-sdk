package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Created/updated resource on success or error details on failure
 *
 * @param addressPrimary Primary address line of the store. for example: ''123 Johnson St''
 * @param addressSecondary Secondary address line of the store. for example: ''Suite 100''
 * @param city City where the store is located. for example: ''Sunnyvale''
 * @param country Country code where the store is located. for example: ''null''
 * @param createdAt Creation timestamp for example: ''2022-03-14T15:15:22Z''
 * @param id The ID of the local store. for example: ''1234567890''
 * @param latitude Geographic latitude coordinate of the store. for example: ''-30.21''
 * @param longitude Geographic longitude coordinate of the store. for example: ''50.45''
 * @param name The name of the local store. for example: ''Sunnyvale Store''
 * @param postalCode Postal or ZIP code of the store. for example: ''94043''
 * @param region State or region code where the store is located. for example: ''CA''
 * @param storeCode Merchant provided code for the local store. Unique within the merchant's catalog. for example: ''store_1''
 * @param updatedAt Last update timestamp for example: ''2022-03-14T15:16:34Z''
 * @param exceptions  for example: ''null''
*/
final case class CatalogsLocalStoresCreate200ResponseInnerData (
  addressPrimary: Option[String] = None,
  addressSecondary: Option[String] = None,
  city: Option[String] = None,
  country: Country,
  createdAt: OffsetDateTime,
  id: String,
  latitude: Option[Float] = None,
  longitude: Option[Float] = None,
  name: String,
  postalCode: Option[String] = None,
  region: Option[String] = None,
  storeCode: String,
  updatedAt: OffsetDateTime,
  exceptions: Error
)


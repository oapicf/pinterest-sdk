package org.openapitools.server.model


/**
 * @param addressPrimary Primary address line of the store. for example: ''123 Johnson St''
 * @param addressSecondary Secondary address line of the store. for example: ''Suite 100''
 * @param city City where the store is located. for example: ''Sunnyvale''
 * @param country Country code where the store is located. for example: ''null''
 * @param id The ID of the local store. for example: ''1234567890''
 * @param latitude Geographic latitude coordinate of the store. for example: ''-30.21''
 * @param longitude Geographic longitude coordinate of the store. for example: ''50.45''
 * @param name The name of the local store. for example: ''Sunnyvale Store''
 * @param postalCode Postal or ZIP code of the store. for example: ''94043''
 * @param region State or region code where the store is located. for example: ''CA''
 * @param storeCode Merchant provided code for the local store. Unique within the merchant's catalog. for example: ''store_1''
*/
final case class LocalStoreUpdate (
  addressPrimary: Option[String] = None,
  addressSecondary: Option[String] = None,
  city: Option[String] = None,
  country: Option[Country] = None,
  id: String,
  latitude: Option[Float] = None,
  longitude: Option[Float] = None,
  name: Option[String] = None,
  postalCode: Option[String] = None,
  region: Option[String] = None,
  storeCode: Option[String] = None
)


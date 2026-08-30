package org.openapitools.server.model


/**
 * Store metadata for a specific store location
 *
 * @param geohash Geohash of the store location for example: ''9q''
 * @param latitude Geographic latitude coordinate of the store for example: ''37.37695098''
 * @param longitude Geographic longitude coordinate of the store for example: ''-122.032913''
 * @param storeCode Merchant provided store code for example: ''store_1''
 * @param storeId Internal store code for example: ''9070947806573''
 * @param storeName Store name for example: ''Store 1 Sunnyvale''
*/
final case class StoreMetadata (
  geohash: Option[String] = None,
  latitude: Option[Double] = None,
  longitude: Option[Double] = None,
  storeCode: String,
  storeId: String,
  storeName: Option[String] = None
)


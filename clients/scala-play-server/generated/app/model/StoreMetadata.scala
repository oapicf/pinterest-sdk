package model

import play.api.libs.json._

/**
  * Store metadata for a specific store location
  * @param geohash Geohash of the store location
  * @param latitude Geographic latitude coordinate of the store
  * @param longitude Geographic longitude coordinate of the store
  * @param storeCode Merchant provided store code
  * @param storeId Internal store code
  * @param storeName Store name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class StoreMetadata(
  geohash: Option[String],
  latitude: Option[Double],
  longitude: Option[Double],
  storeCode: String,
  storeId: String,
  storeName: Option[String]
)

object StoreMetadata {
  implicit lazy val storeMetadataJsonFormat: Format[StoreMetadata] = Json.format[StoreMetadata]
}


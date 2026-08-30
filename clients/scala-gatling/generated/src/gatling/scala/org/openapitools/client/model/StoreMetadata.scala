
package org.openapitools.client.model


case class StoreMetadata (
    /* Geohash of the store location */
    _geohash: Option[String],
    /* Geographic latitude coordinate of the store */
    _latitude: Option[Double],
    /* Geographic longitude coordinate of the store */
    _longitude: Option[Double],
    /* Merchant provided store code */
    _storeCode: String,
    /* Internal store code */
    _storeId: String,
    /* Store name */
    _storeName: Option[String]
)
object StoreMetadata {
    def toStringBody(var_geohash: Object, var_latitude: Object, var_longitude: Object, var_storeCode: Object, var_storeId: Object, var_storeName: Object) =
        s"""
        | {
        | "geohash":$var_geohash,"latitude":$var_latitude,"longitude":$var_longitude,"storeCode":$var_storeCode,"storeId":$var_storeId,"storeName":$var_storeName
        | }
        """.stripMargin
}

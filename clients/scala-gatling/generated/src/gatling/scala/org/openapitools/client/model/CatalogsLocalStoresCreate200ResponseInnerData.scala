
package org.openapitools.client.model

import java.time.OffsetDateTime

case class CatalogsLocalStoresCreate200ResponseInnerData (
    /* Primary address line of the store. */
    _addressPrimary: Option[String],
    /* Secondary address line of the store. */
    _addressSecondary: Option[String],
    /* City where the store is located. */
    _city: Option[String],
    /* Country code where the store is located. */
    _country: Country,
    /* Creation timestamp */
    _createdAt: OffsetDateTime,
    /* The ID of the local store. */
    _id: String,
    /* Geographic latitude coordinate of the store. */
    _latitude: Option[Float],
    /* Geographic longitude coordinate of the store. */
    _longitude: Option[Float],
    /* The name of the local store. */
    _name: String,
    /* Postal or ZIP code of the store. */
    _postalCode: Option[String],
    /* State or region code where the store is located. */
    _region: Option[String],
    /* Merchant provided code for the local store. Unique within the merchant's catalog. */
    _storeCode: String,
    /* Last update timestamp */
    _updatedAt: OffsetDateTime,
    _exceptions: Error
)
object CatalogsLocalStoresCreate200ResponseInnerData {
    def toStringBody(var_addressPrimary: Object, var_addressSecondary: Object, var_city: Object, var_country: Object, var_createdAt: Object, var_id: Object, var_latitude: Object, var_longitude: Object, var_name: Object, var_postalCode: Object, var_region: Object, var_storeCode: Object, var_updatedAt: Object, var_exceptions: Object) =
        s"""
        | {
        | "addressPrimary":$var_addressPrimary,"addressSecondary":$var_addressSecondary,"city":$var_city,"country":$var_country,"createdAt":$var_createdAt,"id":$var_id,"latitude":$var_latitude,"longitude":$var_longitude,"name":$var_name,"postalCode":$var_postalCode,"region":$var_region,"storeCode":$var_storeCode,"updatedAt":$var_updatedAt,"exceptions":$var_exceptions
        | }
        """.stripMargin
}

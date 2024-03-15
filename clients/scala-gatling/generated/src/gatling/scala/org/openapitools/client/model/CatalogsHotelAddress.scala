
package org.openapitools.client.model


case class CatalogsHotelAddress (
    /* Primary street address of hotel. */
    _addr1: Option[String],
    /* City where the hotel is located. */
    _city: Option[String],
    /* State, county, province, where the hotel is located. */
    _region: Option[String],
    /* Country where the hotel is located. */
    _country: Option[String],
    /* Required for countries with a postal code system. Postal or zip code of the hotel. */
    _postalCode: Option[String]
)
object CatalogsHotelAddress {
    def toStringBody(var_addr1: Object, var_city: Object, var_region: Object, var_country: Object, var_postalCode: Object) =
        s"""
        | {
        | "addr1":$var_addr1,"city":$var_city,"region":$var_region,"country":$var_country,"postalCode":$var_postalCode
        | }
        """.stripMargin
}

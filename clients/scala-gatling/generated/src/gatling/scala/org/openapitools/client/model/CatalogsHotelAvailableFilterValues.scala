
package org.openapitools.client.model


case class CatalogsHotelAvailableFilterValues (
    _catalogType: String,
    _filterValues: CatalogsHotelFilterValuesMap
)
object CatalogsHotelAvailableFilterValues {
    def toStringBody(var_catalogType: Object, var_filterValues: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"filterValues":$var_filterValues
        | }
        """.stripMargin
}

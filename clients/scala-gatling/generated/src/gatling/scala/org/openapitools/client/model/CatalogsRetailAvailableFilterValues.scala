
package org.openapitools.client.model


case class CatalogsRetailAvailableFilterValues (
    _catalogType: String,
    _filterValues: CatalogsRetailFilterValuesMap
)
object CatalogsRetailAvailableFilterValues {
    def toStringBody(var_catalogType: Object, var_filterValues: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"filterValues":$var_filterValues
        | }
        """.stripMargin
}

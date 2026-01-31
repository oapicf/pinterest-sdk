
package org.openapitools.client.model


case class CatalogsAvailableFilterValues (
    _catalogType: String,
    _filterValues: CatalogsCreativeAssetsFilterValuesMap
)
object CatalogsAvailableFilterValues {
    def toStringBody(var_catalogType: Object, var_filterValues: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"filterValues":$var_filterValues
        | }
        """.stripMargin
}

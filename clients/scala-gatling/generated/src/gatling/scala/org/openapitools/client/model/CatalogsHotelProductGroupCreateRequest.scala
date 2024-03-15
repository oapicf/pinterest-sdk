
package org.openapitools.client.model


case class CatalogsHotelProductGroupCreateRequest (
    _catalogType: String,
    _name: String,
    _description: Option[String],
    _filters: CatalogsHotelProductGroupFilters,
    /* Catalog id pertaining to the hotel product group. */
    _catalogId: String
)
object CatalogsHotelProductGroupCreateRequest {
    def toStringBody(var_catalogType: Object, var_name: Object, var_description: Object, var_filters: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"name":$var_name,"description":$var_description,"filters":$var_filters,"catalogId":$var_catalogId
        | }
        """.stripMargin
}

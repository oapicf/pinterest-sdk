
package org.openapitools.client.model


case class CatalogsRetailBatchRequest (
    _catalogType: CatalogsType,
    _country: Country,
    _language: Language,
    /* Array with catalogs item operations */
    _items: List[CatalogsRetailBatchRequestItemsInner]
)
object CatalogsRetailBatchRequest {
    def toStringBody(var_catalogType: Object, var_country: Object, var_language: Object, var_items: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"country":$var_country,"language":$var_language,"items":$var_items
        | }
        """.stripMargin
}

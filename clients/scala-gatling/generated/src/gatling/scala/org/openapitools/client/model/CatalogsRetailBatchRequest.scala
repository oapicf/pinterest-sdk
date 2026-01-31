
package org.openapitools.client.model


case class CatalogsRetailBatchRequest (
    /* Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _country: Country,
    /* Array with catalogs item operations */
    _items: List[CatalogsRetailBatchRequestItemsInner],
    /* We recommend using the CatalogsLocale values. */
    _language: String
)
object CatalogsRetailBatchRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_items: Object, var_language: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"items":$var_items,"language":$var_language
        | }
        """.stripMargin
}

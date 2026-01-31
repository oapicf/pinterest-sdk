
package org.openapitools.client.model


case class CatalogsHotelBatchRequest (
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _country: Country,
    /* Array with catalogs item operations */
    _items: List[CatalogsHotelBatchItem],
    /* We recommend using the CatalogsLocale values. */
    _language: String
)
object CatalogsHotelBatchRequest {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_country: Object, var_items: Object, var_language: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"country":$var_country,"items":$var_items,"language":$var_language
        | }
        """.stripMargin
}

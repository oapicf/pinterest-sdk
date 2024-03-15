
package org.openapitools.client.model


case class CatalogsHotelBatchRequest (
    _catalogType: CatalogsType,
    _country: Country,
    _language: Language,
    /* Array with catalogs item operations */
    _items: List[CatalogsHotelBatchItem],
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    _catalogId: Option[String]
)
object CatalogsHotelBatchRequest {
    def toStringBody(var_catalogType: Object, var_country: Object, var_language: Object, var_items: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"country":$var_country,"language":$var_language,"items":$var_items,"catalogId":$var_catalogId
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class CatalogsHotelItemsPostFilter (
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    _catalogId: Option[String],
    _catalogType: String,
    _hotelIds: List[String]
)
object CatalogsHotelItemsPostFilter {
    def toStringBody(var_catalogId: Object, var_catalogType: Object, var_hotelIds: Object) =
        s"""
        | {
        | "catalogId":$var_catalogId,"catalogType":$var_catalogType,"hotelIds":$var_hotelIds
        | }
        """.stripMargin
}

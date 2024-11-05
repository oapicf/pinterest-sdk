
package org.openapitools.client.model


case class CatalogsHotelItemsPostFilter (
    _catalogType: String,
    _hotelIds: List[String],
    /* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
    _catalogId: Option[String]
)
object CatalogsHotelItemsPostFilter {
    def toStringBody(var_catalogType: Object, var_hotelIds: Object, var_catalogId: Object) =
        s"""
        | {
        | "catalogType":$var_catalogType,"hotelIds":$var_hotelIds,"catalogId":$var_catalogId
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class CatalogsRetailItemResponse (
    _attributes: Option[ItemAttributes],
    _catalogType: String,
    /* The catalog retail item id in the merchant namespace */
    _itemId: Option[String],
    /* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
    _itemResponseKind: String,
    /* The pins mapped to the item */
    _pins: Option[List[Pin]]
)
object CatalogsRetailItemResponse {
    def toStringBody(var_attributes: Object, var_catalogType: Object, var_itemId: Object, var_itemResponseKind: Object, var_pins: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"catalogType":$var_catalogType,"itemId":$var_itemId,"itemResponseKind":$var_itemResponseKind,"pins":$var_pins
        | }
        """.stripMargin
}

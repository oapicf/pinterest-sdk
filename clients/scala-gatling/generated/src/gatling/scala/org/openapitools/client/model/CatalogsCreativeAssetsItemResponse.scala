
package org.openapitools.client.model


case class CatalogsCreativeAssetsItemResponse (
    _attributes: Option[CatalogsCreativeAssetsAttributes],
    _catalogType: String,
    /* The catalog creative assets id in the merchant namespace */
    _creativeAssetsId: Option[String],
    /* Discriminator literal identifying this leaf inside an `ItemResponse` payload. */
    _itemResponseKind: String,
    /* The pins mapped to the item */
    _pins: Option[List[Pin]]
)
object CatalogsCreativeAssetsItemResponse {
    def toStringBody(var_attributes: Object, var_catalogType: Object, var_creativeAssetsId: Object, var_itemResponseKind: Object, var_pins: Object) =
        s"""
        | {
        | "attributes":$var_attributes,"catalogType":$var_catalogType,"creativeAssetsId":$var_creativeAssetsId,"itemResponseKind":$var_itemResponseKind,"pins":$var_pins
        | }
        """.stripMargin
}

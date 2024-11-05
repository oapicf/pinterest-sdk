
package org.openapitools.client.model


case class CatalogsRetailProductMetadata (
    /* The user-created unique ID that represents the product. */
    _itemId: String,
    /* The parent ID of the product. */
    _itemGroupId: String,
    _availability: NonNullableProductAvailabilityType,
    /* The price of the product. */
    _price: Number,
    /* The discounted price of the product. */
    _salePrice: Number,
    _currency: NonNullableCatalogsCurrency
)
object CatalogsRetailProductMetadata {
    def toStringBody(var_itemId: Object, var_itemGroupId: Object, var_availability: Object, var_price: Object, var_salePrice: Object, var_currency: Object) =
        s"""
        | {
        | "itemId":$var_itemId,"itemGroupId":$var_itemGroupId,"availability":$var_availability,"price":$var_price,"salePrice":$var_salePrice,"currency":$var_currency
        | }
        """.stripMargin
}

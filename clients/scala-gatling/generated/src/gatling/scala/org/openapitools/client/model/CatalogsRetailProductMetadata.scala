
package org.openapitools.client.model


case class CatalogsRetailProductMetadata (
    _availability: NonNullableProductAvailabilityType,
    _currency: NonNullableCatalogsCurrency,
    /* The parent ID of the product. */
    _itemGroupId: String,
    /* The user-created unique ID that represents the product. */
    _itemId: String,
    /* The price of the product. */
    _price: Number,
    /* The discounted price of the product. */
    _salePrice: Number
)
object CatalogsRetailProductMetadata {
    def toStringBody(var_availability: Object, var_currency: Object, var_itemGroupId: Object, var_itemId: Object, var_price: Object, var_salePrice: Object) =
        s"""
        | {
        | "availability":$var_availability,"currency":$var_currency,"itemGroupId":$var_itemGroupId,"itemId":$var_itemId,"price":$var_price,"salePrice":$var_salePrice
        | }
        """.stripMargin
}

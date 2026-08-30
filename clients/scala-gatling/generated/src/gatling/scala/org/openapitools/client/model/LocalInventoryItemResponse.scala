
package org.openapitools.client.model


case class LocalInventoryItemResponse (
    /* Ad link for the item */
    _adLink: Option[String],
    /* Availability status of the item */
    _availability: Option[ItemAvailability],
    /* The millisecond timestamp when the local inventory item was created */
    _createdAt: Long,
    /* The catalog item id in the merchant namespace */
    _itemId: String,
    /* The millisecond timestamp when the local inventory item was lastly modified by the merchant. */
    _lastUpdatedTime: Long,
    /* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
    _price: Option[String],
    /* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
    _salePrice: Option[String],
    /* Store metadata for this local inventory item */
    _storeMetadata: StoreMetadata
)
object LocalInventoryItemResponse {
    def toStringBody(var_adLink: Object, var_availability: Object, var_createdAt: Object, var_itemId: Object, var_lastUpdatedTime: Object, var_price: Object, var_salePrice: Object, var_storeMetadata: Object) =
        s"""
        | {
        | "adLink":$var_adLink,"availability":$var_availability,"createdAt":$var_createdAt,"itemId":$var_itemId,"lastUpdatedTime":$var_lastUpdatedTime,"price":$var_price,"salePrice":$var_salePrice,"storeMetadata":$var_storeMetadata
        | }
        """.stripMargin
}

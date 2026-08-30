
package org.openapitools.client.model


case class ConversionEventsDataItemsCustomDataContentsItems (
    /* The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    _id: Option[String],
    /* The brand of a product. */
    _itemBrand: Option[String],
    /* The brand ID of a product. */
    _itemBrandId: Option[String],
    /* The category of a product. */
    _itemCategory: Option[String],
    /* The name of a product. */
    _itemName: Option[String],
    /* The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    _itemPrice: Option[String],
    /* The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    _quantity: Option[Long]
)
object ConversionEventsDataItemsCustomDataContentsItems {
    def toStringBody(var_id: Object, var_itemBrand: Object, var_itemBrandId: Object, var_itemCategory: Object, var_itemName: Object, var_itemPrice: Object, var_quantity: Object) =
        s"""
        | {
        | "id":$var_id,"itemBrand":$var_itemBrand,"itemBrandId":$var_itemBrandId,"itemCategory":$var_itemCategory,"itemName":$var_itemName,"itemPrice":$var_itemPrice,"quantity":$var_quantity
        | }
        """.stripMargin
}

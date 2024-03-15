
package org.openapitools.client.model


case class ConversionEventsDataInnerCustomDataContentsInner (
    /* The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    _id: Option[String],
    /* The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    _itemPrice: Option[String],
    /* The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). */
    _quantity: Option[Long],
    /* The name of a product. */
    _itemName: Option[String],
    /* The category of a product. */
    _itemCategory: Option[String],
    /* The brand of a product. */
    _itemBrand: Option[String]
)
object ConversionEventsDataInnerCustomDataContentsInner {
    def toStringBody(var_id: Object, var_itemPrice: Object, var_quantity: Object, var_itemName: Object, var_itemCategory: Object, var_itemBrand: Object) =
        s"""
        | {
        | "id":$var_id,"itemPrice":$var_itemPrice,"quantity":$var_quantity,"itemName":$var_itemName,"itemCategory":$var_itemCategory,"itemBrand":$var_itemBrand
        | }
        """.stripMargin
}

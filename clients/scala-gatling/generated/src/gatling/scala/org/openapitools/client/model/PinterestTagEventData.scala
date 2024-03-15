
package org.openapitools.client.model


case class PinterestTagEventData (
    _currency: Option[Currency],
    /* Promotion code. For example, \"Newsletter\". */
    _leadType: Option[String],
    _lineItems: Option[LineItem],
    /* Order ID. For example, \"X-151481\". */
    _orderId: Option[String],
    /* Order quantity. For example, 1. */
    _orderQuantity: Option[Integer],
    /* Page name. For example, \"Our Favorite Pins on Pinterest\". */
    _pageName: Option[String],
    /* Promotion code. For example, \"WINTER10\". */
    _promoCode: Option[String],
    /* Property. For example, \"Athleta\". */
    _property: Option[String],
    /* Search query string. For example, \"boots\". */
    _searchQuery: Option[String],
    /* Product value. For example, \"199.98\" */
    _value: Option[String],
    /* Video title. For example, \"How to style your Parker Boots\". */
    _videoTitle: Option[String]
)
object PinterestTagEventData {
    def toStringBody(var_currency: Object, var_leadType: Object, var_lineItems: Object, var_orderId: Object, var_orderQuantity: Object, var_pageName: Object, var_promoCode: Object, var_property: Object, var_searchQuery: Object, var_value: Object, var_videoTitle: Object) =
        s"""
        | {
        | "currency":$var_currency,"leadType":$var_leadType,"lineItems":$var_lineItems,"orderId":$var_orderId,"orderQuantity":$var_orderQuantity,"pageName":$var_pageName,"promoCode":$var_promoCode,"property":$var_property,"searchQuery":$var_searchQuery,"value":$var_value,"videoTitle":$var_videoTitle
        | }
        """.stripMargin
}

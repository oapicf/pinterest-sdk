
package org.openapitools.client.model


case class CartingProduct (
    /* the internal Pinterest carting product id (different from industry product id) */
    _cartingProductId: String,
    /* Whether to display only the preferred retailers for the carting product */
    _displayPreferredRetailersOnly: Option[Boolean],
    /* Whether to display the price for the carting product */
    _displayProductPrice: Option[Boolean],
    /* A sorted array of preferred retailers for the carting product */
    _preferredRetailers: Option[List[CartingRetailer]],
    /* Whether to randomize preferred retailers for the carting product */
    _randomizePreferredRetailers: Option[Boolean]
)
object CartingProduct {
    def toStringBody(var_cartingProductId: Object, var_displayPreferredRetailersOnly: Object, var_displayProductPrice: Object, var_preferredRetailers: Object, var_randomizePreferredRetailers: Object) =
        s"""
        | {
        | "cartingProductId":$var_cartingProductId,"displayPreferredRetailersOnly":$var_displayPreferredRetailersOnly,"displayProductPrice":$var_displayProductPrice,"preferredRetailers":$var_preferredRetailers,"randomizePreferredRetailers":$var_randomizePreferredRetailers
        | }
        """.stripMargin
}

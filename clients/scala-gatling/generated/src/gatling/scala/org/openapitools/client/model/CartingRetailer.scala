
package org.openapitools.client.model


case class CartingRetailer (
    /* Unique identifier for the retailer */
    _retailerId: String,
    /* Name of the retailer */
    _retailerName: String
)
object CartingRetailer {
    def toStringBody(var_retailerId: Object, var_retailerName: Object) =
        s"""
        | {
        | "retailerId":$var_retailerId,"retailerName":$var_retailerName
        | }
        """.stripMargin
}

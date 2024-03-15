
package org.openapitools.client.model


case class AdAccountsCountryResponse (
    _items: Option[List[AdAccountsCountryResponseData]]
)
object AdAccountsCountryResponse {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

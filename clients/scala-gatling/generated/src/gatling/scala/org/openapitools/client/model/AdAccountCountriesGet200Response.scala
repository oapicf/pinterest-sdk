
package org.openapitools.client.model


case class AdAccountCountriesGet200Response (
    _items: List[AdAccountsCountry]
)
object AdAccountCountriesGet200Response {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

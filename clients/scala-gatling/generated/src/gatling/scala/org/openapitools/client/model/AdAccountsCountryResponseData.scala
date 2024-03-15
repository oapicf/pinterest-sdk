
package org.openapitools.client.model


case class AdAccountsCountryResponseData (
    _code: Option[AdCountry],
    /* Country currency. */
    _currency: Option[String],
    /* Country index */
    _index: Option[Number],
    /* Country name */
    _name: Option[String]
)
object AdAccountsCountryResponseData {
    def toStringBody(var_code: Object, var_currency: Object, var_index: Object, var_name: Object) =
        s"""
        | {
        | "code":$var_code,"currency":$var_currency,"index":$var_index,"name":$var_name
        | }
        """.stripMargin
}

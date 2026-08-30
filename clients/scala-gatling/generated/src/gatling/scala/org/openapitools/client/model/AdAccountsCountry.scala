
package org.openapitools.client.model


case class AdAccountsCountry (
    _code: Country,
    /* Country currency. */
    _currency: String,
    /* Country index */
    _index: Number,
    /* Country name */
    _name: String
)
object AdAccountsCountry {
    def toStringBody(var_code: Object, var_currency: Object, var_index: Object, var_name: Object) =
        s"""
        | {
        | "code":$var_code,"currency":$var_currency,"index":$var_index,"name":$var_name
        | }
        """.stripMargin
}

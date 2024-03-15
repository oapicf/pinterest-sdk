
package org.openapitools.client.model


case class CustomerListsList200Response (
    _items: List[CustomerList],
    _bookmark: Option[String]
)
object CustomerListsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

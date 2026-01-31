
package org.openapitools.client.model


case class CustomerListsList200Response (
    _bookmark: Option[String],
    _items: List[CustomerList]
)
object CustomerListsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}

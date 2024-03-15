
package org.openapitools.client.model


case class AdAccountsList200Response (
    /* Ad accounts */
    _items: List[AdAccount],
    _bookmark: Option[String]
)
object AdAccountsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

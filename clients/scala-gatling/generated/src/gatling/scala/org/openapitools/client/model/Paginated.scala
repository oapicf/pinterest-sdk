
package org.openapitools.client.model


case class Paginated (
    _items: List[Any],
    _bookmark: Option[String]
)
object Paginated {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

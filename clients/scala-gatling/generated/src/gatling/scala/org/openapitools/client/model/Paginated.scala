
package org.openapitools.client.model


case class Paginated (
    _bookmark: Option[String],
    _items: List[Any]
)
object Paginated {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}

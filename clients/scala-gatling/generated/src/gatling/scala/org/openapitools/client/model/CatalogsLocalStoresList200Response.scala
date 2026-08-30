
package org.openapitools.client.model


case class CatalogsLocalStoresList200Response (
    _bookmark: Option[String],
    _items: List[LocalStore]
)
object CatalogsLocalStoresList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}

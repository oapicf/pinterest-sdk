
package org.openapitools.client.model


case class CatalogsItems (
    /* Array with catalogs items */
    _items: Option[List[ItemBatchRecord]]
)
object CatalogsItems {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

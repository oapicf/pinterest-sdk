
package org.openapitools.client.model


case class ItemIdFilter (
    _ITEM_ID: CatalogsProductGroupMultipleStringCriteria
)
object ItemIdFilter {
    def toStringBody(var_ITEM_ID: Object) =
        s"""
        | {
        | "ITEM_ID":$var_ITEM_ID
        | }
        """.stripMargin
}

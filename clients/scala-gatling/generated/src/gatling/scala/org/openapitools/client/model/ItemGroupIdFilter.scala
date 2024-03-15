
package org.openapitools.client.model


case class ItemGroupIdFilter (
    _ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria
)
object ItemGroupIdFilter {
    def toStringBody(var_ITEM_GROUP_ID: Object) =
        s"""
        | {
        | "ITEM_GROUP_ID":$var_ITEM_GROUP_ID
        | }
        """.stripMargin
}

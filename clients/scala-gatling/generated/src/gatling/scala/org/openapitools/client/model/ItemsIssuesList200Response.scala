
package org.openapitools.client.model


case class ItemsIssuesList200Response (
    _bookmark: Option[String],
    _items: List[CatalogsItemValidationIssues]
)
object ItemsIssuesList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}


package org.openapitools.client.model


case class ItemsIssuesList200Response (
    _items: List[CatalogsItemValidationIssues],
    _bookmark: Option[String]
)
object ItemsIssuesList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}

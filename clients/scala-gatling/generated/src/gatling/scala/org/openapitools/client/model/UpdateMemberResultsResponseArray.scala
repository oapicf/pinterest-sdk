
package org.openapitools.client.model


case class UpdateMemberResultsResponseArray (
    /* List of members with updated business access role. */
    _items: Option[List[UpdateMemberResult]]
)
object UpdateMemberResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

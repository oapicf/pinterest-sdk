
package org.openapitools.client.model


case class DeleteMemberAccessResultsResponseArray (
    /* List of member asset permissions that were deleted. */
    _items: Option[List[DeleteMemberAccessResult]]
)
object DeleteMemberAccessResultsResponseArray {
    def toStringBody(var_items: Object) =
        s"""
        | {
        | "items":$var_items
        | }
        """.stripMargin
}

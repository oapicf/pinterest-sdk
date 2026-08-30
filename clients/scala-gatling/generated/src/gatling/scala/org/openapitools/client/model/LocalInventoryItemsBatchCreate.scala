
package org.openapitools.client.model


case class LocalInventoryItemsBatchCreate (
    /* Array of inventory operations. Up to 1000 items per request. */
    _operations: List[LocalInventoryOperation]
)
object LocalInventoryItemsBatchCreate {
    def toStringBody(var_operations: Object) =
        s"""
        | {
        | "operations":$var_operations
        | }
        """.stripMargin
}

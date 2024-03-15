
package org.openapitools.client.model


case class PinsSaveRequest (
    /* Unique identifier of the board to which the pin will be saved. */
    _boardId: Option[String],
    /* Unique identifier of the board section to which the pin will be saved. */
    _boardSectionId: Option[String]
)
object PinsSaveRequest {
    def toStringBody(var_boardId: Object, var_boardSectionId: Object) =
        s"""
        | {
        | "boardId":$var_boardId,"boardSectionId":$var_boardSectionId
        | }
        """.stripMargin
}

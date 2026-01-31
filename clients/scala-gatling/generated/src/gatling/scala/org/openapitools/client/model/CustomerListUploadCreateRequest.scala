
package org.openapitools.client.model


case class CustomerListUploadCreateRequest (
    _operation: UserListOperationType,
    /* Number of parts to upload the file in. */
    _totalParts: Integer
)
object CustomerListUploadCreateRequest {
    def toStringBody(var_operation: Object, var_totalParts: Object) =
        s"""
        | {
        | "operation":$var_operation,"totalParts":$var_totalParts
        | }
        """.stripMargin
}

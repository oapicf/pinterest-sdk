
package org.openapitools.client.model


case class DynamicTitlesProcessCSVCreate (
    /* The request_id returned from the GET uploads endpoint. */
    _requestId: String
)
object DynamicTitlesProcessCSVCreate {
    def toStringBody(var_requestId: Object) =
        s"""
        | {
        | "requestId":$var_requestId
        | }
        """.stripMargin
}

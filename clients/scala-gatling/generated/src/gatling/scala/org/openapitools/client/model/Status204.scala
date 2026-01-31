
package org.openapitools.client.model


case class Status204 (
    _statusCode: Number
)
object Status204 {
    def toStringBody(var_statusCode: Object) =
        s"""
        | {
        | "statusCode":$var_statusCode
        | }
        """.stripMargin
}

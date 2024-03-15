
package org.openapitools.client.model


case class IntegrationLogClientRequest (
    _method: String,
    /* HTTP request host from host header. */
    _host: String,
    /* HTTP request path. */
    _path: String,
    /* HTTP request headers as key-value pairs. */
    _requestHeaders: Option[Map[String, String]],
    /* HTTP response headers as key-value pairs. */
    _responseHeaders: Option[Map[String, String]],
    _responseStatusCode: Option[Integer]
)
object IntegrationLogClientRequest {
    def toStringBody(var_method: Object, var_host: Object, var_path: Object, var_requestHeaders: Object, var_responseHeaders: Object, var_responseStatusCode: Object) =
        s"""
        | {
        | "method":$var_method,"host":$var_host,"path":$var_path,"requestHeaders":$var_requestHeaders,"responseHeaders":$var_responseHeaders,"responseStatusCode":$var_responseStatusCode
        | }
        """.stripMargin
}

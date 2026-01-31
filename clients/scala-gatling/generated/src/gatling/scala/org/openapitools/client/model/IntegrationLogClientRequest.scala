
package org.openapitools.client.model


case class IntegrationLogClientRequest (
    /* HTTP request host from host header. */
    _host: String,
    _method: String,
    /* HTTP request path. */
    _path: String,
    /* HTTP request headers as key-value pairs. */
    _requestHeaders: Option[Map[String, String]],
    /* HTTP response headers as key-value pairs. */
    _responseHeaders: Option[Map[String, String]],
    _responseStatusCode: Option[Integer]
)
object IntegrationLogClientRequest {
    def toStringBody(var_host: Object, var_method: Object, var_path: Object, var_requestHeaders: Object, var_responseHeaders: Object, var_responseStatusCode: Object) =
        s"""
        | {
        | "host":$var_host,"method":$var_method,"path":$var_path,"requestHeaders":$var_requestHeaders,"responseHeaders":$var_responseHeaders,"responseStatusCode":$var_responseStatusCode
        | }
        """.stripMargin
}

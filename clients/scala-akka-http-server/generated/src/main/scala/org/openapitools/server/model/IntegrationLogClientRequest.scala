package org.openapitools.server.model


/**
 * HTTP request details included in the log sent by the client.
 *
 * @param method  for example: ''null''
 * @param host HTTP request host from host header. for example: ''null''
 * @param path HTTP request path. for example: ''null''
 * @param requestHeaders HTTP request headers as key-value pairs. for example: ''null''
 * @param responseHeaders HTTP response headers as key-value pairs. for example: ''null''
 * @param responseStatusCode  for example: ''null''
*/
final case class IntegrationLogClientRequest (
  method: String,
  host: String,
  path: String,
  requestHeaders: Option[Map[String, String]] = None,
  responseHeaders: Option[Map[String, String]] = None,
  responseStatusCode: Option[Int] = None
)


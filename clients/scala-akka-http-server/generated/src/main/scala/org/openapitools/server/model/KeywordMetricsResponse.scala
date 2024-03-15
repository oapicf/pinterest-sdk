package org.openapitools.server.model


/**
 * = KeywordMetricsResponse =
 *
 * @param keyword Keyword name, e.g., \"keyword\":\"fashion outfits\" for example: ''animals''
 * @param metrics  for example: ''null''
*/
final case class KeywordMetricsResponse (
  keyword: Option[String] = None,
  metrics: Option[KeywordMetrics] = None
)


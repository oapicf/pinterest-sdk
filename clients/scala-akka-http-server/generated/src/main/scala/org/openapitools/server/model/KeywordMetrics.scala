package org.openapitools.server.model


/**
 * = KeywordMetrics =
 *
 * Keyword metrics JSON
 *
 * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response for example: ''5M+''
*/
final case class KeywordMetrics (
  keywordQueryVolume: Option[String] = None
)


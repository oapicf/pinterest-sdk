package org.openapitools.server.model


/**
 * = KeywordMetrics =
 *
 * Keyword metrics JSON
 *
 * @param avgCpcInMicroCurrency Average cost per click for example: ''100000''
 * @param keywordQueryVolume Keyword's search frequency. This value is based on keyword frequency in pepsi client response for example: ''5M+''
*/
final case class KeywordMetrics (
  avgCpcInMicroCurrency: Option[Double] = None,
  keywordQueryVolume: Option[String] = None
)


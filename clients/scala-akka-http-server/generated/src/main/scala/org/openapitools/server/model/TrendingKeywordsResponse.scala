package org.openapitools.server.model


/**
 * @param trends The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend. for example: ''null''
*/
final case class TrendingKeywordsResponse (
  trends: Option[Seq[TrendingKeywordsResponseTrendsInner]] = None
)


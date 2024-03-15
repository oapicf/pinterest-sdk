package org.openapitools.server.model


/**
 * = ConversionTagResponse =
 *
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param codeSnippet Tag code snippet. for example: ''<script type=text/javascript> [...]''
 * @param enhancedMatchStatus  for example: ''null''
 * @param id Tag ID. for example: ''2617998078212''
 * @param lastFiredTimeMs Time for the last event fired. for example: ''1599030000000''
 * @param name Conversion tag name. for example: ''ACME Checkout Test Tag''
 * @param status  for example: ''null''
 * @param version Version number. for example: ''3''
 * @param configs  for example: ''null''
*/
final case class ConversionTagResponse (
  adAccountId: Option[String] = None,
  codeSnippet: Option[String] = None,
  enhancedMatchStatus: Option[EnhancedMatchStatusType] = None,
  id: Option[String] = None,
  lastFiredTimeMs: Option[Double] = None,
  name: Option[String] = None,
  status: Option[EntityStatus] = None,
  version: Option[String] = None,
  configs: Option[ConversionTagConfigs] = None
)


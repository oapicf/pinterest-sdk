package org.openapitools.server.model


/**
 * @param codeSnippet Tag code snippet. for example: ''<script type=text/javascript> [...]''
 * @param configs  for example: ''null''
 * @param enhancedMatchStatus The enhanced match status of the tag for example: ''null''
 * @param id Tag ID. for example: ''2617998078212''
 * @param lastFiredTimeMs Time for the last event fired. for example: ''1599030000000''
 * @param name Conversion tag name. for example: ''ACME Checkout Test Tag''
 * @param version Version number. for example: ''3''
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param status  for example: ''null''
*/
final case class ConversionTag (
  codeSnippet: Option[String] = None,
  configs: Option[ConversionTagConfigs] = None,
  enhancedMatchStatus: Option[EnhancedMatchStatusType] = None,
  id: Option[String] = None,
  lastFiredTimeMs: Option[Double] = None,
  name: String,
  version: Option[String] = None,
  adAccountId: String,
  status: Option[EntityStatus] = None
)


package org.openapitools.server.model


/**
 * Related Keyword information of the editorial article
 *
 * @param name Keyword Name for example: ''null''
 * @param pctGrowthMom MoM growth as a percentage, if there is no growth rate, this field is not present for example: ''null''
*/
final case class KeywordInfo (
  name: String,
  pctGrowthMom: Option[Double] = None
)


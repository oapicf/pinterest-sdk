package org.openapitools.server.model


/**
 * This represents a mapping from gender to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 * @param genderDistribution  for example: ''null''
*/
final case class TrendingKeywordDemographicsGenderDistribution (
  genderDistribution: Option[String] = None
)


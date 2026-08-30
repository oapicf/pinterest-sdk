package org.openapitools.server.model


/**
 * = TrendsAgeDistribution =
 *
 * This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.
 *
 * @param ageDistribution  for example: ''null''
*/
final case class TrendsAgeDistribution (
  ageDistribution: Option[TrendsAgeBucket] = None
)


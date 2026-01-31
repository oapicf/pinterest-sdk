package org.openapitools.server.model


/**
 * Age and gender distribution who engaged with this product category in the past 3 months
 *
 * @param age Age demographic distribution for example: ''null''
 * @param gender  for example: ''null''
*/
final case class ProductCategoriesDemographic (
  age: Map[String, Double],
  gender: GenderDemographics
)


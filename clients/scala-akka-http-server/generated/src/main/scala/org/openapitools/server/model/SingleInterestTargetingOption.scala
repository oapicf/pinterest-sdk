package org.openapitools.server.model


/**
 * = SingleInterestTargetingOptionData =
 *
 * @param childInterests  for example: ''null''
 * @param id  for example: ''945391946569''
 * @param level  for example: ''2''
 * @param name  for example: ''Dress''
*/
final case class SingleInterestTargetingOption (
  childInterests: Seq[String],
  id: String,
  level: Int,
  name: String
)


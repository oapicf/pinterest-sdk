package org.openapitools.server.model


/**
 * = SingleInterestTargetingOptionData =
 *
 * @param id  for example: ''945391946569''
 * @param name  for example: ''Dress''
 * @param childInterests  for example: ''null''
 * @param level  for example: ''2''
*/
final case class SingleInterestTargetingOptionResponse (
  id: Option[String] = None,
  name: Option[String] = None,
  childInterests: Option[Seq[String]] = None,
  level: Option[Int] = None
)


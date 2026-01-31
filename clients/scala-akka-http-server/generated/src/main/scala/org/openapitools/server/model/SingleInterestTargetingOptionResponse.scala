package org.openapitools.server.model


/**
 * = SingleInterestTargetingOptionData =
 *
 * @param childInterests  for example: ''null''
 * @param id  for example: ''945391946569''
 * @param level  for example: ''2''
 * @param name  for example: ''Dress''
*/
final case class SingleInterestTargetingOptionResponse (
  childInterests: Option[Seq[String]] = None,
  id: Option[String] = None,
  level: Option[Int] = None,
  name: Option[String] = None
)


package org.openapitools.server.model


/**
 * @param key  for example: ''549755885175''
 * @param name  for example: ''travel''
 * @param ratio  for example: ''0.551''
 * @param index  for example: ''1.2''
 * @param id  for example: ''549755885175''
*/
final case class AudienceInsightCategoryCommon (
  key: Option[String] = None,
  name: Option[String] = None,
  ratio: Option[Double] = None,
  index: Option[Double] = None,
  id: Option[String] = None
)


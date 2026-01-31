package org.openapitools.server.model


/**
 * @param id  for example: ''549755885175''
 * @param index  for example: ''1.2''
 * @param key  for example: ''549755885175''
 * @param name  for example: ''travel''
 * @param ratio  for example: ''0.551''
*/
final case class AudienceInsightCategoryCommon (
  id: Option[String] = None,
  index: Option[Double] = None,
  key: Option[String] = None,
  name: Option[String] = None,
  ratio: Option[Double] = None
)


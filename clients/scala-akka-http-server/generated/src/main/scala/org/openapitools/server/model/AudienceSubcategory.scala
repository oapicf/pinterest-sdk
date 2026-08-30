package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param index  for example: ''null''
 * @param key  for example: ''null''
 * @param name  for example: ''null''
 * @param ratio  for example: ''null''
*/
final case class AudienceSubcategory (
  id: Option[String] = None,
  index: Option[Double] = None,
  key: Option[String] = None,
  name: Option[String] = None,
  ratio: Option[Double] = None
)


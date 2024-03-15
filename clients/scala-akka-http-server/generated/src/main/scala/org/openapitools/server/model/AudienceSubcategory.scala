package org.openapitools.server.model


/**
 * = AudienceSubcategory =
 *
 * @param key Interest unique key (same as ID). for example: ''958862518888''
 * @param name Subinterest name. for example: ''travel destinations''
 * @param ratio Subinterest's percent of category's total audience. for example: ''0.482''
 * @param index Subinterest affinity index. for example: ''1.2''
 * @param id Subinterest ID. for example: ''958862518888''
*/
final case class AudienceSubcategory (
  key: Option[String] = None,
  name: Option[String] = None,
  ratio: Option[Double] = None,
  index: Option[Double] = None,
  id: Option[String] = None
)


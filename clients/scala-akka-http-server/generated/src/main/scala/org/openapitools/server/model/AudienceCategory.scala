package org.openapitools.server.model


/**
 * = AudienceCategory =
 *
 * @param id Interest ID. for example: ''1234567''
 * @param index Interest affinity index. for example: ''1.2''
 * @param key Interest unique key (same as ID). for example: ''1234567''
 * @param name Interest name. for example: ''travel''
 * @param ratio Interest's percent of category's total audience. for example: ''0.551''
 * @param subcategories Subcategory interest distribution for example: ''null''
*/
final case class AudienceCategory (
  id: Option[String] = None,
  index: Option[Double] = None,
  key: Option[String] = None,
  name: Option[String] = None,
  ratio: Option[Double] = None,
  subcategories: Option[Seq[AudienceSubcategory]] = None
)


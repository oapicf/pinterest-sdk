package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_media_type_criteria =
 *
 * @param negated  for example: ''null''
 * @param values  for example: ''null''
*/
final case class CatalogsProductGroupMultipleMediaTypesCriteria (
  negated: Option[Boolean] = None,
  values: Seq[MediaType]
)


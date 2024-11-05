package org.openapitools.server.model


/**
 * = catalogs_product_group_multiple_media_type_criteria =
 *
 * @param values  for example: ''null''
 * @param negated  for example: ''null''
*/
final case class CatalogsProductGroupMultipleMediaTypesCriteria (
  values: Seq[MediaType],
  negated: Option[Boolean] = None
)


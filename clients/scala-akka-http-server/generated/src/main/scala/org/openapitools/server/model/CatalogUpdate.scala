package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param catalogType  for example: ''null''
 * @param name A human-friendly name associated to a catalog entity. for example: ''null''
*/
final case class CatalogUpdate (
  catalogType: Option[CatalogsType] = None,
  name: Option[String] = None
)


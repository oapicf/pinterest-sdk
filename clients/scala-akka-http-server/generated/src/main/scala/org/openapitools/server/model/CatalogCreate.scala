package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param catalogType  for example: ''null''
 * @param name A human-friendly name associated to a catalog entity. for example: ''null''
*/
final case class CatalogCreate (
  catalogType: CatalogsType,
  name: String
)


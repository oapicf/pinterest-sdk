package org.openapitools.server.model


/**
 * = catalogs_create_request =
 *
 * Request object for creating a catalog.
 *
 * @param catalogType Type of the catalog entity. for example: ''null''
 * @param name A human-friendly name associated to a given catalog. for example: ''null''
*/
final case class CatalogsCreateRequest (
  catalogType: String,
  name: String
)


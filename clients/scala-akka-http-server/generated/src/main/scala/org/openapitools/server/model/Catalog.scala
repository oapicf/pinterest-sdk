package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = catalog =
 *
 * Catalog entity
 *
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id ID of the catalog entity. for example: ''864344156814050986''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
 * @param name A human-friendly name associated to a catalog entity. for example: ''null''
 * @param catalogType  for example: ''null''
*/
final case class Catalog (
  createdAt: Option[OffsetDateTime] = None,
  id: String,
  updatedAt: Option[OffsetDateTime] = None,
  name: String,
  catalogType: CatalogsType
)


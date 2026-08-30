package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Catalog entity
 *
 * @param catalogType  for example: ''null''
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id ID of the catalog entity. for example: ''864344156814050986''
 * @param name A human-friendly name associated to a catalog entity. for example: ''null''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
*/
final case class Catalog (
  catalogType: CatalogsType,
  createdAt: OffsetDateTime,
  id: String,
  name: String,
  updatedAt: OffsetDateTime
)


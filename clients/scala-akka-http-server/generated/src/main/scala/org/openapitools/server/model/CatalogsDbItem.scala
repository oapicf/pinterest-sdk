package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * = db_item =
 *
 * @param createdAt  for example: ''2022-03-14T15:15:22Z''
 * @param id  for example: ''null''
 * @param updatedAt  for example: ''2022-03-14T15:16:34Z''
*/
final case class CatalogsDbItem (
  createdAt: Option[OffsetDateTime] = None,
  id: Option[String] = None,
  updatedAt: Option[OffsetDateTime] = None
)


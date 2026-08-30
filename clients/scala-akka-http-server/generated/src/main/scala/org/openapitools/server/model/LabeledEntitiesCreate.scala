package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param entityIds Entity IDs to apply label to. for example: ''null''
*/
final case class LabeledEntitiesCreate (
  entityIds: Seq[String]
)


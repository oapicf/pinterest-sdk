package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param audienceIds Audience IDs included in the customer segment. for example: ''null''
 * @param name Customer segment name. for example: ''null''
*/
final case class CustomerSegmentCreate (
  audienceIds: Seq[String],
  name: String
)


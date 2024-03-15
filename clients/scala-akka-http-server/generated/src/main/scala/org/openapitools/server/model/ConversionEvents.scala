package org.openapitools.server.model


/**
 * A list of events (one or more) encapsulated by a data object.
 *
 * @param data  for example: ''null''
*/
final case class ConversionEvents (
  data: Seq[ConversionEventsDataInner]
)


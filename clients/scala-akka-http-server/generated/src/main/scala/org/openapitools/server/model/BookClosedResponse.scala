package org.openapitools.server.model


/**
 * = BookClosed =
 *
 * Creation fields
 *
 * @param conversionMetricsReady Are conversion metrics ready? for example: ''false''
 * @param nonConversionMetricsReady Are non-conversion metrics ready? for example: ''false''
*/
final case class BookClosedResponse (
  conversionMetricsReady: Option[Boolean] = None,
  nonConversionMetricsReady: Option[Boolean] = None
)


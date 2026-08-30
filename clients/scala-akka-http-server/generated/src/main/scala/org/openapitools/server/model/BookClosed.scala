package org.openapitools.server.model


/**
 * = BookClosed =
 *
 * @param conversionMetricsReady Are conversion metrics ready? for example: ''false''
 * @param nonConversionMetricsReady Are non-conversion metrics ready? for example: ''false''
*/
final case class BookClosed (
  conversionMetricsReady: Boolean,
  nonConversionMetricsReady: Boolean
)


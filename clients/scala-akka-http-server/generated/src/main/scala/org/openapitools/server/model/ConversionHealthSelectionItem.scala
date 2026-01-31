package org.openapitools.server.model


/**
 * User selection of conversion health criteria for a single feature
 *
 * @param conversionType Status for conversion types for example: ''null''
 * @param criteria Status for criteria for example: ''null''
 * @param ingestionSource Status for ingestion sources for example: ''null''
 * @param status Overall status for this selection item for example: ''null''
*/
final case class ConversionHealthSelectionItem (
  conversionType: Option[Any] = None,
  criteria: Option[Any] = None,
  ingestionSource: Option[Any] = None,
  status: AnyType
)


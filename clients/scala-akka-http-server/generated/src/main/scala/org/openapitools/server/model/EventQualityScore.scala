package org.openapitools.server.model


/**
 * Schema for GET Conversion EQS response.
 *
 * @param ingestionSource  for example: ''null''
 * @param lookbackPeriod  for example: ''null''
 * @param overallStatus  for example: ''null''
 * @param qualityComponents  for example: ''null''
 * @param sourcePlatform  for example: ''null''
*/
final case class EventQualityScore (
  ingestionSource: IngestionSourceOptions,
  lookbackPeriod: LookbackPeriodOptions,
  overallStatus: OverallStatusOptions,
  qualityComponents: QualityComponents,
  sourcePlatform: SourcePlatformOptions
)


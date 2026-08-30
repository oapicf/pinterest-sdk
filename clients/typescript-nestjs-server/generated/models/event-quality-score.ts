import { IngestionSourceOptions } from './ingestion-source-options';
import { OverallStatusOptions } from './overall-status-options';
import { QualityComponents } from './quality-components';
import { SourcePlatformOptions } from './source-platform-options';
import { LookbackPeriodOptions } from './lookback-period-options';


/**
 * Schema for GET Conversion EQS response.
 */
export interface EventQualityScore { 
  ingestion_source: IngestionSourceOptions;
  lookback_period: LookbackPeriodOptions;
  overall_status: OverallStatusOptions;
  quality_components: QualityComponents;
  source_platform: SourcePlatformOptions;
}
export namespace EventQualityScore {
}



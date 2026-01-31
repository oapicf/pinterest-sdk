
# Table `EventQualityScore`
(mapped from: EventQualityScore)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**ingestionSource** | ingestion_source | long NOT NULL |  | [**IngestionSourceOptions**](IngestionSourceOptions.md) |  |  [foreignkey]
**lookbackPeriod** | lookback_period | long NOT NULL |  | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) |  |  [foreignkey]
**overallStatus** | overall_status | long NOT NULL |  | [**OverallStatusOptions**](OverallStatusOptions.md) |  |  [foreignkey]
**qualityComponents** | quality_components | long NOT NULL |  | [**QualityComponents**](QualityComponents.md) |  |  [foreignkey]
**sourcePlatform** | source_platform | long NOT NULL |  | [**SourcePlatformOptions**](SourcePlatformOptions.md) |  |  [foreignkey]








-module(openapi_event_quality_score).

-export([encode/1]).

-export_type([openapi_event_quality_score/0]).

-type openapi_event_quality_score() ::
    #{ 'ingestion_source' := openapi_ingestion_source_options:openapi_ingestion_source_options(),
       'lookback_period' := openapi_lookback_period_options:openapi_lookback_period_options(),
       'overall_status' := openapi_overall_status_options:openapi_overall_status_options(),
       'quality_components' := openapi_quality_components:openapi_quality_components(),
       'source_platform' := openapi_source_platform_options:openapi_source_platform_options()
     }.

encode(#{ 'ingestion_source' := IngestionSource,
          'lookback_period' := LookbackPeriod,
          'overall_status' := OverallStatus,
          'quality_components' := QualityComponents,
          'source_platform' := SourcePlatform
        }) ->
    #{ 'ingestion_source' => IngestionSource,
       'lookback_period' => LookbackPeriod,
       'overall_status' => OverallStatus,
       'quality_components' => QualityComponents,
       'source_platform' => SourcePlatform
     }.

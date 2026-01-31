-module(openapi_event_quality_score).

-include("openapi.hrl").

-export([openapi_event_quality_score/0]).

-export([openapi_event_quality_score/1]).

-export_type([openapi_event_quality_score/0]).

-type openapi_event_quality_score() ::
  [ {'ingestion_source', openapi_ingestion_source_options:openapi_ingestion_source_options() }
  | {'lookback_period', openapi_lookback_period_options:openapi_lookback_period_options() }
  | {'overall_status', openapi_overall_status_options:openapi_overall_status_options() }
  | {'quality_components', openapi_quality_components:openapi_quality_components() }
  | {'source_platform', openapi_source_platform_options:openapi_source_platform_options() }
  ].


openapi_event_quality_score() ->
    openapi_event_quality_score([]).

openapi_event_quality_score(Fields) ->
  Default = [ {'ingestion_source', openapi_ingestion_source_options:openapi_ingestion_source_options() }
            , {'lookback_period', openapi_lookback_period_options:openapi_lookback_period_options() }
            , {'overall_status', openapi_overall_status_options:openapi_overall_status_options() }
            , {'quality_components', openapi_quality_components:openapi_quality_components() }
            , {'source_platform', openapi_source_platform_options:openapi_source_platform_options() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


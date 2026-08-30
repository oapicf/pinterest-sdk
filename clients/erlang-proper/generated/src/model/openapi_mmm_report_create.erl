-module(openapi_mmm_report_create).

-include("openapi.hrl").

-export([openapi_mmm_report_create/0]).

-export([openapi_mmm_report_create/1]).

-export_type([openapi_mmm_report_create/0]).

-type openapi_mmm_report_create() ::
  [ {'advertiser_ids', list(binary()) }
  | {'columns', list(openapi_m_mm_reporting_column:openapi_m_mm_reporting_column()) }
  | {'countries', list(openapi_targeting_advertiser_country:openapi_targeting_advertiser_country()) }
  | {'custom_column_ids', list(binary()) }
  | {'end_date', binary() }
  | {'granularity', openapi_m_mm_report_granularity:openapi_m_mm_report_granularity() }
  | {'level', openapi_m_mm_report_level:openapi_m_mm_report_level() }
  | {'report_name', binary() }
  | {'start_date', binary() }
  | {'targeting_types', list(openapi_m_mm_reporting_targeting_type:openapi_m_mm_reporting_targeting_type()) }
  ].


openapi_mmm_report_create() ->
    openapi_mmm_report_create([]).

openapi_mmm_report_create(Fields) ->
  Default = [ {'advertiser_ids', list(binary()) }
            , {'columns', list(openapi_m_mm_reporting_column:openapi_m_mm_reporting_column()) }
            , {'countries', list(openapi_targeting_advertiser_country:openapi_targeting_advertiser_country()) }
            , {'custom_column_ids', list(binary()) }
            , {'end_date', binary() }
            , {'granularity', openapi_m_mm_report_granularity:openapi_m_mm_report_granularity() }
            , {'level', openapi_m_mm_report_level:openapi_m_mm_report_level() }
            , {'report_name', binary() }
            , {'start_date', binary() }
            , {'targeting_types', list(openapi_m_mm_reporting_targeting_type:openapi_m_mm_reporting_targeting_type(), 1, 7) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


-module(openapi_create_mmm_report_request).

-include("openapi.hrl").

-export([openapi_create_mmm_report_request/0]).

-export([openapi_create_mmm_report_request/1]).

-export_type([openapi_create_mmm_report_request/0]).

-type openapi_create_mmm_report_request() ::
  [ {'report_name', binary() }
  | {'start_date', binary() }
  | {'end_date', binary() }
  | {'granularity', binary() }
  | {'level', binary() }
  | {'targeting_types', list(openapi_m_mm_reporting_targeting_type:openapi_m_mm_reporting_targeting_type()) }
  | {'columns', list(openapi_m_mm_reporting_column:openapi_m_mm_reporting_column()) }
  | {'countries', list(openapi_targeting_advertiser_country:openapi_targeting_advertiser_country()) }
  ].


openapi_create_mmm_report_request() ->
    openapi_create_mmm_report_request([]).

openapi_create_mmm_report_request(Fields) ->
  Default = [ {'report_name', binary() }
            , {'start_date', binary() }
            , {'end_date', binary() }
            , {'granularity', elements([<<"DAY">>, <<"WEEK">>]) }
            , {'level', elements([<<"CAMPAIGN_TARGETING">>, <<"AD_GROUP_TARGETING">>]) }
            , {'targeting_types', list(openapi_m_mm_reporting_targeting_type:openapi_m_mm_reporting_targeting_type(), 1, 5) }
            , {'columns', list(openapi_m_mm_reporting_column:openapi_m_mm_reporting_column()) }
            , {'countries', list(openapi_targeting_advertiser_country:openapi_targeting_advertiser_country()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


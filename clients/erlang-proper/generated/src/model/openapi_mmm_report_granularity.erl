-module(openapi_mmm_report_granularity).

-include("openapi.hrl").

-export([openapi_mmm_report_granularity/0]).

-export_type([openapi_mmm_report_granularity/0]).

-type openapi_mmm_report_granularity() ::
  binary().

openapi_mmm_report_granularity() ->
  elements([<<"DAY">>, <<"WEEK">>]).


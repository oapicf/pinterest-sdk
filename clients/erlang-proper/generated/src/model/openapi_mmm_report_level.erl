-module(openapi_mmm_report_level).

-include("openapi.hrl").

-export([openapi_mmm_report_level/0]).

-export_type([openapi_mmm_report_level/0]).

-type openapi_mmm_report_level() ::
  binary().

openapi_mmm_report_level() ->
  elements([<<"CAMPAIGN_TARGETING">>, <<"AD_GROUP_TARGETING">>]).


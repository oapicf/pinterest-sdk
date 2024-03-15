-module(openapi_mmm_reporting_targeting_type).

-include("openapi.hrl").

-export([openapi_mmm_reporting_targeting_type/0]).

-export_type([openapi_mmm_reporting_targeting_type/0]).

-type openapi_mmm_reporting_targeting_type() ::
  binary().

openapi_mmm_reporting_targeting_type() ->
  elements([<<"APPTYPE">>, <<"COUNTRY">>, <<"CREATIVE_TYPE">>, <<"GENDER">>, <<"LOCATION">>]).


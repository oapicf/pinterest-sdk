-module(openapi_trends_gender_filter).

-include("openapi.hrl").

-export([openapi_trends_gender_filter/0]).

-export_type([openapi_trends_gender_filter/0]).

-type openapi_trends_gender_filter() ::
  binary().

openapi_trends_gender_filter() ->
  elements([<<"male">>, <<"female">>, <<"unknown">>]).


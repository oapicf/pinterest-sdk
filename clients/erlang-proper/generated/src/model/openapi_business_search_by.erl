-module(openapi_business_search_by).

-include("openapi.hrl").

-export([openapi_business_search_by/0]).

-export_type([openapi_business_search_by/0]).

-type openapi_business_search_by() ::
  binary().

openapi_business_search_by() ->
  elements([<<"FULL_NAME">>, <<"USERNAME">>, <<"BUSINESS_ID">>, <<"EMAIL">>]).


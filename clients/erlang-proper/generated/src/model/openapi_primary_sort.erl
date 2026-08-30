-module(openapi_primary_sort).

-include("openapi.hrl").

-export([openapi_primary_sort/0]).

-export_type([openapi_primary_sort/0]).

-type openapi_primary_sort() ::
  binary().

openapi_primary_sort() ->
  elements([<<"BY_ID">>, <<"BY_DATE">>]).


-module(openapi_query_label_types_items).

-include("openapi.hrl").

-export([openapi_query_label_types_items/0]).

-export_type([openapi_query_label_types_items/0]).

-type openapi_query_label_types_items() ::
  binary().

openapi_query_label_types_items() ->
  elements([<<"BRAND">>, <<"CUSTOM">>]).


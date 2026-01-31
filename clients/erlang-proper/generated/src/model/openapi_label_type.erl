-module(openapi_label_type).

-include("openapi.hrl").

-export([openapi_label_type/0]).

-export_type([openapi_label_type/0]).

-type openapi_label_type() ::
  binary().

openapi_label_type() ->
  elements([<<"BRAND">>, <<"CUSTOM">>, <<"">>]).


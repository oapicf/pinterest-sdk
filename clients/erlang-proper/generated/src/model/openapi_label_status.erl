-module(openapi_label_status).

-include("openapi.hrl").

-export([openapi_label_status/0]).

-export_type([openapi_label_status/0]).

-type openapi_label_status() ::
  binary().

openapi_label_status() ->
  elements([<<"ACTIVE">>, <<"ARCHIVED">>]).


-module(openapi_nullable_label_status).

-include("openapi.hrl").

-export([openapi_nullable_label_status/0]).

-export_type([openapi_nullable_label_status/0]).

-type openapi_nullable_label_status() ::
  binary().

openapi_nullable_label_status() ->
  elements([<<"ACTIVE">>, <<"ARCHIVED">>, <<"">>]).


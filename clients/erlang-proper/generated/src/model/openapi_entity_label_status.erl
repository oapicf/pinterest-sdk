-module(openapi_entity_label_status).

-include("openapi.hrl").

-export([openapi_entity_label_status/0]).

-export_type([openapi_entity_label_status/0]).

-type openapi_entity_label_status() ::
  binary().

openapi_entity_label_status() ->
  elements([<<"ACTIVE">>, <<"ARCHIVED">>, <<"NULL">>]).


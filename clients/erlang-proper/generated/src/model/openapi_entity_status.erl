-module(openapi_entity_status).

-include("openapi.hrl").

-export([openapi_entity_status/0]).

-export_type([openapi_entity_status/0]).

-type openapi_entity_status() ::
  binary().

openapi_entity_status() ->
  elements([<<"ACTIVE">>, <<"PAUSED">>, <<"ARCHIVED">>, <<"DRAFT">>, <<"DELETED_DRAFT">>]).


-module(openapi_non_draft_entity_status).

-include("openapi.hrl").

-export([openapi_non_draft_entity_status/0]).

-export_type([openapi_non_draft_entity_status/0]).

-type openapi_non_draft_entity_status() ::
  binary().

openapi_non_draft_entity_status() ->
  elements([<<"ACTIVE">>, <<"PAUSED">>, <<"ARCHIVED">>]).


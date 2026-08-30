-module(openapi_query_label_entity_statuses_items).

-include("openapi.hrl").

-export([openapi_query_label_entity_statuses_items/0]).

-export_type([openapi_query_label_entity_statuses_items/0]).

-type openapi_query_label_entity_statuses_items() ::
  binary().

openapi_query_label_entity_statuses_items() ->
  elements([<<"ACTIVE">>, <<"ARCHIVED">>]).


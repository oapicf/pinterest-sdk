-module(openapi_bulk_entity_type).

-include("openapi.hrl").

-export([openapi_bulk_entity_type/0]).

-export_type([openapi_bulk_entity_type/0]).

-type openapi_bulk_entity_type() ::
  binary().

openapi_bulk_entity_type() ->
  elements([<<"CAMPAIGN">>, <<"AD_GROUP">>, <<"PRODUCT_GROUP">>, <<"AD">>, <<"KEYWORD">>]).


-module(openapi_item_availability).

-include("openapi.hrl").

-export([openapi_item_availability/0]).

-export_type([openapi_item_availability/0]).

-type openapi_item_availability() ::
  binary().

openapi_item_availability() ->
  elements([<<"in stock">>, <<"out of stock">>, <<"preorder">>]).


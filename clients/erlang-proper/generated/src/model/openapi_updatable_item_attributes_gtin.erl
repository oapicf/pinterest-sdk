-module(openapi_updatable_item_attributes_gtin).

-include("openapi.hrl").

-export([openapi_updatable_item_attributes_gtin/0]).

-export([openapi_updatable_item_attributes_gtin/1]).

-export_type([openapi_updatable_item_attributes_gtin/0]).

-type openapi_updatable_item_attributes_gtin() ::
  [ 
  ].


openapi_updatable_item_attributes_gtin() ->
    openapi_updatable_item_attributes_gtin([]).

openapi_updatable_item_attributes_gtin(Fields) ->
  Default = [ 
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


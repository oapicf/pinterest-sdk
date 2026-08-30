-module(openapi_local_inventory_items_get).

-include("openapi.hrl").

-export([openapi_local_inventory_items_get/0]).

-export([openapi_local_inventory_items_get/1]).

-export_type([openapi_local_inventory_items_get/0]).

-type openapi_local_inventory_items_get() ::
  [ {'items', list(openapi_local_inventory_item_response:openapi_local_inventory_item_response()) }
  ].


openapi_local_inventory_items_get() ->
    openapi_local_inventory_items_get([]).

openapi_local_inventory_items_get(Fields) ->
  Default = [ {'items', list(openapi_local_inventory_item_response:openapi_local_inventory_item_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


-module(openapi_local_inventory_items_get_create).

-include("openapi.hrl").

-export([openapi_local_inventory_items_get_create/0]).

-export([openapi_local_inventory_items_get_create/1]).

-export_type([openapi_local_inventory_items_get_create/0]).

-type openapi_local_inventory_items_get_create() ::
  [ {'item_filters', list(openapi_item_id_store_code_pair:openapi_item_id_store_code_pair()) }
  ].


openapi_local_inventory_items_get_create() ->
    openapi_local_inventory_items_get_create([]).

openapi_local_inventory_items_get_create(Fields) ->
  Default = [ {'item_filters', list(openapi_item_id_store_code_pair:openapi_item_id_store_code_pair(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


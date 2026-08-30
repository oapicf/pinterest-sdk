-module(openapi_local_inventory_items_batch_create).

-include("openapi.hrl").

-export([openapi_local_inventory_items_batch_create/0]).

-export([openapi_local_inventory_items_batch_create/1]).

-export_type([openapi_local_inventory_items_batch_create/0]).

-type openapi_local_inventory_items_batch_create() ::
  [ {'operations', list(openapi_local_inventory_operation:openapi_local_inventory_operation()) }
  ].


openapi_local_inventory_items_batch_create() ->
    openapi_local_inventory_items_batch_create([]).

openapi_local_inventory_items_batch_create(Fields) ->
  Default = [ {'operations', list(openapi_local_inventory_operation:openapi_local_inventory_operation(), 1, 1000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


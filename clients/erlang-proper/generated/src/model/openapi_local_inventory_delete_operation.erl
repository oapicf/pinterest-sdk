-module(openapi_local_inventory_delete_operation).

-include("openapi.hrl").

-export([openapi_local_inventory_delete_operation/0]).

-export([openapi_local_inventory_delete_operation/1]).

-export_type([openapi_local_inventory_delete_operation/0]).

-type openapi_local_inventory_delete_operation() ::
  [ {'item_id', binary() }
  | {'operation', binary() }
  | {'store_code', binary() }
  ].


openapi_local_inventory_delete_operation() ->
    openapi_local_inventory_delete_operation([]).

openapi_local_inventory_delete_operation(Fields) ->
  Default = [ {'item_id', binary() }
            , {'operation', elements([<<"DELETE">>]) }
            , {'store_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


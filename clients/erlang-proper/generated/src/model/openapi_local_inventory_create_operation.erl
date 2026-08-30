-module(openapi_local_inventory_create_operation).

-include("openapi.hrl").

-export([openapi_local_inventory_create_operation/0]).

-export([openapi_local_inventory_create_operation/1]).

-export_type([openapi_local_inventory_create_operation/0]).

-type openapi_local_inventory_create_operation() ::
  [ {'attributes', openapi_retail_local_inventory_item_attributes:openapi_retail_local_inventory_item_attributes() }
  | {'item_id', binary() }
  | {'operation', binary() }
  | {'store_code', binary() }
  ].


openapi_local_inventory_create_operation() ->
    openapi_local_inventory_create_operation([]).

openapi_local_inventory_create_operation(Fields) ->
  Default = [ {'attributes', openapi_retail_local_inventory_item_attributes:openapi_retail_local_inventory_item_attributes() }
            , {'item_id', binary() }
            , {'operation', elements([<<"CREATE">>]) }
            , {'store_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


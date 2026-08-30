-module(openapi_local_inventory_update_operation).

-include("openapi.hrl").

-export([openapi_local_inventory_update_operation/0]).

-export([openapi_local_inventory_update_operation/1]).

-export_type([openapi_local_inventory_update_operation/0]).

-type openapi_local_inventory_update_operation() ::
  [ {'attributes', openapi_retail_local_inventory_item_attributes_optional:openapi_retail_local_inventory_item_attributes_optional() }
  | {'item_id', binary() }
  | {'operation', binary() }
  | {'store_code', binary() }
  ].


openapi_local_inventory_update_operation() ->
    openapi_local_inventory_update_operation([]).

openapi_local_inventory_update_operation(Fields) ->
  Default = [ {'attributes', openapi_retail_local_inventory_item_attributes_optional:openapi_retail_local_inventory_item_attributes_optional() }
            , {'item_id', binary() }
            , {'operation', elements([<<"UPDATE">>]) }
            , {'store_code', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


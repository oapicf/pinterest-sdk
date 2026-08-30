-module(openapi_retail_local_inventory_item_attributes).

-include("openapi.hrl").

-export([openapi_retail_local_inventory_item_attributes/0]).

-export([openapi_retail_local_inventory_item_attributes/1]).

-export_type([openapi_retail_local_inventory_item_attributes/0]).

-type openapi_retail_local_inventory_item_attributes() ::
  [ {'ad_link', binary() }
  | {'availability', openapi_item_availability:openapi_item_availability() }
  | {'price', binary() }
  | {'sale_price', binary() }
  ].


openapi_retail_local_inventory_item_attributes() ->
    openapi_retail_local_inventory_item_attributes([]).

openapi_retail_local_inventory_item_attributes(Fields) ->
  Default = [ {'ad_link', binary() }
            , {'availability', openapi_item_availability:openapi_item_availability() }
            , {'price', binary() }
            , {'sale_price', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


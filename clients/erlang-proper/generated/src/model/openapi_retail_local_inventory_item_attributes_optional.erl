-module(openapi_retail_local_inventory_item_attributes_optional).

-include("openapi.hrl").

-export([openapi_retail_local_inventory_item_attributes_optional/0]).

-export([openapi_retail_local_inventory_item_attributes_optional/1]).

-export_type([openapi_retail_local_inventory_item_attributes_optional/0]).

-type openapi_retail_local_inventory_item_attributes_optional() ::
  [ {'ad_link', binary() }
  | {'availability', openapi_item_availability:openapi_item_availability() }
  | {'price', binary() }
  | {'sale_price', binary() }
  ].


openapi_retail_local_inventory_item_attributes_optional() ->
    openapi_retail_local_inventory_item_attributes_optional([]).

openapi_retail_local_inventory_item_attributes_optional(Fields) ->
  Default = [ {'ad_link', binary() }
            , {'availability', openapi_item_availability:openapi_item_availability() }
            , {'price', binary() }
            , {'sale_price', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


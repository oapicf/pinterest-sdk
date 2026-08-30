-module(openapi_local_inventory_item_response).

-include("openapi.hrl").

-export([openapi_local_inventory_item_response/0]).

-export([openapi_local_inventory_item_response/1]).

-export_type([openapi_local_inventory_item_response/0]).

-type openapi_local_inventory_item_response() ::
  [ {'ad_link', binary() }
  | {'availability', openapi_item_availability:openapi_item_availability() }
  | {'created_at', integer() }
  | {'item_id', binary() }
  | {'last_updated_time', integer() }
  | {'price', binary() }
  | {'sale_price', binary() }
  | {'store_metadata', openapi_store_metadata:openapi_store_metadata() }
  ].


openapi_local_inventory_item_response() ->
    openapi_local_inventory_item_response([]).

openapi_local_inventory_item_response(Fields) ->
  Default = [ {'ad_link', binary() }
            , {'availability', openapi_item_availability:openapi_item_availability() }
            , {'created_at', integer() }
            , {'item_id', binary() }
            , {'last_updated_time', integer() }
            , {'price', binary() }
            , {'sale_price', binary() }
            , {'store_metadata', openapi_store_metadata:openapi_store_metadata() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


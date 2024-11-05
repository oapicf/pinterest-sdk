-module(openapi_advanced_auction_items_submit_request).

-include("openapi.hrl").

-export([openapi_advanced_auction_items_submit_request/0]).

-export([openapi_advanced_auction_items_submit_request/1]).

-export_type([openapi_advanced_auction_items_submit_request/0]).

-type openapi_advanced_auction_items_submit_request() ::
  [ {'catalog_id', binary() }
  | {'items', list(openapi_advanced_auction_items_submit_record:openapi_advanced_auction_items_submit_record()) }
  ].


openapi_advanced_auction_items_submit_request() ->
    openapi_advanced_auction_items_submit_request([]).

openapi_advanced_auction_items_submit_request(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'items', list(openapi_advanced_auction_items_submit_record:openapi_advanced_auction_items_submit_record(), 1, 10000) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


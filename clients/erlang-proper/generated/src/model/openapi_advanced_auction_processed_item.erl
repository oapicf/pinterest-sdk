-module(openapi_advanced_auction_processed_item).

-include("openapi.hrl").

-export([openapi_advanced_auction_processed_item/0]).

-export([openapi_advanced_auction_processed_item/1]).

-export_type([openapi_advanced_auction_processed_item/0]).

-type openapi_advanced_auction_processed_item() ::
  [ {'operation', openapi_advanced_auction_operation:openapi_advanced_auction_operation() }
  | {'item_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_language:openapi_language() }
  | {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
  | {'update_mask', list(openapi_update_mask_bid_option_field:openapi_update_mask_bid_option_field()) }
  | {'errors', list(openapi_advanced_auction_operation_error:openapi_advanced_auction_operation_error()) }
  ].


openapi_advanced_auction_processed_item() ->
    openapi_advanced_auction_processed_item([]).

openapi_advanced_auction_processed_item(Fields) ->
  Default = [ {'operation', openapi_advanced_auction_operation:openapi_advanced_auction_operation() }
            , {'item_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_language:openapi_language() }
            , {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
            , {'update_mask', list(openapi_update_mask_bid_option_field:openapi_update_mask_bid_option_field()) }
            , {'errors', list(openapi_advanced_auction_operation_error:openapi_advanced_auction_operation_error()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


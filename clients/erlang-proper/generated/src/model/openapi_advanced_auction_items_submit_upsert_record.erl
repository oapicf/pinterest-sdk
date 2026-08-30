-module(openapi_advanced_auction_items_submit_upsert_record).

-include("openapi.hrl").

-export([openapi_advanced_auction_items_submit_upsert_record/0]).

-export([openapi_advanced_auction_items_submit_upsert_record/1]).

-export_type([openapi_advanced_auction_items_submit_upsert_record/0]).

-type openapi_advanced_auction_items_submit_upsert_record() ::
  [ {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
  | {'country', openapi_country:openapi_country() }
  | {'errors', list(openapi_advanced_auction_operation_error:openapi_advanced_auction_operation_error()) }
  | {'item_id', binary() }
  | {'language', openapi_language:openapi_language() }
  | {'operation', binary() }
  | {'update_mask', list(openapi_update_mask_bid_option_field:openapi_update_mask_bid_option_field()) }
  ].


openapi_advanced_auction_items_submit_upsert_record() ->
    openapi_advanced_auction_items_submit_upsert_record([]).

openapi_advanced_auction_items_submit_upsert_record(Fields) ->
  Default = [ {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
            , {'country', openapi_country:openapi_country() }
            , {'errors', list(openapi_advanced_auction_operation_error:openapi_advanced_auction_operation_error()) }
            , {'item_id', binary() }
            , {'language', openapi_language:openapi_language() }
            , {'operation', elements([<<"UPSERT">>]) }
            , {'update_mask', list(openapi_update_mask_bid_option_field:openapi_update_mask_bid_option_field()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


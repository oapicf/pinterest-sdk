-module(openapi_advanced_auction_items_submit_upsert_record).

-include("openapi.hrl").

-export([openapi_advanced_auction_items_submit_upsert_record/0]).

-export([openapi_advanced_auction_items_submit_upsert_record/1]).

-export_type([openapi_advanced_auction_items_submit_upsert_record/0]).

-type openapi_advanced_auction_items_submit_upsert_record() ::
  [ {'item_id', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'language', openapi_language:openapi_language() }
  | {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
  | {'update_mask', list(openapi_update_mask_bid_option_field:openapi_update_mask_bid_option_field()) }
  ].


openapi_advanced_auction_items_submit_upsert_record() ->
    openapi_advanced_auction_items_submit_upsert_record([]).

openapi_advanced_auction_items_submit_upsert_record(Fields) ->
  Default = [ {'item_id', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'language', openapi_language:openapi_language() }
            , {'bid_options', openapi_advanced_auction_bid_options:openapi_advanced_auction_bid_options() }
            , {'update_mask', list(openapi_update_mask_bid_option_field:openapi_update_mask_bid_option_field()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


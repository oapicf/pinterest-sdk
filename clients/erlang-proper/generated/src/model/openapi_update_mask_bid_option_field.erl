-module(openapi_update_mask_bid_option_field).

-include("openapi.hrl").

-export([openapi_update_mask_bid_option_field/0]).

-export_type([openapi_update_mask_bid_option_field/0]).

-type openapi_update_mask_bid_option_field() ::
  binary().

openapi_update_mask_bid_option_field() ->
  elements([<<"BID">>, <<"APP_TYPE_BID_MULTIPLIER_SET">>, <<"PLACEMENT_BID_MULTIPLIER_SET">>]).


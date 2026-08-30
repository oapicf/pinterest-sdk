-module(openapi_campaign_bid_options_update_mask_items).

-include("openapi.hrl").

-export([openapi_campaign_bid_options_update_mask_items/0]).

-export_type([openapi_campaign_bid_options_update_mask_items/0]).

-type openapi_campaign_bid_options_update_mask_items() ::
  binary().

openapi_campaign_bid_options_update_mask_items() ->
  elements([<<"AUDIENCE">>, <<"APP_TYPE">>, <<"PLACEMENT">>, <<"GENDER">>, <<"AGE_BUCKET">>, <<"FREQUENCY">>]).


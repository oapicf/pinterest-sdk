-module(openapi_campaign_bid_options_update).

-include("openapi.hrl").

-export([openapi_campaign_bid_options_update/0]).

-export([openapi_campaign_bid_options_update/1]).

-export_type([openapi_campaign_bid_options_update/0]).

-type openapi_campaign_bid_options_update() ::
  [ {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
  | {'audience_multipliers', openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers() }
  | {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
  | {'update_mask', list(binary()) }
  ].


openapi_campaign_bid_options_update() ->
    openapi_campaign_bid_options_update([]).

openapi_campaign_bid_options_update(Fields) ->
  Default = [ {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
            , {'audience_multipliers', openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers() }
            , {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
            , {'update_mask', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


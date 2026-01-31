-module(openapi_campaign_bid_options_create).

-include("openapi.hrl").

-export([openapi_campaign_bid_options_create/0]).

-export([openapi_campaign_bid_options_create/1]).

-export_type([openapi_campaign_bid_options_create/0]).

-type openapi_campaign_bid_options_create() ::
  [ {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
  | {'audience_multipliers', openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers() }
  | {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
  ].


openapi_campaign_bid_options_create() ->
    openapi_campaign_bid_options_create([]).

openapi_campaign_bid_options_create(Fields) ->
  Default = [ {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
            , {'audience_multipliers', openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers() }
            , {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


-module(openapi_campaign_bid_options_update).

-include("openapi.hrl").

-export([openapi_campaign_bid_options_update/0]).

-export([openapi_campaign_bid_options_update/1]).

-export_type([openapi_campaign_bid_options_update/0]).

-type openapi_campaign_bid_options_update() ::
  [ {'age_bucket_multipliers', openapi_age_bucket_multipliers:openapi_age_bucket_multipliers() }
  | {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
  | {'audience_multipliers', openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers() }
  | {'freq_bid_multiplier_time_window', openapi_freq_bid_multiplier_time_window:openapi_freq_bid_multiplier_time_window() }
  | {'frequency_multipliers', openapi_frequency_multipliers:openapi_frequency_multipliers() }
  | {'gender_multipliers', openapi_gender_multipliers:openapi_gender_multipliers() }
  | {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
  | {'update_mask', list(openapi_campaign_bid_options_update_mask_items:openapi_campaign_bid_options_update_mask_items()) }
  ].


openapi_campaign_bid_options_update() ->
    openapi_campaign_bid_options_update([]).

openapi_campaign_bid_options_update(Fields) ->
  Default = [ {'age_bucket_multipliers', openapi_age_bucket_multipliers:openapi_age_bucket_multipliers() }
            , {'app_type_multipliers', openapi_app_type_multipliers:openapi_app_type_multipliers() }
            , {'audience_multipliers', openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers() }
            , {'freq_bid_multiplier_time_window', openapi_freq_bid_multiplier_time_window:openapi_freq_bid_multiplier_time_window() }
            , {'frequency_multipliers', openapi_frequency_multipliers:openapi_frequency_multipliers() }
            , {'gender_multipliers', openapi_gender_multipliers:openapi_gender_multipliers() }
            , {'placement_multipliers', openapi_placement_multipliers:openapi_placement_multipliers() }
            , {'update_mask', list(openapi_campaign_bid_options_update_mask_items:openapi_campaign_bid_options_update_mask_items()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


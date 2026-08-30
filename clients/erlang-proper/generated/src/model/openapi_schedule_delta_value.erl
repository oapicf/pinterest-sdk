-module(openapi_schedule_delta_value).

-include("openapi.hrl").

-export([openapi_schedule_delta_value/0]).

-export([openapi_schedule_delta_value/1]).

-export_type([openapi_schedule_delta_value/0]).

-type openapi_schedule_delta_value() ::
  [ {'age_bucket_multipliers', openapi_bid_options_age_bucket_multipliers:openapi_bid_options_age_bucket_multipliers() }
  | {'app_type_multipliers', openapi_bid_options_app_type_multipliers:openapi_bid_options_app_type_multipliers() }
  | {'audience_multipliers', list(openapi_bid_options_audience_multipliers:openapi_bid_options_audience_multipliers()) }
  | {'gender_multipliers', openapi_bid_options_gender_multipliers:openapi_bid_options_gender_multipliers() }
  | {'placement_multipliers', openapi_bid_options_placement_multipliers:openapi_bid_options_placement_multipliers() }
  ].


openapi_schedule_delta_value() ->
    openapi_schedule_delta_value([]).

openapi_schedule_delta_value(Fields) ->
  Default = [ {'age_bucket_multipliers', openapi_bid_options_age_bucket_multipliers:openapi_bid_options_age_bucket_multipliers() }
            , {'app_type_multipliers', openapi_bid_options_app_type_multipliers:openapi_bid_options_app_type_multipliers() }
            , {'audience_multipliers', list(openapi_bid_options_audience_multipliers:openapi_bid_options_audience_multipliers()) }
            , {'gender_multipliers', openapi_bid_options_gender_multipliers:openapi_bid_options_gender_multipliers() }
            , {'placement_multipliers', openapi_bid_options_placement_multipliers:openapi_bid_options_placement_multipliers() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


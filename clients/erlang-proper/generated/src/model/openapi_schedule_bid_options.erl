-module(openapi_schedule_bid_options).

-include("openapi.hrl").

-export([openapi_schedule_bid_options/0]).

-export([openapi_schedule_bid_options/1]).

-export_type([openapi_schedule_bid_options/0]).

-type openapi_schedule_bid_options() ::
  [ {'age_bucket_multipliers', openapi_schedule_age_bucket_multipliers:openapi_schedule_age_bucket_multipliers() }
  | {'app_type_multipliers', openapi_schedule_app_type_multipliers:openapi_schedule_app_type_multipliers() }
  | {'audience_multipliers', openapi_schedule_audience_multipliers:openapi_schedule_audience_multipliers() }
  | {'gender_multipliers', openapi_schedule_bid_options_gender_multipliers:openapi_schedule_bid_options_gender_multipliers() }
  | {'placement_multipliers', openapi_schedule_bid_options_placement_multipliers:openapi_schedule_bid_options_placement_multipliers() }
  ].


openapi_schedule_bid_options() ->
    openapi_schedule_bid_options([]).

openapi_schedule_bid_options(Fields) ->
  Default = [ {'age_bucket_multipliers', openapi_schedule_age_bucket_multipliers:openapi_schedule_age_bucket_multipliers() }
            , {'app_type_multipliers', openapi_schedule_app_type_multipliers:openapi_schedule_app_type_multipliers() }
            , {'audience_multipliers', openapi_schedule_audience_multipliers:openapi_schedule_audience_multipliers() }
            , {'gender_multipliers', openapi_schedule_bid_options_gender_multipliers:openapi_schedule_bid_options_gender_multipliers() }
            , {'placement_multipliers', openapi_schedule_bid_options_placement_multipliers:openapi_schedule_bid_options_placement_multipliers() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).


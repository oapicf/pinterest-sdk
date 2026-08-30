-module(openapi_schedule_bid_options).

-export([encode/1]).

-export_type([openapi_schedule_bid_options/0]).

-type openapi_schedule_bid_options() ::
    #{ 'age_bucket_multipliers' => openapi_schedule_age_bucket_multipliers:openapi_schedule_age_bucket_multipliers(),
       'app_type_multipliers' => openapi_schedule_app_type_multipliers:openapi_schedule_app_type_multipliers(),
       'audience_multipliers' => openapi_schedule_audience_multipliers:openapi_schedule_audience_multipliers(),
       'gender_multipliers' => openapi_schedule_bid_options_gender_multipliers:openapi_schedule_bid_options_gender_multipliers(),
       'placement_multipliers' => openapi_schedule_bid_options_placement_multipliers:openapi_schedule_bid_options_placement_multipliers()
     }.

encode(#{ 'age_bucket_multipliers' := AgeBucketMultipliers,
          'app_type_multipliers' := AppTypeMultipliers,
          'audience_multipliers' := AudienceMultipliers,
          'gender_multipliers' := GenderMultipliers,
          'placement_multipliers' := PlacementMultipliers
        }) ->
    #{ 'age_bucket_multipliers' => AgeBucketMultipliers,
       'app_type_multipliers' => AppTypeMultipliers,
       'audience_multipliers' => AudienceMultipliers,
       'gender_multipliers' => GenderMultipliers,
       'placement_multipliers' => PlacementMultipliers
     }.

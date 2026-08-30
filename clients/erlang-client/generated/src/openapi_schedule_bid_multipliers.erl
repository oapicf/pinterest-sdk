-module(openapi_schedule_bid_multipliers).

-export([encode/1]).

-export_type([openapi_schedule_bid_multipliers/0]).

-type openapi_schedule_bid_multipliers() ::
    #{ 'age_bucket_multipliers' => openapi_bid_options_age_bucket_multipliers:openapi_bid_options_age_bucket_multipliers(),
       'app_type_multipliers' => openapi_bid_options_app_type_multipliers:openapi_bid_options_app_type_multipliers(),
       'audience_multipliers' => list(),
       'gender_multipliers' => openapi_bid_options_gender_multipliers:openapi_bid_options_gender_multipliers(),
       'placement_multipliers' => openapi_bid_options_placement_multipliers:openapi_bid_options_placement_multipliers()
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

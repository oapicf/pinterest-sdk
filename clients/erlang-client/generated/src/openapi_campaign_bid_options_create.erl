-module(openapi_campaign_bid_options_create).

-export([encode/1]).

-export_type([openapi_campaign_bid_options_create/0]).

-type openapi_campaign_bid_options_create() ::
    #{ 'age_bucket_multipliers' => openapi_age_bucket_multipliers:openapi_age_bucket_multipliers(),
       'app_type_multipliers' => openapi_app_type_multipliers:openapi_app_type_multipliers(),
       'audience_multipliers' => openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers(),
       'freq_bid_multiplier_time_window' => openapi_freq_bid_multiplier_time_window:openapi_freq_bid_multiplier_time_window(),
       'frequency_multipliers' => openapi_frequency_multipliers:openapi_frequency_multipliers(),
       'gender_multipliers' => openapi_gender_multipliers:openapi_gender_multipliers(),
       'placement_multipliers' => openapi_placement_multipliers:openapi_placement_multipliers()
     }.

encode(#{ 'age_bucket_multipliers' := AgeBucketMultipliers,
          'app_type_multipliers' := AppTypeMultipliers,
          'audience_multipliers' := AudienceMultipliers,
          'freq_bid_multiplier_time_window' := FreqBidMultiplierTimeWindow,
          'frequency_multipliers' := FrequencyMultipliers,
          'gender_multipliers' := GenderMultipliers,
          'placement_multipliers' := PlacementMultipliers
        }) ->
    #{ 'age_bucket_multipliers' => AgeBucketMultipliers,
       'app_type_multipliers' => AppTypeMultipliers,
       'audience_multipliers' => AudienceMultipliers,
       'freq_bid_multiplier_time_window' => FreqBidMultiplierTimeWindow,
       'frequency_multipliers' => FrequencyMultipliers,
       'gender_multipliers' => GenderMultipliers,
       'placement_multipliers' => PlacementMultipliers
     }.

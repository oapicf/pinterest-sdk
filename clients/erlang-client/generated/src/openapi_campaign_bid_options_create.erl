-module(openapi_campaign_bid_options_create).

-export([encode/1]).

-export_type([openapi_campaign_bid_options_create/0]).

-type openapi_campaign_bid_options_create() ::
    #{ 'app_type_multipliers' => openapi_app_type_multipliers:openapi_app_type_multipliers(),
       'audience_multipliers' => openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers(),
       'placement_multipliers' => openapi_placement_multipliers:openapi_placement_multipliers()
     }.

encode(#{ 'app_type_multipliers' := AppTypeMultipliers,
          'audience_multipliers' := AudienceMultipliers,
          'placement_multipliers' := PlacementMultipliers
        }) ->
    #{ 'app_type_multipliers' => AppTypeMultipliers,
       'audience_multipliers' => AudienceMultipliers,
       'placement_multipliers' => PlacementMultipliers
     }.

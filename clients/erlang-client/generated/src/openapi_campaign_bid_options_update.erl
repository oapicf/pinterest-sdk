-module(openapi_campaign_bid_options_update).

-export([encode/1]).

-export_type([openapi_campaign_bid_options_update/0]).

-type openapi_campaign_bid_options_update() ::
    #{ 'app_type_multipliers' => openapi_app_type_multipliers:openapi_app_type_multipliers(),
       'audience_multipliers' => openapi_campaign_audience_multipliers:openapi_campaign_audience_multipliers(),
       'placement_multipliers' => openapi_placement_multipliers:openapi_placement_multipliers(),
       'update_mask' := list()
     }.

encode(#{ 'app_type_multipliers' := AppTypeMultipliers,
          'audience_multipliers' := AudienceMultipliers,
          'placement_multipliers' := PlacementMultipliers,
          'update_mask' := UpdateMask
        }) ->
    #{ 'app_type_multipliers' => AppTypeMultipliers,
       'audience_multipliers' => AudienceMultipliers,
       'placement_multipliers' => PlacementMultipliers,
       'update_mask' => UpdateMask
     }.

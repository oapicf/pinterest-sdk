-module(openapi_performance_plus_campaign_settings).

-export([encode/1]).

-export_type([openapi_performance_plus_campaign_settings/0]).

-type openapi_performance_plus_campaign_settings() ::
    #{ 'boost_prospecting_ad_group_bid' => boolean(),
       'pinner_list_exclusions' => list()
     }.

encode(#{ 'boost_prospecting_ad_group_bid' := BoostProspectingAdGroupBid,
          'pinner_list_exclusions' := PinnerListExclusions
        }) ->
    #{ 'boost_prospecting_ad_group_bid' => BoostProspectingAdGroupBid,
       'pinner_list_exclusions' => PinnerListExclusions
     }.

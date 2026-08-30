-module(openapi_campaign_planning_ad_group_audience_size).

-export([encode/1]).

-export_type([openapi_campaign_planning_ad_group_audience_size/0]).

-type openapi_campaign_planning_ad_group_audience_size() ::
    #{ 'count_lower' => integer(),
       'count_upper' => integer()
     }.

encode(#{ 'count_lower' := CountLower,
          'count_upper' := CountUpper
        }) ->
    #{ 'count_lower' => CountLower,
       'count_upper' => CountUpper
     }.
